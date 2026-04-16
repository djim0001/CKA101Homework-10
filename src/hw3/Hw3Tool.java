package hw3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hw3Tool {
	
	public int[] numbRandomPick1Start(int numbRange, int getCounts) {
		int[] numb = new int[numbRange];
		int[] numbPick = new int[getCounts];
		
		for(int i = 0; i < numbRange; i++) {
			numb[i] = i + 1;
		}		
		for(int j = 0; j < getCounts; j++) {
			int rd = (int)(Math.random() * numbRange);
			if(numb[rd] == -1) {
				j -= 1;
			}else {
				numbPick[j] = numb[rd];
				numb[rd] = -1;
			}
		}
		return numbPick;
	}
	public void showRandomNumb(int[] orig) {
		for(int i = 0; i < orig.length; i++) {
			System.out.println(orig[i]);
		}
	}
	
	public int numbCheck(int iMin, int iMax, String prot) {
		int i ;
		Scanner scr = new Scanner(System.in);	
		while(true) {
			System.out.println(prot);
			if(scr.hasNextInt()) {
				i = scr.nextInt();
				if(i <= iMax && i >= iMin) {			
					return i;
				}else {
					System.out.printf("錯誤，請輸入%d ~ %d的範圍%n", iMin, iMax);
					continue;
				}	
			}else{	
				scr.nextLine();
				System.out.println("錯誤，請輸入整數");
				continue;
			}
		}
	}
	public int numbCheck(String prot) {
		int i ;
		Scanner scr = new Scanner(System.in);	
		while(true) {
			System.out.println(prot);
			if(scr.hasNextInt()) {
				i = scr.nextInt();
				return i;
			}else{	
				scr.nextLine();
				System.out.println("錯誤，請輸入整數");
				continue;
			}
		}
	}
	public Set<Integer> setPickNumb(int range, int count) {
		Set<Integer> set = new HashSet<Integer>();
		while(set.size() < count) {
			int n = (int) (Math.random() * range) + 1;
			set.add(n);			
		}
		return set;
	}
	
//	public static void main(String[] args) {
//		Hw3Tool htl = new Hw3Tool();
//		int a = htl.numbCheck("輸入:");
//	}
	
}
