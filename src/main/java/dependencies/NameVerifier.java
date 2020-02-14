package dependencies;

import org.apache.commons.lang3.StringUtils;

public class NameVerifier {
    public static void main(String[] args) {
        String name = "Arkadiusz";
        System.out.println(StringUtils.isAlpha(name));
    }
}
