import java.util.Scanner;
public class addtownoInput {
    public static void main(String[] args) {
        System.out.print("enter first no:");
        try(Scanner Input= new Scanner(System.in)){
        int no1=Input.nextInt();
        System.out.print("enter second no:");
       
        int no2=Input.nextInt();
        int sum=no1+no2;
        System.out.println("addtion of two number is:"+sum);
        }
    }
}
