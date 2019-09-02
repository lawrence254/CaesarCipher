import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaesarApp {
    public static void main(String[] args) {
        boolean runApp = true;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Try this caesar cipher done by robert");
        try {
            while(runApp){
                System.out.println("What would you like to do: 1. Encode 2. Decode 3. Exit (Enter 1, 2 or 3)");
                String userChoice = bufferedReader.readLine();
                Integer intUserChoice = Integer.parseInt(userChoice);
                if(intUserChoice == 1){
                    System.out.println("Enter text to be encoded");
                    String cipherText = bufferedReader.readLine();
                    System.out.println("Enter key (Should be a number)");
                    String userKey = bufferedReader.readLine();
                    Integer intKey = Integer.parseInt(userKey);
                    CaesarCipher userCipher = new CaesarCipher(cipherText,intKey);
                    String resultText = userCipher.encode();
                    System.out.println("The cipher text for "+ cipherText + " using " + userKey + " as the key is => " + resultText );
                    System.out.println("Try more codes with caesar cipher");

                }
                else if(intUserChoice == 2){
                    System.out.println("Enter text to be decoded");
                    String userText = bufferedReader.readLine();
                    System.out.println("Enter key (Should be a number)");
                    String userKey = bufferedReader.readLine();
                    Integer intKey = Integer.parseInt(userKey);
                    CaesarCipher userCipher = new CaesarCipher(userText,intKey);
                    String plainText = userCipher.decode();
                    System.out.println("The result of "+ userText  + "  is : " + plainText );
                    System.out.println("Try  encoding too with thw caesar cipher  ");


                }
                else if(intUserChoice == 3){
                    runApp = false;
                }
                else{
                    System.out.println("Sorry, the option you have selected is invalid");

                    System.out.println("Thank you for using caesar cipher");
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}