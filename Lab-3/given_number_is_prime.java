import java.util.Scanner;
public class given_number_is_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  number");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>0){
            System.out.println("number is not prime");
        }
        else{
            System.out.println("number is prime ");
        }
    }
}
