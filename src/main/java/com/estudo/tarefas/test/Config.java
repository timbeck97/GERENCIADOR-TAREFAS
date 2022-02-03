package com.estudo.tarefas.test;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.estudo.tarefas.model.Tarefa;
import com.estudo.tarefas.repositories.TarefaRepositorie;

@Service
public class Config implements CommandLineRunner {
	@Autowired
	private TarefaRepositorie rep;	
	@Override
	public void run(String... args) throws Exception {
		
		
		Tarefa t1=new Tarefa(null, "Limpar a casa", false);
		Tarefa t2=new Tarefa(null, "Enviar trabalho faculdade", false);
		Tarefa t3=new Tarefa(null, "Limpar escrivaninha", false);
		Tarefa t4=new Tarefa(null, "Comprar roupas", false);
		Tarefa t5=new Tarefa(null, "Comprar Ingresso UP", false);
		Tarefa t6=new Tarefa(null, "Lavar roupas", false);
		Tarefa t7=new Tarefa(null, "Estudar para prova", false);
		Tarefa t8=new Tarefa(null, "Comprar frutas", false);
		rep.saveAll(Arrays.asList(t1,t2,t3,t4,t5,t6,t7,t8));
	}

}
