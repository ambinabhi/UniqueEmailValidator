import java.util.ArrayList;
import java.util.HashSet;

public class EmailValidator {

    public static void main(String[] args) {

        ArrayList<String> emailList = new ArrayList<String>();
        emailList.add("test.email+john@inavitas.com");
        emailList.add("test.e.mail+jane.doe@inavitas.com");
        emailList.add("testemail+michael@ina.vitas.com");
        emailList.add("testemail+michael@inaABC.com");
        emailList.add("testemail+michael@inavABCitas.com");
        
        EmailUtils emailUtils = new EmailUtils();
        HashSet<String> validEmails = emailUtils.getValidEmail(emailList);
        for (String email: validEmails) {
            System.out.println(email);
        }
    }
}
