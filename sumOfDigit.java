import java.util.Scanner;
public class sumOfDigit {
    public static void main(String[] args) {
         try( Scanner input= new Scanner(System.in)){
System.out.println("enter the number");
int num =input.nextInt();
int s=sumdigit(num);
System.out.println(s);
    }
    }
    public static int sumdigit(int num){
int sum=0;

while(num >0){
    sum = sum +num%10;
   num/=10;
}
return sum;
    }
}
