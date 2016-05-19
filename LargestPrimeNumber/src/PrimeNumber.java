import java.util.ArrayList;
import java.util.Scanner;
public class PrimeNumber {
	public static double number;
	public static ArrayList<Double> primeFactorsList = new ArrayList<Double>();
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("whats the upper limit?");
		int upperLimit = input.nextInt();
		primeFinder(upperLimit);
		System.out.println(primeFactorsList);

	}

	private static void primeFinder(int limit){
		ArrayList<Double> factorsList = new ArrayList<Double>();
		for(int i = 3; i < limit; i+=2){
			for(int x= 1; x < i; x++ ){
				if(i%x == 0){
					factorsList.add((double)x);
				}
			do{
				if(factorsList.get(0) == 1 && factorsList.get(1)==i){
					primeFactorsList.add((double)i);
				}
			}while(i == x);
			}
		}
		
	}
}
