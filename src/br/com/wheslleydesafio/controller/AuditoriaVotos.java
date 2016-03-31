package br.com.wheslleydesafio.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import org.springframework.web.servlet.ModelAndView;

import br.com.wheslleydesafio.interfaces.IBancoDados;
import br.com.wheslleydesafio.interfaces.ICandidatos;
import br.com.wheslleydesafio.model.Candidato;

/**
 * Classe de controller de Votos
 * 
 * @author Wheslley Nycolas da Silva
 * @version 1.00
 */
public class AuditoriaVotos {

	/**
	 * Método identifica o candidato que recebera o voto
	 * 
	 * @author Wheslley Nycolas da Silva
	 */
	public static void computaVotos(String nomeCandidato) {
		if (nomeCandidato.equals(ICandidatos.CANDIDATOAECIO)) {
			executaVotacao(ICandidatos.VALORAECIO);
		} else if (nomeCandidato.equals(ICandidatos.CANDIDATOSOLSONARO)) {
			executaVotacao(ICandidatos.VALORABOLSONARO);
		} else if (nomeCandidato.equals(ICandidatos.CANDIDATOLULA)) {
			executaVotacao(ICandidatos.VALORLULA);
		} else if (nomeCandidato.equals(ICandidatos.CANDIDATOMARINA)) {
			executaVotacao(ICandidatos.VALORMARINA);
		} else {
			JOptionPane.showMessageDialog(null, "ERRO!");
		}
	}

	/**
	 * Método que realiza a consulta da quantidade de votos atual do Candidato
	 * 
	 * @author Wheslley Nycolas da Silva
	 */
	public static void executaVotacao(int nroCandidato) {

		Candidato candidato = new Candidato();
		EntityManager manager = null;

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory(IBancoDados.NOMEBANCODADOS);
			manager = factory.createEntityManager();
			manager.getTransaction().begin();

			computaVotoCandidato(manager, nroCandidato, candidato);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO AO REALIZAR A CONSULTA SQL!");
		} finally {
			manager.close();
		}
	}

	/**
	 * Método que realiza o merge do Objeto(Candidato) no Banco de Dados
	 * 
	 * @author Wheslley Nycolas da Silva
	 */
	public static void computaVotoCandidato(EntityManager manager, int nroCandidato, Candidato candidato) {

		candidato = candidato.getCandidato(manager, nroCandidato);
		candidato.setVotos_candidato();

		manager.merge(candidato);
		manager.getTransaction().commit();

	}

	public static List<Candidato> senso() {
		List<Candidato> listaCandidato = new ArrayList<>();
		EntityManager manager = null;

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory(IBancoDados.NOMEBANCODADOS);
			manager = factory.createEntityManager();
			manager.getTransaction().begin();

			listaCandidato = Candidato.getAllCandidato(manager);

			return listaCandidato;

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO AO REALIZAR O SENSO!");
		} finally {
			manager.close();
		}
		return listaCandidato;
	}

	public static ModelAndView addModelAndView() {
		ModelAndView modelAndView = new ModelAndView("index");
		List<Candidato> listaCandidato = AuditoriaVotos.senso();

		for (Candidato candidato : listaCandidato) {
			if (candidato.getNomeCandidato().equals("AECIO NEVES")) {
				modelAndView.addObject("aecio", candidato.getVotos_candidato());
			} else if (candidato.getNomeCandidato().equals("JAIR BOLSONARO")) {
				modelAndView.addObject("bolsonaro", candidato.getVotos_candidato());
			} else if (candidato.getNomeCandidato().equals("LUIS INACIO DA SILVA")) {
				modelAndView.addObject("lula", candidato.getVotos_candidato());
			} else {
				modelAndView.addObject("marina", candidato.getVotos_candidato());
			}
		}
		
		return modelAndView;
	}
}
