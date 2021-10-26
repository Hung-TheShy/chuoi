
package bai3;
import java.util.Arrays;
import java.util.Scanner;
public class toString {
    public static void main(String[] args) {
        
        int n;
       
        Scanner scanner = new Scanner(System.in);
        do {
        System.out.println("Nhập vào số phần tử của mảng: ");
        n = scanner.nextInt();
    } while (n < 0);
         char array[] = new char[n];
         
    System.out.println("Nhập các phần tử cho mảng: ");
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập phần tử thứ " + i + ": ");
        array[i] = scanner.next().charAt(0);
        
    }
    System.out.println(Arrays.toString(array));
    }
    
    
    
