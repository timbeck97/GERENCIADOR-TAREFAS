package com.estudo.tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TarefaController {
	
	@GetMapping
	public String index() {
		return "index";
	}
	@GetMapping(value = "/listatarefas")
	public String listaTarefas() {
		return "/tarefas/listatarefas";
	}
}
