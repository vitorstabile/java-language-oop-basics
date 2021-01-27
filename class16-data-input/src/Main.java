import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String x;
		x = sc.next();
		
		System.out.println("Você digitou: "+ x);
		
		int y;
		y = sc.nextInt();
		
		System.out.println("Você digitou: "+ y);
		
		double z;
		
		z = sc.nextDouble();
		
		System.out.printf("Você digitou: %.2f%n", z);
		
		char a;
		
		a = sc.next().charAt(0);
		
		System.out.println("Você digitou: " + a);
		
		String x2;
		int y2;
		double z2;

		x2 = sc.next(); // Separador de espaço padrão
		y2 = sc.nextInt();
		z2 = sc.nextDouble();

		System.out.println("Dados Digitados");
		System.out.println(x2);
		System.out.println(y2);
		System.out.println(z2);
		
		String s1, s2, s3;

		s1 = sc.nextLine(); 
		s2 = sc.nextLine(); 
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		int x3;
		String s4, s5, s6;

		x3 = sc.nextInt();
		sc.nextLine();
		s4 = sc.nextLine(); 
		s5 = sc.nextLine(); 
		s6 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:"); 
		System.out.println(x3); 
		System.out.println(s4); 
		System.out.println(s5);
		System.out.println(s6);


		
		sc.close();
		
		
	}

}
