package com.mrb.customerdatamanagement1.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mrb.customerdatamanagement1.entity.Person;

@Repository
public class PersonDAO {
	@Autowired
private PersonRepository repository;
	public Person save(Person person) {
		return repository.save(person);
	}
	public List<Person>getAllPersonData(){
		return repository.findAll();
	}
	public Person deletePersonDataById(int id) {
		Person person=deletePersonDataById(id);
		if(person.getId()!=404) {
			repository.deleteById(id);
		}
		return person;
	}
	public List<Person>getPersonByName(String name){
		return repository.findByName(name);
	}
	public List<Person>validatePerson(String name,String email){
		return repository.validatePerson(name,email);
	}
	
}
