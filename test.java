import org.junit.*;

public class test{
    @Test
    public void test_should_return_hash_string_enum() throws Exception{
        String string = "Chicken on Me";
        String hash_string = hash.convertHashEnum(string, HashAlgorithm.SHA256);
        Assert.assertNotNull(hash_string);
    }
}