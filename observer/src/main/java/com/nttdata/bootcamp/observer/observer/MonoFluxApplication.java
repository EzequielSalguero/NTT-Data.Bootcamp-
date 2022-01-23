package com.nttdata.bootcamp.observer.observer;

import reactor.core.publisher.Flux;

public class MonoFluxApplication {

	public static void main(String[] args) {
		
		Flux<String> messageSender = Flux.just("Mensaje1", "Mensaje2", "Mensaje3");
		
		//messageSender.subscribe(message -> System.out.println("Observer 1. Received: " + message));
		//messageSender.subscribe(message -> System.out.println("Observer 2. Received: " + message));
		
		messageSender.doOnNext((element) -> {
			System.out.println(element);
			}).blockLast();
	}

}
