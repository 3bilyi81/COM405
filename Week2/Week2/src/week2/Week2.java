/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;
import java.util.Scanner;
/**
 *
 * @author 3bilyi81
 */

public class Week2 {

    public static void main(String[] args) {
       /* int a = 1;
       while(a <= 20) {
    System.out.println(a);
    a++;
    }
       for(int b = 1; b <= 20; b++){
    System.out.println(b);
    }
       int c = 1;
       while(c <= 20){
       System.out.println(c);
       c+=2;
       }
       for(int d = 1; d <= 20; d+=2){
    System.out.println(d);
        
int a = 5;
       while(a <= 15) {
    System.out.println(a);
    a++;
    }
       for(int b = 5; b <= 15; b++){
    System.out.println(b);
    }
/*
        
        */
        
    
/*int a = 10;
       while(a >= 1) {
    System.out.println(a);  
    a--;
    }
       for(int b = 10; b >= 1; b--){
    System.out.println(b);
    }
/*
       
       */

// Be nice! Give the user some instruction
/*System.out.println("Please enter the letter which corresponds with your choice:");
System.out.println("a – Calculate the area of a rectangle");
System.out.println("b – Display a multiplication table");
System.out.println("c – Add two numbers");
System.out.println("x – Exit program");
System.out.println("Please enter your choice");
// Create a Scanner object
Scanner scanIn = new Scanner(System.in);
// Get the data the user entered in to the console
// screen and store it in a variable called input
String input = scanIn.nextLine();
// Close the scanner

int state = 1;
while(state >= 1){
        
if(input.equals("a")){
 System.out.println("You have selected: " + input + " - Area of a rectange");
 System.out.println("Please enter width: " );
 int W = Integer.parseInt(scanIn.nextLine());
 System.out.println("Please enter height: " );
 int H = Integer.parseInt(scanIn.nextLine());
 System.out.println("The area of the rectangle is: " + W*H);

}
else if(input.equals("b")){
System.out.println("You have selected: " + input + " - Display a multiplication table");
    System.out.println("Please enter a number: " );
    int Y = Integer.parseInt(scanIn.nextLine());
    for(int B = 1; B<=12; B++){
    System.out.println("The area of the rectangle is: " + (Y*B));
    }
}
else if(input.equals("x")){
            state = 0;
        }
else{
System.out.println("You have selected: " + input + " - Add two numbers");
 System.out.println("Please enter number 1: " );
 int N = Integer.parseInt(scanIn.nextLine());
 System.out.println("Please enter number 2: " );
 int M = Integer.parseInt(scanIn.nextLine());
 System.out.println("The answer is: " + (N+M));
}
}


scanIn.close();
/*

*/
/*for(int i=0; i<1; i++){ 
			for(int j=0; j<3; j++){
				System.out.print("*");
			}
			System.out.println();
		}
for(int i=0; i<3; i++){ 
			for(int j=0; j<3; j++){
				System.out.print("*");
			}
			System.out.println();
		}
/*


for(int i=0; i<4; i++){ 
			for(int j=0; j<=i; j++){
				System.out.print("*");  
			}
                        
			System.out.println();
		}
/*

*/
/*for(int row=0; row<=4; row++){ 
   
			for(int i=1; i<=row; i++){
				System.out.print("*");
                                
			}
                        
			System.out.println();
		}
/*

*/
/*for(int row=0; row<=3; row++){ 
   
			for(int i=1; i<=5; i++){
				if(i == row+1){
                                System.out.print(" ");
                               
                                }
                                else{
                                    
                                System.out.print("*");
                                
                                }
                                
			}
                        
			System.out.println();
		}
		}
    }
/*

*/
    
       
    
    


