package yl2;
import java.util.*;
public class Yl4yl4 {


	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("Sisesta tekst: ");
	String a = sc.nextLine();
	System.out.println("Teie sisestus: "+a);
	System.out.println("Teie sisestus suurte t�htedega: "+a.toUpperCase());
	System.out.println("Teie sisestuses t�hti: "+a.length());
	String[] xxx = a.split(" ");
	System.out.println("Teie sisestuses s�nu: "+xxx.length);
	System.out.println("Teie sisestatud esimene s�na on: "+xxx[0]);
	}

}
