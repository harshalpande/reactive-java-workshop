package io.javabrains.reactiveworkshop;

import java.io.IOException;

import org.reactivestreams.Subscription;

import reactor.core.publisher.BaseSubscriber;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Subscribe to a flux using the error and completion hooks
//        ReactiveSources.intNumbersFlux().subscribe(
//        		number -> System.out.println(number), 
//        		err -> System.err.println(err), 
//        		() -> System.out.println("intNumberFlux Subscription Completed."));
    	
    	ReactiveSources.intNumbersFlux().subscribe(new MySubscriber());

        // Subscribe to a flux using an implementation of BaseSubscriber
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

}

class MySubscriber extends BaseSubscriber<Integer> {
	
	@Override
	protected void hookOnSubscribe(Subscription subscription) {
		System.out.println("Subscription Happend");
		request(1);
	}
	
	@Override
	protected void hookOnNext(Integer value) {
		System.out.println(value);
		request(1);
	}
	
	@Override
	protected void hookOnComplete() {
		System.out.println("intNumbersFlux() subscription completed");
	}
	
}