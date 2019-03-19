package pl.justyna.passwordGenerator;


import pl.justyna.passwordGeneratorApiJ.PasswordGeneratorParameters;
import pl.justyna.passwordGeneratorApiJ.PasswordGeneratorService;

import java.util.List;
import java.util.Random;

public class PasswordGenerator implements PasswordGeneratorService {
    private static final Random RANDOM = new Random();
    private static final String LOWERCASE_CHARACTERS = "qwertyuiopasdfghjklzxcvbnm";

    public String generate(PasswordGeneratorParameters passwordGeneratorParameters) {
        String password = "";
        for (int i = 0; i < passwordGeneratorParameters.getPasswordLength(); i++) {
            password += LOWERCASE_CHARACTERS.charAt(RANDOM.nextInt(LOWERCASE_CHARACTERS.length()));
        }
        return password;
    }

    public List<String> generate(PasswordGeneratorParameters passwordGeneratorParameters, int count) {
        return null;
    }
}
