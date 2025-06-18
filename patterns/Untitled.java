import java.util.Scanner;

public class Untitled{
    public static void main(String[] args){
        int ba=5000;
        Scanner sc=new Scanner(System.in);
        System.out.println("w");
        int w=sc.nextInt();
        try {
            if((ba-w)<1000){
                    throw new Exception("bal<1000 to w");
            }
            else{
                 ba=(ba-w);
                 System.out.println("ba="+ba);
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
        finally{
            sc.close();
        }
    }
}