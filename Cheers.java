
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0].toUpperCase();
            int rep = Integer.parseInt(args[1]);


            for(int i= 0; i<word.length(); i++){

                char check = word.charAt(i);
                String article;

            String Letters ="AEFHILMNORSX";
                
                if(Letters.indexOf(check) >=0){
                        article = "an";
                        System.out.println("Give me " + article + " " + check + ": " + check + "!");
                } else {
                        article = "a";
                        System.out.println("Give me " + article + "  " + check + ": " + check + "!");
                }
                        
                }
                

                System.out.println("What does that spell?");
                for (int i = 0; i < rep; i++) {
                 System.out.println(word + "!!!");

                }

            }
        }

