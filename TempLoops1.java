import java.util.*;
public class TempLoops1 {
	public static void main(String[] args) {
		double celsius = 0;
		
		System.out.println("Fahrenheit\tCelsius");
		System.out.println("======================");
		
		for (double fahrenheit=0; fahrenheit <= 300; fahrenheit+=20) {
			celsius = (fahrenheit-32.0) * (5.0/9.0);
			System.out.println(fahrenheit + "\t" + celsius);
		}
	}
}