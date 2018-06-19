package com.example.javalib;

import java.util.Random;

public class JavaJokes {
    private static String[] jokes={"Can a kangaroo jump higher than a house? \n Of course, a house doesn’t jump at all.",
            " -Anton, do you think I’m a bad mother? \n -My name is Paul.",
            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.",
            "-\"Mom, where do tampons go?\"\n" + "\n" + "-\"Where the babies come from, darling.\"\n" + "\n" + "-\"In the stork?\"",
            "What is the difference between a snowman and a snowwoman? \n Snowballs.",
            "In a boomerang shop: \"I'd like to buy a new boomerang please. Also, can you tell me how to throw the old one away?\"",
    };
   //public String[] jokes={"yesh","deva"};

   public static String displayJoke() {
       Random random=new Random();
        return jokes[random.nextInt(jokes.length)];
    }
}
