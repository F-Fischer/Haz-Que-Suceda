package com.hazquesuceda.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.hazquesuceda.model.Proyecto;
import com.hazquesuceda.model.Usuario;
import com.hazquesuceda.service.ProyectoService;
import com.hazquesuceda.service.UserService;


@Controller
public class MainController {
	private UserService userService;
	private ProyectoService proyectoService;

	@RequestMapping(value = "login")
	public ModelAndView login(
			@RequestParam(value = "error", required = false) String error) {
		ModelAndView model = new ModelAndView();
		if (error != null) {
			if (error.equalsIgnoreCase("badCredentials")) {
				model.addObject("error",
						"Nombre de usuario o Contraseña incorrectos.");
			}
			if (error.equalsIgnoreCase("maxSessionExceeded")) {
				model.addObject("error",
						"Esta cuenta ya se encuentra abierta en otra sesión.");
			}
		}

		model.setViewName("login");
		return model;
	}


	@RequestMapping(value = "welcome")
	public ModelAndView welcome(@RequestParam(value = "active", required = false) Boolean active,
			HttpServletRequest request) {
		Principal principal = request.getUserPrincipal();
		Usuario u = userService.getUserByUsername(principal.getName());
		String fullName = u.getName() + " " + u.getSurname();
		request.getSession().setAttribute("user", fullName);
		ModelAndView model = new ModelAndView();
		
		
		model.setViewName("welcome");
/*
		if (request.isUserInRole("ROLE_ADMIN")) {
			model.setViewName("admin");
		} else if (request.isUserInRole("ROLE_ADMIN_BERSABE")){
				model.setViewName("adminMain");
		}else{
			model.setViewName("welcome");
		}*/
		return model;
	}
	
	@RequestMapping(value = "nuevoProyecto")
	public ModelAndView nuevoProyecto(@RequestParam(value = "active", required = false) Boolean active,
			HttpServletRequest request) {
		ModelAndView model = new ModelAndView();
		model.setViewName("nuevoProyecto");
/*
		if (request.isUserInRole("ROLE_ADMIN")) {
			model.setViewName("admin");
		} else if (request.isUserInRole("ROLE_ADMIN_BERSABE")){
				model.setViewName("adminMain");
		}else{
			model.setViewName("welcome");
		}*/
		return model;
	}
	
	@RequestMapping(value = "getProjects")
	public @ResponseBody String getAllProjects(){
		List<Proyecto> proyectoLista = proyectoService.findAll();
		
		JsonArray proyectosArray = new JsonArray();
		
		for(Proyecto proyecto : proyectoLista){
			JsonObject proy = new JsonObject();
			
			proy.addProperty("id", proyecto.getId());
			proy.addProperty("name", proyecto.getNombre());
			proy.addProperty("descripcion", proyecto.getDescripcion());
			proy.addProperty("cantDeVisitas", proyecto.getCantidadDeVisitas());
			
			proyectosArray.add(proy);
		}
		
		return proyectosArray.toString();
	}

	@RequestMapping(value = "saveProject")
	public void saveProject(){
		
	}
	

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Autowired
	public void setProyectoService(ProyectoService proyectoService) {
		this.proyectoService = proyectoService;
	}

}
