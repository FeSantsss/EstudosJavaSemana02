package Exercicios;
import entities.Calculator;
import java.util.Locale;
import java.util.Scanner;


public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Adicione o raio da esfera: ");
		double raio = sc.nextDouble();
		
		double c = Calculator.circuferencia(raio);
		double v = Calculator.volume(raio);
		
		System.out.println("CIRCUFERÊNCIA: " + c);
		System.out.println("VOLUME: " + v);
		System.out.println("PI: " + Calculator.PI);
		
		sc.close();
	}
}


/*Fazer um programa para ler um valor numérico qualquer, e daí mostrar
quanto seria o valor de uma circunferência e do volume de uma esfera
para um raio daquele valor. Informar também o valor de PI com duas
casas decimais. Estudos de Membros Estáticos.*/