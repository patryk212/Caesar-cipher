import java.util.Scanner;

public class Decryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter encrypted text: ");
        String encryptedText = scanner.nextLine();

        System.out.println("Enter key: ");
        int key = scanner.nextInt();

        String decryptedText = "";

        for (int i=0; i < encryptedText.length(); i++){
            char sign = encryptedText.charAt(i);
            if (Character.isUpperCase(sign)){
                int signKey = (int) sign - key % 26;
                if(signKey < 65 ){
                    signKey += 26;
                }
                decryptedText += (char) signKey;
            }else if (Character.isLowerCase(sign)){
                int signKey = (int) sign - key % 26;
                if (signKey < 97){
                    signKey += 26;
                }
                decryptedText += (char) signKey;
            }else {
                decryptedText += sign;
            }
        }
        System.out.println("Decrypted text: " + decryptedText);
    }
}
