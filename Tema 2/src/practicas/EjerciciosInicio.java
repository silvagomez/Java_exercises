package practicas;
import java.util.Scanner;

public class EjerciciosInicio{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("/---------------------------------------------/");
		
		int N = 5;
		double A = 4.56;
		char C = 'a';
		System.out.println("Variable N =" + N);
		System.out.println("Variable A =" + A);
		System.out.println("Variable C =" + C);
		// En consola el mensaje a ver es: 19.119999999999997
		System.out.println(N+A); 
		System.out.println(N+"+"+A+"="+(N+A));
		System.out.println(A + "-" +N+ "=" + (A-N));
		System.out.println("Valor num�rico del caracter" +C+ "=" + (int)C);
		//En consola el mensaje a ver es: 97
		System.out.println((int)C); 
		
		System.out.println();
		System.out.println("/---------------------------------------------/");
		int x=1;
		System.out.println("Variable x = " +x);
		//En consola el mensaje a ver es: 1
		System.out.println(+x); 
		//En consola el mensaje a ver es:1
		System.out.println(x++); 
		/* En consola el mensaje a ver es: 2, pero si antes hay (x++)
		se realizar� una operaci�n de suma +1 adem�s de ++x, es decir vemos 3*/
		System.out.println(++x); 
		//En consola el mensaje a ver si va despu�s de (++x) es el mismo valor de +xx
		System.out.println(x++); 

		System.out.println();
		System.out.println("/---------------------------------------------/");
		x=1;
		int y=2;
		System.out.println("Variable x =" +x);
		System.out.println("Variable y =" +y);
		System.out.println(x+"+"+y+"="+(x+y));
		System.out.println(x+"-"+y+"="+(x-y));
		System.out.println(x+"*"+y+"="+(x*y));
		System.out.println(x+"/"+y+"="+(x/y));
		System.out.println(x+"%"+y+"="+(x%y));
		
		System.out.println("/---------------------------------------------/");
		int n1, n2;		
		System.out.println("Ingrese un n�mero");
		n1=teclado.nextInt();
		System.out.println("Ingrese otro n�mero");
		n2=teclado.nextInt();
		System.out.println("Los numero ingresado al sistema son " +n1+ " y " +n2);
		
		System.out.println("/---------------------------------------------/");
		String nombre1;
		System.out.println("Ingrese el nombre de su pareja");
		nombre1=teclado.nextLine();
		System.out.println("El nombre de su pareja es " +nombre1);
		
		System.out.println("/---------------------------------------------/");
		int number;
		System.out.println("Ingrese un n�mero");
		number=teclado.nextInt();
		System.out.println("El doble de " +number+ " es " +(number*2));
		System.out.println("El triple de " +number+ " es " +3*number );
		
		 
		
		
	}

}
