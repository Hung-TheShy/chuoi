
package bai4;

import java.util.Scanner;
public class tachchuoi {
    public static void main(String[] args) {
        String str1;
         Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
         str1 = scanner.nextLine();
         String[] words = str1.split("\\s");
  
        for (String w : words) {
            System.out.println(w);
  }
    }
}
