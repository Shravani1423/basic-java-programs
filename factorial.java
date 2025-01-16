import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        try(Scanner input=new Scanner(System.in)){
            System.out.println("Enter the number:");
            int num=input.nextInt();
            int fact=Fact(num);
            System.out.println(fact);
        }
    
    }
    
    static int Fact(int num){
        int fact=1;
        int i=1;
        if(num < 1){
            return 1;
        }
       for(i=1;i<=num;i++){
        // while(i<= num){
             fact*=i;
        //     i++;
         }
        return fact;
    }
}
