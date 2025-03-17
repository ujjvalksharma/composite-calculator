package org.example;

import org.example.composite.ComplexExpression;
import org.example.composite.Expression;
import org.example.composite.Number;
import org.example.constant.Operator;

public class Main {
  public static void main(String[] args) {
    Expression number1 = new Number(1);
    Expression number2 = new Number(10);
    Expression number3 = new Number(20);
    Expression complexExpression1 = new ComplexExpression(number1, number2, Operator.PLUS);
    Expression complexExpression2 = new ComplexExpression(number3, complexExpression1, Operator.PLUS);
    System.out.println(complexExpression2.evaluate());
  }
}