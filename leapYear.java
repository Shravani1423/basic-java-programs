import java.util.Scanner;
public class leapYear {
    public static void main(String[] args){
       try( Scanner input=new Scanner(System.in)){
        System.out.println("Enter the year:");
        int year=input.nextInt();

        if(year%4==0){
            System.out.println("year is leap");
        }
        else{
        System.out.println("year is not leap");
        }
       }}

}
