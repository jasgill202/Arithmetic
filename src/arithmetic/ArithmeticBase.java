/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import arithmetic.Operations.Ops;
import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */
public class ArithmeticBase 
{
 public double x,y;
    double calculate(double x, double y) 
        {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform (PLUS, MINUS, TIMES, DIVIDE: ");
        String s= sc.next();
       double result=0.0;
       Ops operation=null;
       for (Ops op : Ops.values()) {
            if (op.name().equals(s)) {
                operation = op;
                break;
            }
            switch (operation) 
        {
            case "PLUS":
                result= x + y;
                break;
            case "MINUS":
                result=x - y;
            break;
            case "TIMES":
                result= x * y;
            break;
            case "DIVIDE":
                result= x / y;
            break;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    
       }
     return result;
   
        }
