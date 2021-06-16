package yl2;

public class Yl4 {

	public static void main(String[] args) {
		 ytleTere("Tulemast");
		 
		 double aeg = 0.5;
		 double pikkus = 10;
		 double vastus1 = pikkus / aeg;
		 System.out.println("1. Sportlase Teekond: "+pikkus+"km");
		 System.out.println("1. Sportlase Aeg: "+aeg+"h\n");
		 double aeg2 = 0.9;
		 double pikkus2 = 80;
		 double vastus2 = pikkus2 / aeg2;
		 double vastus3 = vastus2 - vastus1;
		 System.out.println("2. Sportlase Teekond: "+pikkus+"km");
		 System.out.println("2. Sportlase Aeg: "+aeg+"h\n");
		 System.out.println("1. Sportlase kiirus: "+vastus1+" km/h");
		 System.out.println("2. Sportlase kiirus: "+vastus2+" km/h\n");
		 System.out.println("2. Sportlane oli "+vastus3+"km/h kiirem 1.Sportlasest"); }
		 static void ytleTere(String nimi){
		 System.out.println("Tere "+nimi+"!");
	}

}

