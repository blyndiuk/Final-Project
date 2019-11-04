package com.example.javaJokesLib;

import java.util.Random;

public class JokesClass {
    public String getJoke() {
        String[] jokes = new String[10];
        jokes[0] = "I asked 100 women which shampoo they preferred.\n" +
                "\n" +
                "Almost all of them replied: How the hell did you get in here?";
        jokes[1] = "Why is girlfriend one word but best friend is two words?\n" +
                "\n" +
                "Because your best friend gives you space when you need it.";

        jokes[2] = " have a very secure job. There's nobody else who would want it.";

        jokes[3] = "Oh daddy, I love you so much!\n" +
                "-\n" +
                "Hey, until we get the DNA test, I'm just Harry to you!";

        jokes[4] = "They say make up sex is the best…\n" +
                "\n" +
                "Which is lucky, because all my sex is made up.";

        jokes[5] = "What's 6 inches long, 2 inches wide, and drives women wild?\n" +
                "\n" +
                "A $100 bill.";

        jokes[6] = "What is the worst combination of two sicknesses?\n" +
                "-\n" +
                "Diarrhea and Alzheimer. You’re running, but you don’t know where.";

        jokes[7] = "Do you know what's cool?\n" +
                "-\n" +
                "Winter.";

        jokes[8] = "Problems sleeping? Cut the legs of your bed. You'll sleep deeper.";

        jokes[9] = "I lost some weight last month. But now it found me again. ";

        return jokes[new Random().nextInt(jokes.length)];
    }
}
