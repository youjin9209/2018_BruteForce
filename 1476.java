package algorithm_main;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();
        int e = 1, s = 1, m = 1;
        for (int i = 1; ;i++) {
        	if (e == E && s == S && m == M) {
        		System.out.println(i);
        		break;
        	}
        	e += 1;
        	s += 1; 
        	m += 1;
        	if (e > 15)
        		e = 1;
        	if (m > 19)
        		m = 1;
        	if (s > 28)
        		s = 1;
        }
    }
}