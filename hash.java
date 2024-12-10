import java.security.*;
import java.util.Base64;

enum HashAlgorithm{
    MD5, SHA1, SHA256
}

public class hash {
    /**
     * Hashes a given string using the specified hashing algorithm.
     *
     * @param string    The string to be hashed.
     * @param algorithm The hashing algorithm to use (MD5, SHA-1, SHA-256).
     * @return The hashed string in Base64 format.
     * @throws NoSuchAlgorithmException If the provided algorithm is invalid.
     */
    public static String convertHashEnum(String string, HashAlgorithm algorithm) throws NoSuchAlgorithmException{
        MessageDigest messagedigest = MessageDigest.getInstance(algorithm.name().replace("SHA", "SHA-"));
        byte[] bytes = messagedigest.digest(string.getBytes());
        return Base64.getEncoder().encodeToString(bytes);
    }

    public static boolean matchHashString(String string, String hash_string, HashAlgorithm algorithm) throws NoSuchAlgorithmException {
        String match_hash = convertHashEnum(string, algorithm);
        return match_hash.equals(hash_string);
    }
}
