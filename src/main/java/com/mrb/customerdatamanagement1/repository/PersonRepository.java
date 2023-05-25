package com.mrb.customerdatamanagement1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mrb.customerdatamanagement1.entity.Person;

public interface PersonRepository  extends JpaRepository<Person, Integer>{

	List<Person> findByName(String name);
    @Query("SELECT p FROM Person p WHERE p.name=:name AND p.email=:email")
    //List<Person> validatePersons(@Param("name")String name,@Param("email")String email);
	List<Person> validatePerson(String name, String email);
}
