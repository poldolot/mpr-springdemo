package mpr.lect.spring.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mpr.lect.spring.springdemo.domain.Person;

@Component
public class PersonManager {

	@Autowired
	private Person person;

	public String sayName() {
		return "I'm " + person.getFirstName() + "!";
	}

}
