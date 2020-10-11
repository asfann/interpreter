package com.astanait;

public class SubtractExpression implements Expression {
    private String context;

    public SubtractExpression(String context) {
        this.context = context;
    }

    @Override
    public int interpret(InterpreterEngine engine) {
        return engine.subtract(context);
    }
}
