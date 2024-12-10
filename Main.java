import java.security.*;


enum HashAlgorithm {
    MD5, SHA1, SHA256
}

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        try {
            String string = "Chicken On Me";
            String hash_string = hash.convertHashEnum(string, HashAlgorithm.SHA256);
            System.out.println("Hashed String (SHA-256): " + hash_string);
            String hash_string2 = hash.convertHashEnum(string, HashAlgorithm.SHA1);
            System.out.println("Hashed String (SHA-1): " + hash_string2);
            String hash_string3 = hash.convertHashEnum(string, HashAlgorithm.MD5);
            System.out.println("Hashed String (MD5): " + hash_string3);
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
