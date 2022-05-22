// Cant be bothered to show you how to compile the program right now smh. May make a video on my youtube channel how to install Java and Configure it in an IDE For now. Just follow a youtube video on jow to install Java and an  IDE.I promise you this,  it is quite simple:))


import java.util.Scanner;//Imports are used to import classes into project. In this case, we are importing the scanner class to read and input data

public class VotingEligibility {

    public static void main(String[] args) {

        //Unassigned Variables
        String name;//Store name input  as string
        int age;//Store age input as int
        int agelimit; //Store agelimit value as int
        int waitforvoting;//Variable declaration


        agelimit = 18;//Variable


        Scanner Myobj = new Scanner(System.in);//Created a Scanner object and named it Myobj
        System.out.println("Enter your name");//Allow user to input name
        name = Myobj.next();//Read user input Note. For strings , the  next method from the class  is to be used. 
        System.out.println("What is your age?");//Allow user to input age
        age = Myobj.nextInt();//Read age which is a type of int so we use the nextint() method
        waitforvoting = agelimit - age;//Simple arithmetic calculation


        if (age < agelimit){
            System.out.println(" Unfortunately "+name+ " are not eligible to vote  yet, you have to wait for  "+ waitforvoting + " more years to cast your vote. Thank you for using our program");

        }else {
            System.out.println("Go and cast your vote now!");
        }









    }


}
