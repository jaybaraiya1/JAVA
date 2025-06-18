import java.util.Scanner;
public class maxim_from_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total number of elament in arr");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Element of arr");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=arr[0];
        for(int k=1;k<n;k++){
            if(j<=arr[k]){
                j=arr[k];
            }
        }
        System.out.println("maxim number from arr is="+j);
        

    }
}
