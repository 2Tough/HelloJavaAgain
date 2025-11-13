package com.mooc.interfaces.hello;

import java.util.Scanner;


public class HelloJavaAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Greeter greeter = new ConsoleGreeter();

        System.out.print("¿Cómo te llamas? ");
        String name = scanner.nextLine();

        System.out.println(greeter.greet(name));
        System.out.println("Let's build something awesome today!");
        scanner.close();
    }

}
