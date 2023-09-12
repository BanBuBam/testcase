
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Main {
    
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0)
        {
            String s = sc.next();
            int l = s.length();
            long tong = 0;
            while(l > 0)
            {
                if(l == 1)
                {
                    tong = tong +( s.charAt(l-1)-'0');
                }
                else
                {
                    String res = s.charAt(l-2) +s.charAt(l-1);
                    
                    System.out.println(res);
                    
                }
                l-=2;
                System.out.println(tong);
            }
            System.out.println(tong);
            if(tong % 11 ==0)
            {
                System.out.println("1");
            }
            else
                System.out.println("0");
        }
       
       
    }
}
