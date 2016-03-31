package br.com.wheslleydesafio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.wheslleydesafio.interfaces.ICandidatos;

/**
 * Classe de controller Candidatos.
 * 
 * @author Wheslley Nycolas da Silva
 * @version 1.00
 */
@Controller
public class CandidatosController {

	/**
	 * Método que chama a pagina aecio.jsp
	 * 
	 * @author Wheslley Nycolas da Silva
	 * @return ModelAndView - nome da jsp
	 */
	@RequestMapping(value = "/aecio", method = RequestMethod.GET)
	public ModelAndView executeAecio() {
		ModelAndView modelAndView = new ModelAndView("aecio");
		return modelAndView;
	}

	/**
	 * Método que contabiliza os votos para o candidato Aecio
	 * 
	 * @author Wheslley Nycolas da Silva
	 * @return ModelAndView - retorna o index.jsp
	 */
	@RequestMapping(value = "/votoAecio", method = RequestMethod.GET)
	public ModelAndView executeAecioVoto() {
		AuditoriaVotos.computaVotos(ICandidatos.CANDIDATOAECIO);
		ModelAndView modelAndView = AuditoriaVotos.addModelAndView();

		return modelAndView;
	}

	/**
	 * Método que chama a pagina bolsonaro.jsp
	 * 
	 * @author Wheslley Nycolas da Silva
	 * @return ModelAndView - nome da jsp
	 */
	@RequestMapping(value = "/bolsonaro", method = RequestMethod.GET)
	public ModelAndView executeBolsonaro() {
		ModelAndView modelAndView = new ModelAndView("bolsonaro");
		return modelAndView;
	}

	/**
	 * Método que contabiliza os votos para o candidato Bolsonaro
	 * 
	 * @author Wheslley Nycolas da Silva
	 * @return ModelAndView - retorna o index.jsp
	 */
	@RequestMapping(value = "/votoBolsonaro", method = RequestMethod.GET)
	public ModelAndView executeBolsonaroVoto() {
		AuditoriaVotos.computaVotos(ICandidatos.CANDIDATOSOLSONARO);
		ModelAndView modelAndView = AuditoriaVotos.addModelAndView();

		return modelAndView;
	}

	/**
	 * Método que chama a pagina lula.jsp
	 * 
	 * @author Wheslley Nycolas da Silva
	 * @return ModelAndView - nome da jsp
	 */
	@RequestMapping(value = "/lula", method = RequestMethod.GET)
	public ModelAndView executeLula() {
		ModelAndView modelAndView = new ModelAndView("lula");
		return modelAndView;
	}

	/**
	 * Método que contabiliza os votos para o candidato Lula
	 * 
	 * @author Wheslley Nycolas da Silva
	 * @return ModelAndView - retorna o index.jsp
	 */
	@RequestMapping(value = "/votoLula", method = RequestMethod.GET)
	public ModelAndView executeLulaVoto() {
		AuditoriaVotos.computaVotos(ICandidatos.CANDIDATOLULA);
		ModelAndView modelAndView = AuditoriaVotos.addModelAndView();

		return modelAndView;
	}

	/**
	 * Método que chama a pagina marina.jsp
	 * 
	 * @author Wheslley Nycolas da Silva
	 * @return ModelAndView - nome da jsp
	 */
	@RequestMapping(value = "/marina", method = RequestMethod.GET)
	public ModelAndView executeMarina() {
		ModelAndView modelAndView = new ModelAndView("marina");
		return modelAndView;
	}

	/**
	 * Método que contabiliza os votos para o candidato Marina
	 * 
	 * @author Wheslley Nycolas da Silva
	 * @return ModelAndView - retorna o index.jsp
	 */
	@RequestMapping(value = "/votoMarina", method = RequestMethod.GET)
	public ModelAndView executeMarinaVoto() {
		AuditoriaVotos.computaVotos(ICandidatos.CANDIDATOMARINA);
		ModelAndView modelAndView = AuditoriaVotos.addModelAndView();

		return modelAndView;
	}

}
