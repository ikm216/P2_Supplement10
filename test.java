import org.junit.*;

public class test{
    @Test
    public void test_should_return_hash_string_enum() throws Exception{
        String string = "Chicken on Me";
        String hash_string = hash.convertHashEnum(string, HashAlgorithm.SHA256);
        Assert.assertNotNull(hash_string);
    }
    @Test
    public void  test_should_return_boolean_of_mathch() throws Exception{
        String string = "Chicken on Me";
        String hash_string = hash.convertHashEnum(string, HashAlgorithm.SHA256);
        Assert.assertTrue(hash.matchHashString(string, hash_string, HashAlgorithm.SHA256));
    }
    @Test
    public void test_should_return_salted_hash() throws Exception{
        String input = "Chicken on Me";
        String salt = "Lemon Pepper";
        String salt_hash = hash.saltHash(input, salt, HashAlgorithm.SHA256);
        Assert.assertNotNull(salt_hash);
    }
}