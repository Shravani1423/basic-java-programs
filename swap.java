 import java.util.Scanner;
 class swap {
    public static void main(String[] args) {
      try(Scanner input = new Scanner(System.in)){
        System.out.println("enter value for a:");
        int a=input.nextInt();

        System.err.println("enter value for b:");
        int b=input.nextInt();

        int c=a;
        a=b;
        b=c;
        System.out.println("value of a is :"+a);
        System.out.println("value of b is:"+b);
      }

    }
}

// class swap{
//     public static void main(String[] args) {
//         int a=10;
//         int b=20;
//         int c;
//         System.out.println("value of a is:"+a);
//         System.out.println("value of b is:"+b);
//         c=a;
//         a=b;
//         b=c;
//         System.out.println("after swapping");
//         System.out.println("a:"+a);
//         System.out.println("b:"+b);
//     }
//}