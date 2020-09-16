import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

public class EmailValidatorTest {

    private final EmailUtils emailUtils = new EmailUtils();

    @Test
    void test_nameWithDotAndPlus_shouldPass() {
        String localName = emailUtils.getLocalName("test.email+john");
        Assert.assertEquals("testemail", localName);
    }

    @Test
    void test_nameWithDot_shouldPass() {
        String localName = emailUtils.getLocalName("john.lenon");
        Assert.assertEquals("johnlenon", localName);
    }

    @Test
    void test_nameWithPlus_shouldPass() {
        String localName = emailUtils.getLocalName("kristi+yolo");
        Assert.assertEquals("kristi", localName);
    }

    @Test
    void test_domainNameEvenLength_shouldPass() {
        Assert.assertEquals(true, emailUtils.isDomainNameValid("xyABCxyz"));
    }

    @Test
    void test_domainNameOddLength_shouldPass() {
        Assert.assertEquals(true, emailUtils.isDomainNameValid("xyABCxy"));
    }

    @Test
    void test_domainName_shouldFail() {
        Assert.assertEquals(true, emailUtils.isDomainNameValid("xyinaABCta.com"));
    }

    @Test
    void test_domainNameStartWith_shouldFail() {
        Assert.assertEquals(true, emailUtils.isDomainNameValid("ABCta.com"));
    }

    @Test
    void test_uniqueEmail_shouldPass() {
        ArrayList<String> testEmails = new ArrayList<String>();
        testEmails.add("test.email+john@inavitas.com");
        testEmails.add("test.e.mail+jane.doe@inavitas.com");
        testEmails.add("testemail+michael@ina.vitas.com");
        testEmails.add("testemail+michael@inaABC.com");
        testEmails.add("testemail+michael@inavABCitas.com");

        HashSet<String> validEmailList = new HashSet<String>();
        validEmailList.add("testemail@inavitas.com");
        validEmailList.add("testemail@ina.vitas.com");
        validEmailList.add("testemail@inavABCitas.com");

        Assert.assertEquals(validEmailList, emailUtils.getValidEmail(testEmails));
    }

}
