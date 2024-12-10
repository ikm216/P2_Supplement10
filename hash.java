import java.security.*;
import java.util.Base64;

enum HashAlgorithm{
    MD5, SHA1, SHA256
}

public class hash {
    public static String convertHashEnum(String string, HashAlgorithm algorithm) throws NoSuchAlgorithmException{
        MessageDigest messagedigest = MessageDigest.getInstance(algorithm.name().replace("SHA", "SHA-"));
        byte[] bytes = messagedigest.digest(string.getBytes());
        return Base64.getEncoder().encodeToString(bytes);
    }
}
