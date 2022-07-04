package com.acem.jc;

import java.util.Scanner;

import com.acem.jc.mathematicaloperations.*;


public class Main{
    static int valid = 0;    
    public static void main(String args[]){
    Scanner op = new Scanner(System.in);
    System.out.println("Enter the operation");
    String operator = op.nextLine();

    System.out.println("Enter the first operand");
    double operand1 = op.nextDouble();

    System.out.println("Enter the second operand");
    double operand2= op.nextDouble();
    
    MathCommand operation = null;
    switch (operator){
        case ("+"):
            operation = new AddCommand();
            valid = 1;
            break;
        case ("-"):
            operation = new SubCommand();
            valid = 1;
            break;
            case ("*"):
            operation = new MulCommand();
            valid = 1;
            break;
        case ("/"):
            operation = new DivisionCommand();
            valid = 1;
            break;
        case("^"):
            operation = new PowerCommand();
            valid = 1;
            break;
        default:
            break;
    }
    if (valid == 1){
    double result = operation.calculate(operand1, operand2);
    System.out.println("The result is: "+ result);
    }
    else{
    
    System.out.println("Invalid operation.");
    }

}
}