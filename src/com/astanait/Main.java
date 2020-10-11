package com.astanait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private InterpreterEngine engine;

    public Main(InterpreterEngine engine) {
        this.engine = engine;
    }

    public int MultiplyInterpret(String input) {
        Expression expression = null;
        expression = new MultiplyExpression(input);
        return expression.interpret(engine);
    }

    public int AddInterpret(String input) {
        Expression expression = null;
        expression = new AddExpression(input);
        return expression.interpret(engine);
    }


    public int SubtractInterpret(String input) {
        Expression expression = null;
        expression = new SubtractExpression(input);
        return expression.interpret(engine);
    }

    public static void main(String[] args) {
        Main main = new Main(new InterpreterEngine());
        Scanner sc = new Scanner(System.in);
        String content = (String) sc.nextLine();

        String[] tokens = content.split(" ");
        ArrayList<String> list = new ArrayList (Arrays.asList(tokens));

        while (list.contains("*")) {
            int id = list.indexOf("*");
            int cur = main.MultiplyInterpret(list.get(id-1) + list.get(id) + list.get(id+1));

            list.remove(list.indexOf("*")-1);
            list.remove(list.indexOf("*")+1);
            list.set(list.indexOf("*"), Integer.toString(cur));
        }

        while (list.contains("+")) {
            int id = list.indexOf("+");
            int cur = main.AddInterpret(list.get(id-1) + list.get(id) + list.get(id+1));

            list.remove(list.indexOf("+")-1);
            list.remove(list.indexOf("+")+1);
            list.set(list.indexOf("+"), Integer.toString(cur));
        }

        while (list.contains("-")) {
            int id = list.indexOf("-");
            int cur = main.SubtractInterpret(list.get(id-1) + list.get(id) + list.get(id+1));

            list.remove(list.indexOf("-")-1);
            list.remove(list.indexOf("-")+1);
            list.set(list.indexOf("-"), Integer.toString(cur));
        }

        System.out.println(list.get(0));
    }
}
