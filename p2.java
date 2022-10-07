import java.util.Scanner;

public class p2 {
    
    
    
    public static void main (String args []){

        Scanner scan1=new Scanner(System.in);
        System.out.println("please enter the grade:  ");
        int i=scan1.nextInt();

        if(i>=80){
           System.out.println("More than 80%");

        }
        else if(i>=60){

            System.out.println("More than 60%");

        }

        else if(i>=40){

            System.out.println("Average");

        }
         else

           System.out.println("Failed");


        }

     
}
