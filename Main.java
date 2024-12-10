import java.security.*;


enum HashAlgorithm {
    MD5, SHA1, SHA256
}

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        try {
            String string = "Chicken On Me";
            String hash_string1 = hash.convertHashEnum(string, HashAlgorithm.SHA256);
            System.out.println("Hashed String (SHA-256): " + hash_string1);
            String hash_string2 = hash.convertHashEnum(string, HashAlgorithm.SHA1);
            System.out.println("Hashed String (SHA-1): " + hash_string2);
            String hash_string3 = hash.convertHashEnum(string, HashAlgorithm.MD5);
            System.out.println("Hashed String (MD5): " + hash_string3);

            String string2 = "Chicken In The Coop";

            String hashedString = hash.convertHashEnum(string2, HashAlgorithm.SHA256);
            System.out.println("Hashed String (SHA-256): " + hashedString);

            boolean isMatch = hash.matchHashString(string2, hashedString, HashAlgorithm.SHA256);
            System.out.println("Hash Match: " + isMatch);
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
