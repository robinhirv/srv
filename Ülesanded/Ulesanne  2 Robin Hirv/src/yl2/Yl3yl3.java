package yl2;

public class Yl3yl3 {
	 
	 public static void main(String[] args) {
	 int [] nimed = {12,5,10,10,28,17,5,19,0,13,0,22,7,0,17,2,24,1,13,29,0,7,16,8,7,4};
	 int nimedKokku = nimed.length;
	 int viimaneNimi = nimed[nimedKokku-1];
	 int x = 437;
	 int y = 36;
	 float test;
	 test = x/y;
	 int all = 0;
	 for (int i = 0; i < nimed.length; i++) {
	 all = all + nimed[i];
	 }
	 System.out.println("Esimese elemendi väärtus on: "+nimed[0]);
	 System.out.println("Viimase elemendi väärtus on: "+viimaneNimi);
	 System.out.println("Elemente kokku: "+nimedKokku);
	 System.out.println("Elementide summa: "+all);
	 System.out.println("Elementide kesmine on: "+test);
	 }
	 
	}
