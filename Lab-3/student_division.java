

import java.util.Scanner;
public class student_division {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int Percentage=((a+b+c+d+e)/5);
        if(Percentage<40){
            System.out.println("fail");
        }
        else if(Percentage<49){
            System.out.println("Third division");
        }
        else if(Percentage<59){
            System.out.println("second division");
        }
        else if(Percentage<60){
            System.out.println("first division");
        }
       else{
        System.out.println("not defined");
       }
    }
}
