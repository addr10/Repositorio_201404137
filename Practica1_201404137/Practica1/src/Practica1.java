import java.util.Random;
import java.util.Scanner;
//German Adrian Ruano Alegria
//201404137
//IPC1A

public class Practica1 {
	
	public static void aLetra(int numero){
		if (numero>=0&&numero<=29){
			switch(numero){
			case 0:
				System.out.println("Cero");
				break;
			case 1:
				System.out.println("Uno");
				break;
			case 2:
				System.out.println("Dos");
				break;
			case 3:
				System.out.println("Tres");
				break;
			case 4:
				System.out.println("Cuatro");
				break;
			case 5:
				System.out.println("Cinco");
				break;
			case 6:
				System.out.println("Seis");
				break;
			case 7:
				System.out.println("Siete");
				break;
			case 8:
				System.out.println("Ocho");
				break;
			case 9:
				System.out.println("Nueve");
				break;
			case 10:
				System.out.println("Diez");
				break;
			case 11:
				System.out.println("Once");
				break;
			case 12:
				System.out.println("Doce");
				break;
			case 13:
				System.out.println("Trece");
				break;
			case 14:
				System.out.println("Catorce");
				break;
			case 15:
				System.out.println("Quince");
				break;
			case 16:
				System.out.println("Dieciceis");
				break;
			case 17:
				System.out.println("Diecisiete");
				break;
			case 18:
				System.out.println("Dieciocho");
				break;
			case 19:
				System.out.println("Diecinueve");
				break;
			case 20:
				System.out.println("Veinte");
				break;
			case 21:
				System.out.println("Veintiuno");
				break;
			case 22:
				System.out.println("Veintidos");
				break;
			case 23:
				System.out.println("Veintitres");
				break;
			case 24:
				System.out.println("Veinticuatro");
				break;
			case 25:
				System.out.println("Veinticinco");
				break;
			case 26:
				System.out.println("Veintiseis");
				break;
			case 27:
				System.out.println("Veintisiete");
				break;
			case 28:
				System.out.println("Veintiocho");
				break;
			case 29:
				System.out.println("Veintinueve");
				break;
			}
		}
		else if (numero>=30&&numero<=99){
			int d=numero/10;
			int u=numero%10;
			switch (d){
			case 3:
				System.out.print("Treinta");
				break;
			case 4:
				System.out.print("Cuarenta");
				break;
			case 5:
				System.out.print("Cincuenta");
				break;
			case 6:
				System.out.print("Sesenta");
				break;
			case 7:
				System.out.print("Setenta");
				break;
			case 8:
				System.out.print("Ochenta");
				break;
			case 9:
				System.out.print("Noventa");
				break;
			}
			switch (u){
			case 1:
				System.out.print(" y Uno");
				break;
			case 2:
				System.out.print(" y Dos");
				break;
			case 3:
				System.out.print(" y Tres");
				break;
			case 4:
				System.out.print(" y Cuatro");
				break;
			case 5:
				System.out.print(" y Cinco");
				break;
			case 6:
				System.out.print(" y Seis");
				break;
			case 7:
				System.out.print(" y Siete");
				break;
			case 8:
				System.out.print(" y Ocho");
				break;
			case 9:
				System.out.print(" y Nueve");
				break;
			case 0:
				System.out.print("");
				break;
			}
			System.out.println();
		}
		else if (numero==100)
			System.out.println("Cien");
		else
			System.out.println("Numero Erroneo");
	}
	
	public static int aDecimal(String romano1){
		String romano=romano1.toUpperCase();
		int dec=0;
		for(int car=0;car<romano.length();car++){
			char l=romano.charAt(car);
			switch (l){
			case 'I':
				dec+=1;
				break;
			case 'V':
				dec+=5;
				break;
			case 'X':
				dec+=10;
				break;
			case 'L':
				dec+=50;
				break;
			case 'C':
				dec+=100;
				break;
			}
		}
		if (romano.contains("IV")) dec-=2;
		if (romano.contains("IX")) dec-=2;
		if (romano.contains("XL")) dec-=20;
		if (romano.contains("XC")) dec-=20;
	    return dec;
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner menu=new Scanner(System.in);
		System.out.println("Quiere Ingresar al Nivel 1 ó 2?");
		int nivel=menu.nextInt();
		if (nivel==1){
			System.out.println("Ingrese el numero de ejercicio:");
			int ejercicio=menu.nextInt();
			if (ejercicio==1){
				System.out.println("Ejercicio #"+ejercicio);
				for(int i=1;i<6;i++){
					for(int j=5;j>i;j--)
						System.out.print(" ");
					for(int k=0;k<i;k++)
						System.out.print("*");
					for(int m=1;m<i;m++)
						System.out.print("*");
					
					System.out.println();
				}
				for(int i=4;i>0;i--){
					for(int j=i;j<5;j++)
						System.out.print(" ");
					for(int k=0;k<i;k++)
						System.out.print("*");
					for(int m=1;m<i;m++)
						System.out.print("*");
					System.out.println();
				}
			}
			else if(ejercicio==2){
				System.out.println("Ejercicio #"+ejercicio);
				System.out.println("ingrese 6 notas");
				Scanner sc= new Scanner(System.in);
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();
				int d=sc.nextInt();
				int e=sc.nextInt();
				int f=sc.nextInt();
				int nota=((a+b+c+d+e+f)/6);
				if (nota>89&&nota<101)
					System.out.println("Nota: A");
				else if (nota>79&&nota<90)
					System.out.println("Nota: B");
				else if (nota>69&&nota<80)
					System.out.println("Nota: C");
				else if (nota>59&&nota<70)
					System.out.println("Nota: D");
				else 
					System.out.println("Nota: E");
				sc.close();
			}
			else if (ejercicio==3){
				System.out.println("Ejercicio #"+ejercicio);
				System.out.println("Ingrese la hora (hh:mm):");
				Scanner sc= new Scanner(System.in);
				String t=sc.nextLine();
				if (t.length()!=5)
					System.out.println("La Cantidad de caracteres no es Correcta");
				else{
					String h=t.substring(0,2);
					String min=t.substring(2,5);
					int hora=Integer.parseInt(h);
					if (hora>0&&hora<12)
						System.out.println(hora+min+" AM.");
					else if (hora>12&&hora<24)
						System.out.println((hora-12)+min+" PM.");
					else if (hora==0)
						System.out.println("12"+min+" AM.");
					else if (hora==12)
						System.out.println("12"+min+" PM.");
					else
						System.out.println("Valores Incorrectos");
				}
				sc.close();
			}
			else if (ejercicio==4){
				System.out.println("Ejercicio #"+ejercicio);
				System.out.println("Escriba C/U/T,Valor");
				Scanner sn= new Scanner(System.in);
				String valor=sn.nextLine();
				char fig=valor.charAt(0);
				String dec=valor.substring(2,valor.length());
				Float v=Float.parseFloat(dec);
				if (fig=='C'){
					System.out.println("Circunferencia");
					System.out.println("Radio: "+v);
					System.out.println("Perimetro: "+(2*3.14*v));
					System.out.println("Area: "+(3.14*v*v));
				}	
				else if (fig=='U'){
					System.out.println("Cuadrado");
					System.out.println("Lado: "+v);
					System.out.println("Perimetro: "+(4*v));
					System.out.println("Area: "+(v*v));
					}
				else if (fig=='T'){
					Float alt=(float) (1.73*0.5*v);
					System.out.println("Triangulo");
					System.out.println("Lado: "+v);
					System.out.println("Altura: "+(alt));
					System.out.println("Perimetro: "+(3*v));
					System.out.println("Area: "+(0.5*alt*v));
				}
				sn.close();
			}
			else if (ejercicio==5){
				System.out.println("Ejercicio #"+ejercicio);
				Scanner sa=new Scanner(System.in);
				System.out.println("Ingrese dos Fechas(dd/mm/aaaa)o(dd-mm-aaa):");
				String funo=sa.nextLine();
				String fdos=sa.nextLine();
				int duno=Integer.parseInt(funo.substring(0,2));
				int muno=Integer.parseInt(funo.substring(3,5));
				int auno=Integer.parseInt(funo.substring(6,10));
				int ddos=Integer.parseInt(fdos.substring(0,2));
				int mdos=Integer.parseInt(fdos.substring(3,5));
				int ados=Integer.parseInt(fdos.substring(6,10));
				int fechauno=(duno)+(muno*30)+(auno*365);
				int fechados=(ddos)+(mdos*30)+(ados*365);
				if (fechados>fechauno){
					if (fechados-fechauno==1)
						System.out.println("Entre "+funo+" y "+fdos+" hay "+(fechados-fechauno)+" dia.");
					else
					System.out.println("Entre "+funo+" y "+fdos+" hay "+(fechados-fechauno)+" dias.");
				}
				else{
					if (fechauno-fechados==1)
						System.out.println("Entre "+funo+" y "+fdos+" hay "+(fechauno-fechados)+" dia.");
					else
					System.out.println("Entre "+funo+" y "+fdos+" hay "+(fechauno-fechados)+" dias.");
				}
				sa.close();
			}	
			else
				System.out.println("El Nivel 1 Solo Contiene los Ejercicios 1-5");
		}
		else if (nivel==2){
			System.out.println("Ingrese el numero de ejercicio:");
			int ejercicio=menu.nextInt();
			if (ejercicio==6){
				System.out.println("Ejercicio #"+ejercicio);
				Scanner ss=new Scanner(System.in);
				System.out.println("Ingrese dos numeros,Luego el caracter de la operacion.");
				int numuno=ss.nextInt();
				int numdos=ss.nextInt();
				char op=ss.next().charAt(0);
				switch (op){
				case 's':
					System.out.println(numuno+numdos);
					break;
				case 'r':
					System.out.println(numuno-numdos);
					break;
				case 'm':
					System.out.println(numuno*numdos);
					break;
				case 'd':
					System.out.println(numuno/numdos);
					break;
				default:
					System.out.println("letra incorrecta");
					break;
						
				}
				ss.close();
			}
			else if (ejercicio==7){
				System.out.println("Ejercicio #"+ejercicio);
				Scanner scan=new Scanner(System.in);
				System.out.println("Ingrese un numero entre 0 y 10:");
				int num=scan.nextInt();
				if (num>=0&&num<=10){
					System.out.println("Tabla del Numero "+num);
					for(int i=10;i>=0;i--)
						System.out.println(num+"x"+i+"="+(num*i));
				}
				else
					System.out.println("numero incorrecto");
				scan.close();
			}
			else if (ejercicio==8){
				System.out.println("Ejercicio #"+ejercicio);
				Scanner scan=new Scanner(System.in);
				System.out.println("Ingrese dos numeros entre 0 y 100");
				int inf=scan.nextInt();
				int sup=scan.nextInt();
				Random random = new Random(); 
				
				int num = random.nextInt(sup-inf+1) + inf;
				aLetra(num);
				scan.close(); 
			}
			else if (ejercicio==9){
				System.out.println("Ejercicio #"+ejercicio);
				Scanner scan=new Scanner(System.in);
				System.out.println("Ingrese un Numero:");
				int ar=scan.nextInt();
				int m=0,c=0,d=0,u=0;
				if (ar>3999)
					System.out.println("Solo Numeros hasta 3999");
				else{
					if (ar>=1000&&ar<=3999){
						m=ar/1000;
						ar%=1000;
					}
					if (ar>=100&&ar<=999){
						c=ar/100;
						ar%=100;
					}
					if (ar>=10&&ar<=99){
						d=ar/10;
						ar%=10;
					}	
					u=ar;
					switch (m){
					case 1:
						System.out.print("M");
						break;
					case 2:
						System.out.print("MM");
						break;
					case 3:
						System.out.print("MMM");
						break;
					}
					switch (c){
					case 1:
						System.out.print("C");
						break;
					case 2:
						System.out.print("CC");
						break;
					case 3:
						System.out.print("CCC");
						break;
					case 4:
						System.out.print("CD");
						break;
					case 5:
						System.out.print("D");
						break;
					case 6:
						System.out.print("DC");
						break;
					case 7:
						System.out.print("DCC");
						break;
					case 8:
						System.out.print("DCCC");
						break;
					case 9:
						System.out.print("CM");
						break;
					case 0:
						System.out.print("");
						break;
					}
					switch (d){
					case 1:
						System.out.print("X");
						break;
					case 2:
						System.out.print("XX");
						break;
					case 3:
						System.out.print("XXX");
						break;
					case 4:
						System.out.print("XL");
						break;
					case 5:
						System.out.print("L");
						break;
					case 6:
						System.out.print("LX");
						break;
					case 7:
						System.out.print("LXX");
						break;
					case 8:
						System.out.print("LXXX");
						break;
					case 9:
						System.out.print("XC");
						break;
					case 0:
						System.out.print("");
						break;
					}
					switch (u){
					case 1:
						System.out.print("I");
						break;
					case 2:
						System.out.print("II");
						break;
					case 3:
						System.out.print("III");
						break;
					case 4:
						System.out.print("IV");
						break;
					case 5:
						System.out.print("V");
						break;
					case 6:
						System.out.print("VI");
						break;
					case 7:
						System.out.print("VII");
						break;
					case 8:
						System.out.print("VIII");
						break;
					case 9:
						System.out.print("IX");
						break;
					case 0:
						System.out.print("");
						break;
					}
					System.out.println("");
					
				}
				
				scan.close(); 
			}
			else if (ejercicio==10){
				System.out.println("Ejercicio #"+ejercicio);
				Scanner scan=new Scanner(System.in);
				System.out.println("Ingrese un numero:");
				int num=scan.nextInt();
				if (num<10){
					for(int i=1;i<=num;i++){
						for(int j=1;j<i;j++)
							System.out.print(" ");
						for(int k=i;k<=num;k++)
							System.out.print(i+" ");
						System.out.println();
					}
				}
				else{
					for(int i=1;i<=9;i++){
						for(int j=1;j<i;j++)
							System.out.print("  ");
						for(int k=i;k<=num;k++)
							System.out.print(i+"   ");
						System.out.println();
					}
					for(int i=10;i<=num;i++){
						for(int j=1;j<i;j++)
							System.out.print("  ");
						for(int k=i;k<=num;k++)
							System.out.print(i+"  ");
						System.out.println();
					}
				}
				scan.close(); 
			}
			else if (ejercicio==11){
				System.out.println("Ejercicio #"+ejercicio);
				Scanner scan=new Scanner(System.in);
				System.out.println("Ingrese la cantidad de numeros que ingresara:");
				int total= scan.nextInt();
				String numero;
				int n;
				int mayor=Integer.MIN_VALUE;
				int menor=Integer.MAX_VALUE;
				System.out.println("Ingrese los Numeros Romanos:");
				for(int i=1;i<=total;i++){
					numero=scan.next();
					n=aDecimal(numero);
					if (n>mayor)
						mayor=n;
					if (n<menor)
						menor=n;
				}
				System.out.print("Menor: ");
				aLetra(menor);
				System.out.print("Mayor: ");
				aLetra(mayor);
				scan.close(); 
			}
			else if (ejercicio==12){
				System.out.println("Ejercicio #"+ejercicio);
				Scanner scan=new Scanner(System.in);
				String pal=scan.nextLine();
				for(int i=0;i<pal.length();i++){
					char con=pal.charAt(i);
					if (con!=' ')
						System.out.print("*");
					else
						System.out.print(" ");
				}
					
				System.out.println();
				scan.close(); 
				
			}
			else if (ejercicio==13){
				System.out.println("Ejercicio #"+ejercicio);
				Scanner scan=new Scanner(System.in);
				System.out.println("Ingrese Una Letra");
				char letra=scan.next().charAt(0);
				int x=Character.getNumericValue(letra);
				int m,r;
				char j;
				System.out.println("Adivine la letra!");
				do{
				j=scan.next().charAt(0);
				r=Character.getNumericValue(j);
				if (r<x)
					System.out.println("Antes");
				else if (r>x)
					System.out.println("Despues");
				else
					System.out.println("Correcto!");
				m=r;
				}
				while(m!=x);
				System.out.println("El Juego ha Terminado!");
				scan.close(); 
			}
			else if (ejercicio==14){
				System.out.println("Ejercicio #"+ejercicio);
				Scanner scan=new Scanner(System.in);
				System.out.println("Ingrese un numero:");
				int num=scan.nextInt();
				for (int i=1;i<=num;i++){
					if (i==1||i==num){
						for(int j=1;j<=num;j++)
							System.out.print("* ");
						System.out.println();
					}
					else{
						System.out.print("* ");
						for (int k=2;k<num;k++)
							System.out.print("  ");
						System.out.print("*");
						System.out.println();
					}
				}
				scan.close();
			}
			else if (ejercicio==15){
				System.out.println("Ejercicio #"+ejercicio);
				Scanner scan=new Scanner(System.in);
				System.out.println("Ingrese un numero:");
				int num=scan.nextInt();
				int cont=0;
				for(int i=2; i<=num;i++){
					for(int j=2; j<i;j++){
						if (i%j==0){
							cont++;
							break;
						}
					}
				}
				System.out.println("Entre 1 y "+num+" hay "+(num-cont)+" Numeros");
				scan.close();
			}
			else
				System.out.println("El Nivel 2 solo contiene los Ejercicios 6-15");
			
		}
		else 
			System.out.println("Solo Son nivel 1 y 2");
		
		
		menu.close();
	}

}
