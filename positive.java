import java.util.Scanner;
public class positive {
    public static void main(String[] args) {
        try(Scanner input=new Scanner(System.in)){
            System.out.println("enter the number:");
            int num=input.nextInt();

            if (num > 0 ){
                System.out.println("number is positive");
            }
            else if (num < 0){
                System.out.println("number is negetive");
            }
            else{
                System.out.println("number is zero");
            }
        }
    }
    
}
