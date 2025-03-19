package br.com.unicuritiba.CadastroAluno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.CadastroAluno.models.Aluno;

public interface AlunoRepository 
			extends JpaRepository<Aluno, Long>{

}
