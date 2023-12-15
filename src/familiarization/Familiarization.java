/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familiarization;

/**
 *
 * @author Suma Marri
 */
import java.util.Scanner; 

public class Familiarization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        arithmetic();
        compoundAssign();
        unary();
        relational();
        conditional();
        instanceOf();
    }
    private static void arithmetic(){
        System.out.println("*********** Arithmetic ***********");
        Scanner scrn = new Scanner(System.in); 
        int numOne;
        int numTwo;
        
        System.out.println("Enter an integer greater than 0: ");
        numOne = scrn.nextInt();
        System.out.println("Enter a second integer greater than 0: ");
        numTwo = scrn.nextInt();
        
        //add
        System.out.print(numOne + " + " + numTwo + " = "); 
        System.out.println(numOne + numTwo);
        //subtract
        System.out.print(numOne + " - " + numTwo + " = "); 
        System.out.println(numOne - numTwo);
        //multiply
        System.out.print(numOne + " * " + numTwo + " = "); 
        System.out.println(numOne * numTwo);
        //divide
        System.out.print(numOne + " / " + numTwo + " = "); 
        System.out.println(numOne / numTwo);
        //modulo
        System.out.print(numOne + " % " + numTwo + " = "); 
        System.out.println(numOne % numTwo);
    }
    private static void compoundAssign(){
        System.out.println("\n****** Compound Assignment ******");
        Scanner scrn = new Scanner(System.in); 
        int numOne;
        int numTwo;
        int result; //equals to numOne
        
        System.out.println("Enter an integer greater than 0: ");
        numOne = scrn.nextInt();
        System.out.println("Enter a second integer greater than 0: ");
        numTwo = scrn.nextInt();
        
        result  = numOne;
        
        result +=numTwo; //result = result + numTwo
        System.out.println("result += numTwo = " + result);
        result -= numOne; //result = result + numOne
        System.out.println("result -= numTwo = " + result);
        result *= numTwo; //result = result * numTwo
        System.out.println("result *= numTwo = " + result);
        result /= numOne; //result = result / numOne
        System.out.println("result /= numOne = " + result);
        result %= numTwo; //result = result % numTwo
        System.out.println("result %= numTwo = " + result);
    }
    private static void unary(){
        System.out.println("\n************* Unary *************");
        Scanner scrn = new Scanner(System.in); 
        int num;
        //int temp; // to reset to original num
        
        System.out.println("Enter an integer greater than 0: ");
        num = scrn.nextInt();
        //temp = num;
 
        num--;
        System.out.println("num-- = " + num);
        
        //num = temp;
        num++;
        System.out.println("num++ = " + num);

        //num = temp;
        num = -num;
        System.out.println("-num = " + num);
        
        //num = temp;
        num = +num;
        System.out.println("+num = " + num);

        //"BOO-LIENS" --Get it? When Ghosts act like aliens :)
        boolean success = true;
        System.out.println("success = " + success); // true
        System.out.println("!success = " + !success); // false
    }
    private static void relational(){
        System.out.println("\n********** Relational **********");
        Scanner scrn = new Scanner(System.in); 
        int numOne;
        int numTwo;
        
        System.out.println("Enter an integer greater than 0: ");
        numOne = scrn.nextInt();
        System.out.println("Enter a second integer greater than 0: ");
        numTwo = scrn.nextInt();
        
        //equal
        if(numOne == numTwo){
            System.out.println("numOne == numTwo");
        } 
        //not equal
        if(numOne != numTwo){
            System.out.println("numOne != numTwo");
        } 
        //greater than
        if(numOne > numTwo){
            System.out.println("numOne > numTwo");
        } 
        //greater than or equal 
        if(numOne >= numTwo){
            System.out.println("numOne >= numTwo");  
        } 
        //less than
        if(numOne < numTwo){
            System.out.println("numOne < numTwo");
        } 
        //less than or equal 
        if(numOne <= numTwo){
            System.out.println("numOne <= numTwo");
        } 
    }
    private static void conditional(){
        System.out.println("\n********** Conditional **********");
        Scanner scrn = new Scanner(System.in); 
        int numOne;
        int numTwo;
         
        System.out.println("Enter an integer greater than 10: ");
        numOne = scrn.nextInt();
        System.out.println("Enter a second integer greater than 10: ");
        numTwo = scrn.nextInt();
        
        //add
        if(numOne >= 10 && numTwo >= 10){
            System.out.println("numOne is >= 10 AND numTwo is >= 10");
        }
        //or
        if(numOne >= 10 || numTwo >= 10){
            System.out.println("numOne OR numTwo is >= 10");
        }
    }
    private static void instanceOf(){
        System.out.println("\n********** Instance Of **********");
        Scanner scrn = new Scanner(System.in); 
        int num;
        System.out.println("Enter an integer greater than 0: ");
        num = scrn.nextInt();
        
        //instantiate an instance of class Integer
        Integer i = num;
        //Integer i = new Integer(num); //Same thing as the previous line...
       
        System.out.print("numClass instanceof Intger: ");
        System.out.println(i instanceof Integer); //Integer is a "BOO-LIEN"
    }
}
