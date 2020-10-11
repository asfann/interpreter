package com.astanait;

import com.astanait.Expression;

public class AddExpression implements Expression {
    private String context;
    public AddExpression (String context) {
        this.context = context;
    }

    @Override
    public int interpret(InterpreterEngine engine) {
        return engine.add(context);
    }
}
