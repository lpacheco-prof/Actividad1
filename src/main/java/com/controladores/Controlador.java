package com.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.entidades.Tarea;
import com.repositorios.*;

/**
 * @author Luis M. Pacheco
 */

@Controller
public class Controlador {
	
	@Autowired
	Repositorio re;

	public Controlador() {
		// TODO Auto-generated constructor stub
	}
	
    @GetMapping({"/", "/index", "index.html"})
    public String index(Model model) {
        model.addAttribute("tareas", re.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String add(@RequestParam String nombre) {
        re.save(new Tarea(nombre));
        return "redirect:/";
    }

}
