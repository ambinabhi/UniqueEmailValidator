import java.util.ArrayList;
import java.util.HashSet;

public class EmailUtils {

    public HashSet<String> getValidEmail(ArrayList<String> emails) {
        HashSet<String> validEmailList = new HashSet<String>();

        for (String email : emails) {
            String localName = email.substring(0, email.indexOf("@"));
            String domainName = email.substring(email.indexOf("@") + 1);

            String validLocalName = getLocalName(localName);

            if (isDomainNameValid(domainName)) {
                String validLocalName1 = email.substring(0, email.indexOf("@"));
                String validEmailName = email.replace(validLocalName1, validLocalName);
                validEmailList.add(validEmailName);
            }
        }
        return validEmailList;
    }

    public String getLocalName(String localName) {
        String validLocalName;

        if (localName.contains("+")) {
            validLocalName = localName.substring(0, localName.indexOf("+"));
            return validLocalName.replace(".", "");
        } else if (localName.contains(".")) {
            return localName.replace(".", "");
        } else {
            return localName;
        }
    }

    public Boolean isDomainNameValid(String name) {

        if (name.contains("ABC") && name.contains(".com")) {
            String domainName = name.substring(0, name.indexOf(".com"));
            int length = domainName.length();
            int middle = (length / 2) - 1;

            if ((length % 2) == 0) {
                return (domainName.charAt(middle + 1) == 'B' || domainName.charAt(middle) == 'B');
            } else {
                return domainName.charAt(middle + 1) == 'B';
            }
        }
        return true;
    }
}
