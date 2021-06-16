package kon;

public class Kon5 {

	public static void main(String[] args) {
	}
}
/////////////////////////////////////////////////////////////////////
if (tingimus) {
 tegevus kui on tõene
}
/////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public static void main(String[] args) {
 int pikkus = 203;
 if (pikkus >= 200) {
 System.out.println("Täitsa pikk poiss");
 }
 }
}
//////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public static void main(String[] args) {
 int pikkus = 203;
 if (pikkus >= 200) {
 System.out.println("Täitsa pikk poiss");
 } else {
 System.out.println("Liiga lühike");
 }
 }
}

///////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public static void main(String[] args) {
 
 int punktid = 60;
 
 if (punktid >= 90) {
 System.out.println("hinne: 5");
 } else if(punktid >= 70){
 System.out.println("hinne: 4");
 } else if(punktid >= 50){
 System.out.println("hinne: 3");
 } else {
 System.out.println("hinne: 2");
 }
 }
}
//////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public static void main(String[] args) {

 int arv = 7;
 
 if (arv%2 == 0) {
 System.out.println("Paaris");
 } else {
 System.out.println("Paaritu");
 }
 }
}
///////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public static void main(String[] args) {
 
 int arv = 16;
 
 if (arv>=15 && arv<=18) {
 System.out.println("Sobib!");
 }
 
 }
}
///////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public static void main(String[] args) {
	
 String roll = "kasutaja";
 
 if (roll.equals("admin")) {
 System.out.println("Tere admin!");
 } else {
 System.out.println("Tere kasutaja!");
 }
 
 }
}
///////////////////////////////////////////////////////////////////////
tingimus ? tõeneLause : väärLause
//////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public static void main(String[] args) {
	 
 int arv = -5;
 String tulemus = arv >= 0 ? "Sobib" : "Liiga väike";
 System.out.println(tulemus);
	 
 }
}
//////////////////////////////////////////////////////////////////////
switch (avaldis) {
	case väärtus 1: tegevus;
		break;
	...
	case väärtus-n: tegevus-n;
		break;
	default: vaikimisi_tegevus;
	
	
}
//////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public csatic void main(String[] args) {

 int hinne = 4;
 
 switch (hinne) {
 case 5: System.out.println("Väga hea");
 break;
 case 4: System.out.println("Hea");
 break;
 case 3: System.out.println("Rahuldav");
 break;
 default: System.out.println("Kasin");
 }
 }
}
///////////////////////////////////////////////////////////////////////
for (int i = 0; i < 10; i++) {
	System.out.println("Hello World!");
}
//////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public static void main(String[] args) {
	 
 for (int i = 1; i <= 10; i++) {
	 System.out.println(i+". päkapikk");
 }
 }
}

//Väljund
/*
1. päkapikk
2. päkapikk
3. päkapikk
4. päkapikk
5. päkapikk
6. päkapikk
7. päkapikk
8. päkapikk
9. päkapikk
10. päkapikk
*/
///////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public static void main(String[] args) {
	 
 String[] nimed = {"Kati", "Mati", "Jüri", "Mari", "Malle", "Kalle"};
 
 for (int i = 0; i < nimed.length; i++) {
	 System.out.println(i+1+". "+nimed[i]);
 }
 }
}

//Väljund
/*
1. Kati
2. Mati
3. Jüri
4. Mari
5. Malle
6. Kalle
*/
//////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public static void main(String[] args) {
 
 for (int i = 1; i < 10; i++) {
 for (int j = 0; j < i; j++) {
 System.out.println("*");
 }
 System.out.println("");
 }
 }
}

//Väljund
/*
1. päkapikk
2. päkapikk
3. päkapikk
4. päkapikk
5. päkapikk
6. päkapikk
7. päkapikk
8. päkapikk
9. päkapikk
10. päkapikk
*/
//////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public static void main(String[] args) {

 String[] nimed = {"Kati", "Mati", "Jüri", "Mari", "Malle", "Kalle"}; 
 
 for (int i = 0; i < nimed.length; i++) {
	 System.out.println(i+1+". "+nimed[i]);
 }
 }
}

//Väljund
/*
1. Kati
2. Mati
3. Jüri
4. Mari
5. Malle
6. Kalle
*/
//////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public static void main(String[] args) {
	 
 for (int i = 1; i < 10; i++) {
 for (int j = 0; j < i; j++) {
 System.out.println("*");
 }
 System.out.println("");
 }
 }
}

//Väljund
/*
*
**
***
****
*****
******
*******
********
*********
*/
//////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public static void main(String[] args) {

 String[] nimed = {"Kati", "Mati", "Jüri", "Mari", "Malle", "Kalle"};
 
 for (String i : nimed) {
	 System.out.println(i);
 }
 }
}
///////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public static void main(String[] args) {

 int arv = 1;
 
 while(arv<=10){
	 System.out.println(arv);
	 arv++;
 }
 }
}