package Day1;

import java.util.Scanner;

public class RevString {

    public static void main(String[] args)
    {
        String rev;

        Scanner sc = new Scanner(System.in);
        rev = sc.nextLine();

        System.out.println(rev);

        for(int i=rev.length()-1; i>=0;i--)
        {
            System.out.print(rev.charAt(i));
        }
    }
}
