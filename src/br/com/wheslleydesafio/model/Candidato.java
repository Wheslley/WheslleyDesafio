package br.com.wheslleydesafio.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Query;
import javax.persistence.Table;

@Entity
@Table(name = "CANDIDATO")
public class Candidato {

	@Id @GeneratedValue
	@Column(name = "ID_CANDIDATO")
	private int id_candidato;

	@Column(name = "NOME_CANDIDATO")
	private String nomeCandidato;

	@Column(name = "PARTIDO")
	private String partido;

	@Column(name = "NUMEROPARTIDO")
	private int numeroPartido;

	@Column(name = "VOTOS_CANDIDATO")
	private int votos_candidato;

	public Candidato() {
	}

	public Candidato(String nomeCandidato, String partido, int numeroPartido, int nroVotos) {
		this.nomeCandidato = nomeCandidato;
		this.partido = partido;
		this.numeroPartido = numeroPartido;
		this.votos_candidato = nroVotos;
	}

	public Candidato(int idCandidato, String nomeCandidato, String partido, int numeroPartido, int nroVotos) {
		this.id_candidato = idCandidato;
		this.nomeCandidato = nomeCandidato;
		this.partido = partido;
		this.numeroPartido = numeroPartido;
		this.votos_candidato = nroVotos;
	}
	
	public Candidato getCandidato(EntityManager manager, int nroCandidato) {
		Query query = manager.createQuery("Select c from Candidato c Where c.id_candidato = " + nroCandidato);
		return (Candidato) query.getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	public static List<Candidato> getAllCandidato(EntityManager manager) {
		Query query = manager.createQuery("Select c from Candidato c order by c.votos_candidato desc");
		return query.getResultList();
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public int getNumeroPartido() {
		return numeroPartido;
	}

	public void setNumeroPartido(int numeroPartido) {
		this.numeroPartido = numeroPartido;
	}

	public int getId_candidato() {
		return id_candidato;
	}

	public void setId_candidato(int id_candidato) {
		this.id_candidato = id_candidato;
	}

	public int getVotos_candidato() {
		return votos_candidato;
	}

	public void setVotos_candidato(int votos_candidato) {
		this.votos_candidato = votos_candidato;
	}
	
	public void setVotos_candidato() {
		this.votos_candidato = getVotos_candidato() + 1;
	}
}
