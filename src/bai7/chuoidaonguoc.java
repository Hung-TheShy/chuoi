
package bai7;

import java.io.*;
import java.util.*;
public class chuoidaonguoc {
    public static void main(String args[]){
  String input ="";
  System.out.println("Nhap chuoi can dao nguoc");
  try{
   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
   input = bufferedReader.readLine();
   char []stt = input.toCharArray();
   for(int i =stt.length-1 ;i>=0;i--){
    System.out.print(stt[i]);
   }
     }catch(IOException e){
     }
 }
}
