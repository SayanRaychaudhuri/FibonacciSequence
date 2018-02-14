
public class FibonacciSequence {
	
	public static void main(String[] arg) {
		for (int i=0;i<100;i++)
		System.out.print(fibonacci(i)+" ");
	}

	public static int fibonacci(int n) {
		if (n==0) {
			return 0;
		} else if (n==1){
			return 1;
		} else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
}
