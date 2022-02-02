package com.estudo.tarefas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.estudo.tarefas.model.Tarefa;
import com.estudo.tarefas.repositories.TarefaRepositorie;

@Controller
@RequestMapping("/")
public class TarefaController {
	@Autowired
	private TarefaRepositorie rep;
	
	@GetMapping
	public String index() {
		return "index";
	}
	@GetMapping(value = "/listatarefas")
	public ModelAndView listaTarefas() {
		ModelAndView mv=new ModelAndView("tarefas/listatarefas");
		List<Tarefa> tarefas=rep.findByStatus(false);
		mv.addObject("tarefas", tarefas);
		return mv;
	}
	
	@GetMapping(value = "/buscartarefas")
	public String buscarTarefas() {
		return "/tarefas/buscartarefas";
	}
	@GetMapping(value = "/tarefas/deletar/{id}")
	public String deletaTarefa(@PathVariable("id")Long id) {
		rep.deleteById(id);
		return "redirect:/listatarefas";
	}
	@GetMapping(value = "/tarefas/concluir/{id}")
	public String concluirTarefa(@PathVariable("id")Long id) {
		Optional<Tarefa> tarefa=rep.findById(id);
		tarefa.get().setStatus(true);
		rep.save(tarefa.get());
		return "redirect:/listatarefas";
	}
	
}
