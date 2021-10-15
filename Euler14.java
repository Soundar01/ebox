package hcl.com.ebox;

public class Euler14 {

	public static void main(String[] args) {
		 int max = 1;
		    int ans = 1;
		    // Map<Integer, Integer> t_cache = new HashMap<Integer, Integer>();
		    for (int i = 2; i < 1000000; i++) {
		        long n = i;
		        int t = 0;
		        do {
		            // if (t_cache.containsKey(n)) {
		            // t += t_cache.get(n);
		            // break;
		            // }
		            ++t;
		            if (n % 2 == 0) {
		                n /= 2;
		            } else {
		                n = 3 * n + 1;
		            }
		            // t_cache.put(i, t);
		        } while (n != 1);
		        // System.out.println(i + "->" + t);
		        if (t > max) {
		            max = t;
		            ans = i;
		        }
		    }
		    System.out.println("Longest chain: "+ans);
		}

	

}
