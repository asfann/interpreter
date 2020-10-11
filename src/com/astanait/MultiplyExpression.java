package com.astanait;

public class MultiplyExpression implements Expression {
    private String context;

    public MultiplyExpression(String context) {
        this.context = context;
    }

    @Override
    public int interpret(InterpreterEngine engine) {
        return engine.multiply(context);
    }

}
