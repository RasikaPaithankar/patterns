package com.test.patterns;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class demo6 {

	int i;
	static int j;
	final int num = 10;
	
	
	
	public int getI() {
		int k= 1;
		System.out.println(k);
		return this.i;
	}
	
//	public static int getJ() {
//		return demo6.j;
//	}
	
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) 
		{
			for(int j = 1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("************************");
		System.out.println();
		
		
		for(int i = 1; i<= 5; i++) 
		{
			for(int j = 1; j <= 6-i; j++ )
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("************************");
		System.out.println();
		
		int k =1;
		for(int i=1; i<=4; i++) 
		{
			for(int j=1; j<=i; j++) 
			{
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("************************");
		System.out.println();
		
		String s =" ";
		for(int i = 1; i<=6; i++) 
		{
			if(i % 2 != 0)
			{
				s  = "1 " + s;
			}
			else 
			{
				s = "0 " + s;
			}
			System.out.print(s);
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("************************");
		System.out.println();
		
		String r  = "1";
		System.out.println(" ".repeat(9-1) +r);
		for(int i=2; i<=9; i++) 
		{
			String emp = " ".repeat(9-i);
			System.out.println( emp + i + r +  i);
			r = i + r +  i;
		}
		
		
		System.out.println();
		System.out.println("************************");
		System.out.println();
		
		
		for(int i = 1; i <=6; i++) 
		{
			System.out.println(" ".repeat(6-i) + "*****");
		}	
		
		
		System.out.println();
		System.out.println("********Test*********");
		System.out.println();
		
		
		String r1  = "*";
		System.out.println(" ".repeat(4-1) +r1);
		for(int i=2; i<=4; i++) 
		{
			String emp = " ".repeat(4-i);
			System.out.println( emp + "*" + r1 + "*");
			r1 = "*" + r1 + "*";
		}
		
		String start = "*******";
		for(int i = 1; i <= 4; i++ ) 
		{
			if(start.length() > 4) 
			{
				String emp = " ".repeat(i);
				start = start.substring(i);
				start = start.substring(0 , start.length() -1);
				start = emp + start;
				System.out.println(start);
			}
		}
		

		System.out.println();
		System.out.println("********Test*********");
		System.out.println();
		
		String s1 = "      ";		
		
		for(int i = 1; i<= 6/2; i++) 
		{
			String starPattern = "";
			s1 =  s1.substring(i, s1.length() - i);
			for(int j = 1; j <= i; j++) {
				starPattern += "*";
			}
			s1 = starPattern + s1 + starPattern;
			System.out.println(s1);
		}
		
	
		System.out.println();
		System.out.println("********Test*********");
		System.out.println();
		
		
		for(int i = 1; i<= 6; i++) 
		{
			int l = i; 
			
			for(int m = 1; m <=i; m++) 
			{
				System.out.print(" ");
			}
			
			for(int j = 1; j <= 6; j++) 
			{
				if(l <= 6 && i ==1)
				System.out.print(l++ + " ");
				else if(l <= 6) 
				{
					System.out.print(l++ + " ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("********Test*********");
		System.out.println();
		
		
		for(int i = 1; i<= 6; i++) 
		{
			int l = i; 
			
			for(int m = 1; m <=i; m++) 
			{
				System.out.print(" ");
			}
			
			for(int j = 1; j <= 6; j++) 
			{
				if(l <= 6 && i ==1)
				System.out.print(l++ + " ");
				else if(l <= 6) 
				{
					System.out.print(l++ + " ");
				}
			}
			System.out.println();
		}
		
		int h = 2;
		for(int i = 5 ; i>=1; i--)
		{
			int temp = i;
			for(int l = i+1; l > 1; l--) 
			{
				System.out.print(" ");
			}
			
			for(int j = 1; j <= h ; j++)
			{
				System.out.print(temp++ + " ");
			}
			h++;
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("********Test*********");
		System.out.println();
		
		
		
		for(int i = 1; i< 6; i++) 
		{
			String st = " ".repeat(6);
			if(st.length()-i >= 1) {
				st = st.substring(1, st.length()-i);
				System.out.print(st);
			}
			
			for(int j = 1; j <= (2 * i - 1) ; j++)
			{
				if(j == 1 || i == 5 || j == (2 * i - 1))
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		
		
		System.out.println();
		System.out.println("********Test*********");
		System.out.println();
				
		
		ArrayList<Integer>  al = new ArrayList<Integer>();
		al.add(1);
		al.add(5);
		al.add(1);
		al.add(4);
		al.add(1);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		List<Integer> test = al.stream().filter(value -> !hs.add(value)).collect(Collectors.toList());
		
		for (Integer integer : test) {
			System.out.println(integer);
		}
		
		
		String rev = "aba";
		StringBuilder sb = new StringBuilder(rev);
		sb = sb.reverse();
		
		System.out.println(rev);
		System.out.println(sb);
		
		System.out.println(rev.contentEquals(rev));
		
		
		// check palindrome 
		boolean result = true;
		
		for(int i = 0; i < rev.length()/2; i++)
		{
			if(rev.charAt(i) != rev.charAt(rev.length()- i - 1) )
			{
				result = false;
				break;
			}
		}
		
		System.out.println("Is palindrome " + result);
		
		demo6 demo6 = new demo6();
		System.out.println(demo6.getI());
		
		System.out.println(demo6.j);
		
		System.out.println("********Test*********");

	
		int [][][] arr = {{{1,2,3,4},{4,5,6,7},{7,8,9,10}}};
		for (int[][] is : arr) {
			for (int[] is2 : is) {
				for (int is3 : is2) {
					System.out.print(is3 + " ");
				}
				System.out.println();
			}
		}
		
		String sp = "Java is best";
		String[] sarr= sp.split(" ");
		for (String string : sarr) {
			System.out.println(string);
		}
		
		StringBuilder sb1 = new StringBuilder();
		for(int i = sarr.length - 1 ; i >= 0; i--) {
			sb1.append(sarr[i] + " ");
		}
		
		System.out.println(sb1);
	}
	
	

}
