package yl2;

public class Yl3 {

	public static final double tollid = 39.370;
	public static void main(String[] args) {
		 ytleTere("Tulemast");
		 
		 int tunnid = 11;
		 int minutid = 120;
		 double vastus2 = minutid / 60;
		 System.out.println("Minutid: "+minutid);
		 System.out.println("Tunnid: "+tunnid);
		 double vastus = 60 * tunnid;
		 System.out.println("Minutite Vastus: "+vastus+" minutit");
		 System.out.println("Tundide Vastus: "+vastus2+" tundi");
	}
		 static void ytleTere(String nimi){
		 System.out.println("Tere "+nimi+"!");
	}

}
