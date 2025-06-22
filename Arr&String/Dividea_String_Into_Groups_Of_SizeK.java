import java.util.Scanner;

public class Dividea_String_Into_Groups_Of_SizeK {

    public static String[] divideString(String s, int k, char fill) {
        StringBuilder sb = new StringBuilder(s);

        while (sb.length() % k != 0) {
            sb.append(fill);
        }

        int groupCount = sb.length() / k;
        String[] result = new String[groupCount];

        
        for (int i = 0; i < groupCount; i++) {
            result[i] = sb.substring(i * k, (i + 1) * k);
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        System.out.print("Enter the group size (k): ");
        int k = sc.nextInt();

        System.out.print("Enter the fill character: ");
        char fill = sc.next().charAt(0);

        
        String[] result = divideString(s, k, fill);

        
        System.out.println("Divided string groups:");
        for (String part : result) {
            System.out.println(part);
        }

        sc.close();
    }
}
