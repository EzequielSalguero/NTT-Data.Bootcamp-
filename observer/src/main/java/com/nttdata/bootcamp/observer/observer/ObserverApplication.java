package com.nttdata.bootcamp.observer.observer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

@SpringBootApplication
public class ObserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObserverApplication.class, args);
		
		Observable<String> messageSender = Observable.just("Mensaje1", "Mensaje1", "Mensaje3");
		
		messageSender.subscribe(new Observer<String>() {
			
			@Override
			public void onSubscribe(Disposable d) {
				System.out.println("Observer 1. Subscribed");
			}
			
			@Override
			public void onNext(String s) {
				System.out.println("Observer 1. Received: " + s);
			}
			
			@Override
			public void onError(Throwable e) {
				System.out.println("Observer 1. Error: " + e.getMessage());
			}
			
			@Override
			public void onComplete() {
				System.out.println("Observer 1. Completed.");
			}
		});
		
		messageSender.subscribe(new Observer<String>() {
			
			@Override
			public void onSubscribe(Disposable d) {
				System.out.println("Observer 2 Subscribed");
			}
			
			@Override
			public void onNext(String s) {
				System.out.println("Observer 2. Received: " + s);
			}
			
			@Override
			public void onError(Throwable e) {
				System.out.println("Observer 2. Error: " + e.getMessage());
			}
			
			@Override
			public void onComplete() {
				System.out.println("Observer 2. Completed.");
			}
		});
	
	}

}
