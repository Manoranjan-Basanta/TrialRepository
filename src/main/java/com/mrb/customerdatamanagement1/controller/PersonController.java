package com.mrb.customerdatamanagement1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mrb.customerdatamanagement1.entity.Person;
import com.mrb.customerdatamanagement1.service.PersonService;
@RestController
public class PersonController {
@Autowired
private PersonService service;

@PostMapping("/person")
public Person savePerson(Person person) {
	return service.savePerson(person);
 }
@DeleteMapping("/person")
public @ResponseBody Person deletePersonDataById(@RequestParam("id")int id) {
	return service.deletePersonDataById(id);
}
@GetMapping("/personbyname/{name}")
public @ResponseBody List<Person>getPersonByName(@PathVariable("name")String name){
	return service.getPersonByName(name);
}
public List<Person>validatePerson(@RequestParam("name")String name,@RequestParam("email")String email){
	return service.validatePerson(name, email);
}
}
