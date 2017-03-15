/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package show2;

/**
 *
 * @author Admin
 */
import java.io.IOException;
import java.util.Scanner;

public class NewMain {
	
	 public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] tr = new String[4];
        int i;
        for(i=0;i<tr.length;i++){
        System.out.print("введіть строку :");
            tr[i] = sc.next();
        }
     for(i=0;i<tr.length;i++){   
    printResult(check(tr[i]), tr[i]);
     }
	    }
	 
	 public static void printResult(boolean flag, String s) {
	        if (flag) System.out.println(s+" : Hexadecimal");
	        else System.out.println(s+" : String");

}

    private static boolean check(String str) {
        return str.contains("0x") || str.contains("0X");
    }
}

