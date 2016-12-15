package com.example.usluga1.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface TestowaRepository extends CrudRepository<Testowa, Long> {

	public Testowa findById(@Param("id") Long id);
	public List<Testowa> findByImie(@Param("imie") String imie);
	public List<Testowa> findAll();

}