package com.hayturno.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.hayturno.myapp.service.EspecialidadService;
import com.hayturno.myapp.service.EspecialidadServiceImpl;
import com.hayturno.myapp.hibernatecode.Especialidad;

/**
 * Handles requests for the application home page.
 */
@Controller
public class EspecialidadController {
	private EspecialidadService Especialidadeservice = new EspecialidadServiceImpl();
	
	private static final Logger logger = LoggerFactory.getLogger(EspecialidadController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 *
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}*/
	
	/**
	 * Lista todas las Especialidades.
	 */	
	@RequestMapping(value = "/especialidades", method = RequestMethod.GET)
	public String getAll() {
		logger.info("Especialidades!");
		JsonArray jsonArray = new JsonArray();
		List<Especialidad> Especialidades = Especialidadeservice.getEspecialidades();
		for (Especialidad Especialidad : Especialidades) {
			JsonObject jsonObjet = new JsonObject();
			jsonObjet.addProperty("id", Especialidad.getIdespecialidad());
			jsonObjet.addProperty("nombre", Especialidad.getEspecialidad());
			jsonArray.add(jsonObjet);
		}
		String stringEspecialidades = jsonArray.toString();
		//System.out.println(stringEspecialidades);
		logger.info("Lista de Especialidades: {}.", stringEspecialidades);
		return stringEspecialidades;
	}
	
}
