package br.e3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.e3.beans.Filho;

public interface FilhoRepository extends JpaRepository<Filho, Long>{
	
}
