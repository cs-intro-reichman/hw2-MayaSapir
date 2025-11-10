public class TimeCalc {
    public static void main(String[] args) {


        String S = args[0];
		int colon = S.indexOf(':');

		int hh = Integer.parseInt(S.substring(0, colon));
		int mm = Integer.parseInt(S.substring(colon + 1));

		int add = Integer.parseInt(args[1]);


		int totalMin = hh*60 + mm+add;
		totalMin = ((totalMin%(24*60)) + (24*60))% (24*60);

		int newHour = totalMin/60;
		int newMin = totalMin%60;
		
		if (newHour < 10) {
		 System.out.print("0");
	}
			System.out.print(newHour);
			System.out.print(":");
		if (newMin < 10) { 
			System.out.print("0");}
		
			System.out.println(newMin);
        

    }
}
