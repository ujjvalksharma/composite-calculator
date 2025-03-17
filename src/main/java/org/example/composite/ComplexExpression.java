package org.example.composite;

import org.example.constant.Operator;

public class ComplexExpression implements Expression {
  Operator operator;
  Expression leftExpression;
  Expression rightExpression;

  public ComplexExpression(Expression leftExpression, Expression rightExpression, Operator operator) {
    this.rightExpression = rightExpression;
    this.leftExpression = leftExpression;
    this.operator = operator;
  }

  @Override
  public int evaluate() {
   if(this.operator == Operator.DIVIDE) {
     return this.leftExpression.evaluate() / this.rightExpression.evaluate();
   } else if(this.operator == Operator.MULTIPLY) {
     return this.leftExpression.evaluate() * this.rightExpression.evaluate();
   } else if(this.operator == Operator.PLUS) {
     return this.leftExpression.evaluate() + this.rightExpression.evaluate();
   } else {
     return this.leftExpression.evaluate() - this.rightExpression.evaluate();
   }
  }
}
