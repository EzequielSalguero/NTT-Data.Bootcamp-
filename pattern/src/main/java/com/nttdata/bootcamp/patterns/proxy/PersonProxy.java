package com.nttdata.bootcamp.patterns.proxy;

public class PersonProxy implements IPersonProxyInterface{
	
	/*En este ejemplo usamos el patron Proxy de forma que podemos controlar el acceso al
	objeto antes y despues de la operación principal*/
	private IPersonProxyInterface person;
	
	public PersonProxy (IPersonProxyInterface person) {
		this.person = person;
	}
	
	@Override
	public void operation() {
		before();
		this.person.operation();
		after();
	}
	
	public void before() {
		System.out.println("Realizado antes de la operacion");
	}
	
	public void after() {
		System.out.println("Realizado despues de la operacion");
	}
}
