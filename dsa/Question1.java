package test;
import java.util.*;
public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // total monkeys
	    int k = sc.nextInt(); // bananas per monkey
	    int j = sc.nextInt(); // peanuts per monkey
	    int m = sc.nextInt(); // total bananas
	    int p = sc.nextInt(); // total peanuts
	    if (n <= 0 || k <= 0 || j <= 0 || m < 0 || p < 0) {
	        System.out.println("INVALID INPUT");
	    }
	    else {
		    int bananasMonkeys = m / k;
	        if (m % k != 0) {
	            bananasMonkeys += 1;
	        }
	        int peanutsMonkeys = p / j;
	        if (p % j != 0) {
	            peanutsMonkeys += 1;
	        }
	        int totalCameDown = bananasMonkeys + peanutsMonkeys;
	        if (totalCameDown > n) {
	            totalCameDown = n; 
	        }
	        int remaining = n - totalCameDown;
	        System.out.print(remaining);
	    }
        sc.close();
	} 
}
