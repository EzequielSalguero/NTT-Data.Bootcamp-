package com.nttdata.bootcamp.patterns.prototype;

/*Con esta interfaz hacemos una llamada al método de la clase Person que 
 lo clonará obtiendo los mismos atributos que el clonado pero con distinta referencia */
public interface IPrototype {
	
	public IPrototype clone();

}
