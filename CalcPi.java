// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	   
	int n = Integer.parseInt(args[0]);
	double sum = 0.0;

	for (int k = 0; k < n; k++) {
	double term = 1.0 / (2 * k + 1);
	if (k % 2 == 1) { 
		term = -term;
            }
            sum += term;
        }
		double approxPi = 4 * sum;

		System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + approxPi);
	}
}
