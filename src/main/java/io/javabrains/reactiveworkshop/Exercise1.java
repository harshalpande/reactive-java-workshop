package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        StreamSources.intNumbersStream().forEach(num -> System.out.println(num));

        // Print numbers from intNumbersStream that are less than 5
        StreamSources.intNumbersStream().filter(num -> num < 5).forEach(num -> System.out.println(num));

        // Print the second and third numbers in intNumbersStream that's greater than 5
        StreamSources.intNumbersStream().filter(num -> num > 5) 	// Get the numbers Greater than 5
        				.skip(1)
        				.limit(2)
        				.forEach(num -> System.out.println(num));

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        StreamSources.intNumbersStream().findFirst().filter(num -> num > 5).ifPresentOrElse(num -> System.out.println(num), () -> System.out.println(-1));

        // Print first names of all users in userStream
        StreamSources.userStream().forEach(user -> System.out.println(user.getFirstName()));

        // Print first names in userStream for users that have IDs from number stream
        StreamSources.intNumbersStream()
        				.flatMap(num -> StreamSources.userStream().filter(user -> user.getId() == num))
        				.map(user -> user.getFirstName())
        				.forEach(firstName -> System.out.println(firstName));

    }

}
