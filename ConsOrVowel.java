import java.util.Scanner;
public class ConsOrVowel {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter character :");
        char input=in.nextLine().charAt(0);
            switch (input) {
                case 'A':
                case 'a':   
                case 'E':            
                case 'e':   
                case 'I': 
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u': System.out.println("Vowel"); 
                break; 
                default: 
                System.out.println("Consonant");
                    break;
            }






    }
}
