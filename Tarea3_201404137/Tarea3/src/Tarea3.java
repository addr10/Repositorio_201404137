import java.util.Scanner;


public class Tarea3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un Número: ");
		int a=sc.nextInt();
		if (a%2==0) System.out.println(a + " es par");
		else System.out.println(a + " es impar");

	}

}
