package com.nttdata.bootcamp.patterns.decorator;

import com.nttdata.bootcamp.patterns.pattern.Person;

/*Desde esta clase haciendo uso del patron estructural Decorator, podemos añadir
 funcionabilidades al objeto, colocando otro objetos encapsulado que recibe las modificaciones*/
public class PersonDecorator {
	
	private Person persona;
	
	public PersonDecorator(Person persona) {
		this.persona = persona;
	}
	
	public String getName() {
		return "Nombre: " + this.persona.getName();
	}
	
	public int getAge() {	
		return persona.getAge()*100;
	}
}
