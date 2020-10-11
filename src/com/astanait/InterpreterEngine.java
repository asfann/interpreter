package com.astanait;

public class InterpreterEngine {
    public int add (String input) {
        String[] tokens = interpret(input);
        int num1 = Integer.parseInt(tokens[0]),
            num2 = Integer.parseInt(tokens[1]);
        return num1 + num2;
    }

    public int multiply (String input) {
        String[] tokens = interpret(input);
        int num1 = Integer.parseInt(tokens[0]),
                num2 = Integer.parseInt(tokens[1]);
        return num1 * num2;
    }

    public int subtract (String input) {
        String[] tokens = interpret(input);
        int num1 = Integer.parseInt(tokens[0]),
                num2 = Integer.parseInt(tokens[1]);
        return num1 - num2;
    }

    private String[] interpret(String input) {
        String string = (input.replaceAll ("[^0-9]", " ")).replaceAll("( )+", " ").trim();
        return string.split(" ");
    }
}
