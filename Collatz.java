// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

 	int N = Integer.parseInt(args[0]);
	String mode = args[1];	
	boolean verbose = mode.equals("v");

	for (int seed = 1; seed <= N; seed++) {
            int current = seed;
            int steps = 0;

		while (true) {
             if (verbose) {
                System.out.print(current + " ");
                }
			 steps++;

			 if (current == 1 && steps >1) {  
                    break;                    // reach 1 and stops, if already taken one step
                }

                if (current % 2 == 0) {
                    current = current / 2;
                } else {
                    current = 3 * current + 1;
                }
            }
			if (verbose) {
                System.out.println("(" + steps + ")");
            }
        }
	System.out.println(
            "Every one of the first " + N +
            " hailstone sequences reached 1."
        );
    }
}





	
