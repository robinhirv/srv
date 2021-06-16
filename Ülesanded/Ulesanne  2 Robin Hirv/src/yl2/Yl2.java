package yl2;

public class Yl2 {

	public static final double tollid = 39.370;
	public static void main(String[] args) {
		 ytleTere("Tulemast");
		 
		 double tollid = 100.5;
		 System.out.println("Tollid: "+tollid);;
		 double meetrid = tollid / 39.370;
		 System.out.println("Vastus: "+meetrid+"m");
		 }
		 static void ytleTere(String nimi){
		 System.out.println("Tere "+nimi+"!");
	}

}
