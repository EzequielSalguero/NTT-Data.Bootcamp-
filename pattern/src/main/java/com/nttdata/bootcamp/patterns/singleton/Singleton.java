package com.nttdata.bootcamp.patterns.singleton;

import com.nttdata.bootcamp.patterns.pattern.Person;

/*Con esta clase hacemos la instacia del objeto Person haciendo de este un objeto
 *que solo se puede instanciar una vez*/
public class Singleton {
	private static Person INSTANCE;
	
	public static Person getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Person();
		}
		return INSTANCE;
	}

}
