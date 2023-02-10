package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.concurrent.Flow.Subscriber;

public class Exercise7 {


    /**
     * Operators Learning
     * @param args
     * @throws IOException
     */
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()
        // Print all values from intNumbersFlux that's greater than 5
//        ReactiveSources.intNumbersFlux()
//        					.log()
//        					.filter(e -> e > 5)
//        					.subscribe(System.out::println);

        // Print 10 times/multiply each value from intNumbersFlux that's greater than 5
        // TODO: Write code here
//        ReactiveSources.intNumbersFlux()
//        					.filter(e -> e > 5)
//        					.map(e -> e * 10)
//        					.log()
//        					.subscribe(System.out::println);

        // Print 10 times/multiply each value from intNumbersFlux for the first 3 numbers emitted that's greater than 5
//        ReactiveSources.intNumbersFlux()
//        					.filter(e -> e > 5)
//        					.map(e -> e * 10)
//        					.take(3)
//        					.subscribe(System.out::println);

        // Print each value from intNumbersFlux that's greater than 20. Print -1 if no elements are found
//    	ReactiveSources.intNumbersFlux()
//							.filter(e -> e > 10)
//							.defaultIfEmpty(-1)
//							.subscribe(System.out::println);

        // Switch ints from intNumbersFlux to the right user from userFlux
//        ReactiveSources.intNumbersFlux()
//        					.flatMap(e -> ReactiveSources.userFlux().filter(user -> user.getId() == e))
//        					.subscribe(System.out::println);

        // Print only distinct numbers from intNumbersFluxWithRepeat
//    	ReactiveSources.intNumbersFluxWithRepeat()
//    						.distinct()
//    						.log()
//    						.subscribe(System.out::println);

        // Print from intNumbersFluxWithRepeat excluding immediately repeating numbers
//        ReactiveSources.intNumbersFluxWithRepeat()
//        					.distinctUntilChanged()
//        					.log()
//        					.subscribe(System.out::println);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
