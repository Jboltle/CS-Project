package Activity241;
import java.util.Scanner;
public class Activity244
{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        System.out.println("Please enter a phrase:");
        String phrase = sc.nextLine();

        System.out.println("The following shows the letter frequencies for the phrase: \"" + phrase + "\"");

        for (int i = 0; i < alphabet.length(); i++) {
            char alphabetChar = alphabet.charAt(i);
            int count = 0;

            for (int j = 0; j < phrase.length(); j++) {
                char phraseChar = phrase.charAt(j);

                if (phraseChar == alphabetChar) {
                    count++;
                }
            }

            System.out.println(alphabetChar + ": " + count);
        }

    

    /* your code here */
    
    }}
