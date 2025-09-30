package fibbo;

public class Fibonacci {

	public static void main(String[] args) {
		int[] fibonacci = new int[15];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		pinakas(fibonacci);	
		}
	
		static void pinakas(int[] fibonacci) {
			for(int i = 2; i < fibonacci.length; i++) {
				fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
				}
					for(int elem : fibonacci)
						System.out.print(elem + " ");
			}
		}
