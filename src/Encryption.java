import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //implementing Scanner method

        System.out.println("Enter the text to be encrypted: "); //User enter the text to encryption
        String text = scanner.nextLine();

        System.out.println("Enter key: "); //User enter the key that will be used for encryption
        int key = scanner.nextInt();

        String  encryptedText = encrypt(text, key);
        System.out.println("Encrypted text: ");
        System.out.println(encryptedText);

    }
    public static String encrypt(String text, int key){
        StringBuilder encryptedText = new StringBuilder(); //Created String that will be encrypted text
        for (int i=0; i < text.length(); i++){
            char sign = text.charAt(i);
            if (Character.isLetter(sign)){
                int keySign = (int)sign;
                if (Character.isUpperCase(sign)){
                    keySign = (keySign + key - 65) % 26 + 65;
                }else {
                    keySign = (keySign + key - 97) % 26 + 97;
                }
                sign = (char) keySign;
            }
            encryptedText.append(sign);
        }
        return encryptedText.toString();
    }
}
