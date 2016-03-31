package br.com.wheslleydesafio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Classe de controller do Sistema de Votação.
 * 
 * @author Wheslley Nycolas da Silva
 * @version 1.0
 */
@Controller
public class SistemaController {

	/**
	 * Método que chama a pagina index.jsp
	 * 
	 * @author Wheslley Nycolas da Silva
	 * @return ModelAndView - nome da jsp
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView executeIndex() {
		ModelAndView modelAndView = AuditoriaVotos.addModelAndView();
		return modelAndView;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView executeDefault() {
		ModelAndView modelAndView = AuditoriaVotos.addModelAndView();		
		return modelAndView;
	}

	/**
	 * Método que chama a pagina historicoEleicoes.jsp
	 * 
	 * @author Wheslley Nycolas da Silva
	 * @return ModelAndView - nome da jsp
	 */
	@RequestMapping(value = "/historicoEleicoes", method = RequestMethod.GET)
	public ModelAndView executeHistoricoEleicoes() {
		ModelAndView modelAndView = new ModelAndView("historicoEleicoes");
		return modelAndView;
	}

	/**
	 * Método que chama a pagina sensoEleicoes.jsp
	 * 
	 * @author Wheslley Nycolas da Silva
	 * @return ModelAndView - nome da jsp
	 */
	@RequestMapping(value = "/sensoEleicoes", method = RequestMethod.GET)
	public ModelAndView executeSensoEleitoral() {
		ModelAndView modelAndView = new ModelAndView("sensoEleicoes");
		modelAndView.addObject("listaCandidato", AuditoriaVotos.senso());

		return modelAndView;
	}

}
