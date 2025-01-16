import java.util.Scanner;
public class EvenOdd {
public static void main(String[] args){
    try(Scanner input=new Scanner(System.in)){
        System.out.print("Enter the number:");
        int num=input.nextInt();

        if(num%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.print("number is odd");
        }
    }
}
    
}
