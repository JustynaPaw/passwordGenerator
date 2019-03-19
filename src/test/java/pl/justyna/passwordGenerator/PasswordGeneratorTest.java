package pl.justyna.passwordGenerator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.justyna.passwordGeneratorApiJ.PasswordGeneratorParameters;

public class PasswordGeneratorTest {
    PasswordGenerator passwordGenerator = new PasswordGenerator();

    @Test
    void shouldGeneratePasswordOffProperLength(){
        PasswordGeneratorParameters passwordGeneratorParameters = new PasswordGeneratorParameters();
        passwordGeneratorParameters.setPasswordLength(10);
        String password = passwordGenerator.generate(passwordGeneratorParameters);
        Assertions.assertEquals(10, password.length());
    }
}
