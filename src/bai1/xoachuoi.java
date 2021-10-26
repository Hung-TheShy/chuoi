
package bai1;

import java.util.Scanner;
public class xoachuoi {  
    public static void main(String[] args) {
        String str1;
        String str2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
         str1 = scanner.nextLine();
         str2 = str1.replaceAll("\\s","");
        System.out.println(str2);
    }

}
