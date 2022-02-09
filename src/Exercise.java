
import java.util.Scanner;

//package domain;

public class Exercise {
    public static String Calculate(String s){
      System.out.print("Введіть ваше число долі: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        while (s.length() > 1) {
            int sum = 0;
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    sum += (c - '0');
                }
            }
            s = String.valueOf(sum);
           
        }
        return s;
    }
}
   
    
    