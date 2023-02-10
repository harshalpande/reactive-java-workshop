package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.concurrent.Flow.Subscriber;

import reactor.core.publisher.Flux;

public class Exercise8 {


    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFluxWithException()

        // Print values from intNumbersFluxWithException and print a message when error happens
//        ReactiveSources.intNumbersFluxWithException()
//        				.doOnError(error -> System.out.println("Error Occured: " + error))
//        				.subscribe(System.out::println);
    	
//    	ReactiveSources.intNumbersFluxWithException()
//    					.subscribe(System.out::println, error -> System.out.println("Error Happened : " + error));

        // Print values from intNumbersFluxWithException and continue on errors
//    	ReactiveSources.intNumbersFluxWithException()
//    						.onErrorContinue((e, value) -> System.out.println("Error Happened : " + e.getMessage()))
//    						.subscribe(System.out::println);

        // Print values from intNumbersFluxWithException and when errors
        // happen, replace with a fallback sequence of -1 and -2
//    	ReactiveSources.intNumbersFluxWithException()
//    						.onErrorResume(error -> Flux.just(-1, -2))
//    						.subscribe(System.out::println);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
