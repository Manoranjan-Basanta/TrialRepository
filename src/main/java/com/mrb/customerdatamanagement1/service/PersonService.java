package com.mrb.customerdatamanagement1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.mrb.customerdatamanagement1.entity.Person;
import com.mrb.customerdatamanagement1.repository.PersonDAO;

@Service
public class PersonService {
@Autowired
private PersonDAO dao;
public Person savePerson(@RequestBody Person person) {
	return dao.save(person);
}
public Person deletePersonDataById(int id) {
	return dao.deletePersonDataById(id);
}
public List<Person>getPersonByName(String name){
	return dao.getPersonByName(name);
}
public List<Person>validatePerson(String name,String email){
	return dao.validatePerson(name, email);
}
}
