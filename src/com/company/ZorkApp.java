package com.company;


import java.util.Scanner;

public class ZorkApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        InputParser parser = new InputParser();

        System.out.println("Welcome! \n What is your name?");
        String name = input.next();
        Player player = new Player(name);


        System.out.println("Hello " + player.getName() + "\n\n" +
                "You are in a room. In front of you on the floor is a purse.\n");


        System.out.println("What do you want to do?");
        String command = input.nextLine();
        parser.handleInput(command);


    }
}
