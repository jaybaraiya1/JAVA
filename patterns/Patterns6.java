public class Patterns6 {
    public static void main(String[] args){
        for (int i = 0; i<=5;i++) {
            for (int j = 0; j<=i;j++) {
                System.out.print(" ");
            }
            for (int k=5; k>=i; k--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(int m=0;m<=5;m++){
            for(int n=5;n>=m;n--) {
                System.out.print(" ");
            }
            for(int a=0;a<=m;a++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    
}
