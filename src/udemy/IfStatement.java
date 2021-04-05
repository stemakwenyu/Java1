
package udemy;


public class IfStatement {
    public static void main(String[]args) {
       /* boolean comparison = 3 < 6;
        boolean notEqual = 3 != 4;
        boolean equals = 6 == 6;
        System.out.println(comparison);
        System.out.println(notEqual);*/
       int amount = 0;
       while(amount <6){
       System.out.println("In the loop");
       
       if(amount == 6) {
       break;
       }
       amount ++;
       System.out.println("Out of the loop");
    }  
}}
