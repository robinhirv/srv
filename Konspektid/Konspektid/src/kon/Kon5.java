package kon;

public class Kon5 {

	public static void main(String[] args) {
	}
}
/////////////////////////////////////////////////////////////////////
if (tingimus) {
 tegevus kui on t�ene
}
/////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public static void main(String[] args) {
 int pikkus = 203;
 if (pikkus >= 200) {
 System.out.println("T�itsa pikk poiss");
 }
 }
}
//////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public static void main(String[] args) {
 int pikkus = 203;
 if (pikkus >= 200) {
 System.out.println("T�itsa pikk poiss");
 } else {
 System.out.println("Liiga l�hike");
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
tingimus ? t�eneLause : v��rLause
//////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public static void main(String[] args) {
	 
 int arv = -5;
 String tulemus = arv >= 0 ? "Sobib" : "Liiga v�ike";
 System.out.println(tulemus);
	 
 }
}
//////////////////////////////////////////////////////////////////////
switch (avaldis) {
	case v��rtus 1: tegevus;
		break;
	...
	case v��rtus-n: tegevus-n;
		break;
	default: vaikimisi_tegevus;
	
	
}
//////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public csatic void main(String[] args) {

 int hinne = 4;
 
 switch (hinne) {
 case 5: System.out.println("V�ga hea");
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
	 System.out.println(i+". p�kapikk");
 }
 }
}

//V�ljund
/*
1. p�kapikk
2. p�kapikk
3. p�kapikk
4. p�kapikk
5. p�kapikk
6. p�kapikk
7. p�kapikk
8. p�kapikk
9. p�kapikk
10. p�kapikk
*/
///////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public static void main(String[] args) {
	 
 String[] nimed = {"Kati", "Mati", "J�ri", "Mari", "Malle", "Kalle"};
 
 for (int i = 0; i < nimed.length; i++) {
	 System.out.println(i+1+". "+nimed[i]);
 }
 }
}

//V�ljund
/*
1. Kati
2. Mati
3. J�ri
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

//V�ljund
/*
1. p�kapikk
2. p�kapikk
3. p�kapikk
4. p�kapikk
5. p�kapikk
6. p�kapikk
7. p�kapikk
8. p�kapikk
9. p�kapikk
10. p�kapikk
*/
//////////////////////////////////////////////////////////////////////
public class ylesanne5 {
 public static void main(String[] args) {

 String[] nimed = {"Kati", "Mati", "J�ri", "Mari", "Malle", "Kalle"}; 
 
 for (int i = 0; i < nimed.length; i++) {
	 System.out.println(i+1+". "+nimed[i]);
 }
 }
}

//V�ljund
/*
1. Kati
2. Mati
3. J�ri
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

//V�ljund
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

 String[] nimed = {"Kati", "Mati", "J�ri", "Mari", "Malle", "Kalle"};
 
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