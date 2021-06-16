package kon;
//////////////////////////////////////////////
public class Kon2 {
	 
 public static void main(String[] args) {
 int a = 3;
 int b = 2;
 float jagamine;
 
 jagamine = a / b;
 
 System.out.println(jagamine);
 }
 ////////////////////////////////////////////

public class muutujad {
	 
 public void main(String[] args) { 
 int i = 3;
 int j = 2;
 
 System.out.println(i+=j);
 }
 /////////////////////////////////////////////
 
public class muutujad {
	 
 public static void main(String[] args) { 
 int x, y, z;
 x = 7;
 y = 6;
 
 if(x>5 && y>5){
 z = x + y;
 } else { 
 z = 0;
 }
 
 System.out.println(z);
 
/////////////////////////////////////
 
public class muutujad {
	 
 public static void main(String[] args) {
 int x, y;
 float z;
 x = 7;
 y = 6;
 z = (float)x / y;
 
 System.out.println(z);
 
//////////////////////////////////////////
 
 public class muutujad {
	 
 public static void main(String[] args) {
 double x,y,z;
 //suvaline arv
 x = Math.random()*100;
 //ümardame kaks kohta
 y = Math.round(x*100.0)/100.0;
 //astendamine
 z = Math.pow(8, 3);
 
 System.out.println(x);
 System.out.println(y);
 System.out.println(z);
 
 /////////////////////////////////////////////////////
 
 public class ylesanne2 {
 //põhiprogramm
 public static void main(String[] args) {
 ytleTere();
 }
 
 //alamprogramm
 static void ytleTere(){
 System.out.println("Tere maailm!");
 
 ///////////////////////////////////////////////////////
 
 public class ylesanne2 {
 //põhiprogramm
 public static void main(String[] args) {
 ytleTere("Java");
 }
 
 //alamprogramm argumendiga
 static void ytleTere(String nimi){
 System.out.println("Tere "+nimi+"!");
 }

///////////////////////////////////////////////////////////
 
public class ylesanne2 {
 //põhiprogramm
 public static void main(String[] args) {
 ytleTere("Java");
 
 int s = ruuduPindala(4);
 System.out.println("Ruudu pindala on "+s);
 }
 
 //tagastab täisarvulise väärtuse
 static int ruuduPindala(int a){
 int pindala = a * a;
 return pindala;
 }
 
 //alamprogramm argumendiga
 static void ytleTere(String nimi){
 System.out.println("Tere "+nimi+"!");
 }



