package com.estudo.tarefas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.tarefas.model.Tarefa;

public interface TarefaRepositorie extends JpaRepository<Tarefa, Long> {
	List<Tarefa> findByStatus(boolean status);
}
