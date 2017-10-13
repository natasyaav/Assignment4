import org.junit.Assert;

public class processStringTest {
    processString test = new processString();
    String word = "Indonesia";
    int answer = 9;
    char result = 'I';
    @org.junit.Test
    public void stringLength() throws Exception {
        Assert.assertEquals("ERROR: it should be 9", answer, test.stringLength(word));
    }

    @org.junit.Test
    public void firstChar() throws Exception {
        Assert.assertEquals("ERROR: it should be I", result, test.firstChar(word));
    }

}