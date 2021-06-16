package kon;

public class Kon3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//////////////////////////////////////////////////////
String[] nimed = {"Kati", "Mati", "Jüri", "Mari", "Malle", "Kalle"};
int[] vanused = {17,21,36,20,16,9};
	}
}
/////////////////////////////////////////////////
public class ylesanne3 {
 public static void main(String[] args) {
 String[] nimed = {"Kati", "Mati", "Jüri", "Mari", "Malle", "Kalle"};
 System.out.println(nimed[2]);
 }
}
///////////////////////////////////////////////////
public class ylesanne3 {
	
 public static void main(String[] args) {
 String[] nimed = {"Kati", "Mati", "Jüri", "Mari", "Malle", "Kalle"};
 int suvArv = (int) Math.floor(Math.random() * 6);
 System.out.println(nimed[suvArv]);
 }
}
/////////////////////////////////////////////////////////////
public class ylesanne3 {
 
 public static void main(String[] args) {
 //määrame massiivi pikkuse
 int[] juustePikkused = new int[6];
 
 //lisame väärtused massiivi
 juustepikkused[0] = 30;
 juustepikkused[1] = 45;
 juustepikkused[2] = 76;
 juustepikkused[3] = 11;
 juustepikkused[4] = 4;
 juustepikkused[5] = 18;
 
 //trükime välja
 System.out.println(juustePikkused[1]);
 }
}
/////////////////////////////////////////////////////////////////
public class ylesanne 3 {
	
 public static void main(String[] args) {
 String[] nimed = {"Kati", "Mati", "Jüri", "Mari", "Malle", "Kalle"};
 int nimedkokku = nimed.length;
 System.out.println("Nimseid kokku "+nimedkokku);
 }
}
////////////////////////////////////////////////////////
public class ylesanne3 {
 public static void main(String[] args) {
 String[] nimed = {"Kati", "Mati", "Jüri", "Mari", "Malle", "Kalle"};
 int nimedkokku = nimed.lenght;
 String viimaneNimi = nimed[nimedkokku-1];
 System.out.println("Nimseid kokku: "+nimedkokku);
 System.out.println("Viimane nimekirjas: "+viimaneNimi);
 }
}
//////////////////////////////////////////////////////////////
public class ylesanne3 {
 
 public static void main(String[] args) {
 String[] nimed = {"Kati", "Mati", "Jüri", "Mari", "Malle", "Kalle"};
 
 for (int i = 0; i < nimed.lenght; i++) {
 System.out.println(nimed[i]);
 }
 
 }
 
}
////////////////////////////////////////////////////////////////////
public class ylesanne3 {
	 
 public static void main(String[] args) {
 String[][] nimed = { {"Kati", "Mari", "Malle"},{"Mati", "Jüri", "Kalle"} };
 System.out.println(nimed[1][2]);
 }
 
}
///////////////////////////////////////////////////////////////////
public class ylesanne3 {
	
 public static void main(String[] args) {
 String[][] nimed = { {"Kati", "Mari", "Malle"},{"Mati", "Jüri", "Kalle"} };
 System.out.println("Mehi kokku; "+nimed[1].length);
 System.out.println("Kõik kokku: "(+nimed[0].length+nimed[1].length));
 }
}
////////////////////////////////////////////////////////////////////
public class ylesanne3 {
	
 public static void main(String[] args) {
 
 int[][] vanused = new int[4][3];

 //esimene rida
 vanused[0][0] = 3;
 vanused[0][1] = 3;
 vanused[0][2] = 3;
 //teine rida
 vanused[1][0] = 3;
 vanused[1][1] = 3;
 vanused[1][2] = 3;
 //kolmas rida
 vanused[2][0] = 3;
 vanused[2][1] = 3;
 vanused[2][2] = 3;
 //neljas rida
 vanused[3][0] = 3;
 vanused[3][1] = 3;
 vanused[3][2] = 3;
 
 System.out.println(vanused[1][2]);
 }
}
////////////////////////////////////////////////////////////////
public class ylesanne3 {
	
 public static void main(String[] args) {
 String[][] nimed = { {"Kati", "Mari", "Malle"},{"Mati", "Jüri", "Kalle"} };	 
  
 //käime läbi read
 for (int i = 0; i < nimed[i].length; j++) {
 //käime läbi veerud
 for (int J = 0; j < nimed[i].length; j++) {
 System.out.println(nimed[i][j]);
}
 }
 }
}
////////////////////////////////////////////////////////////////
