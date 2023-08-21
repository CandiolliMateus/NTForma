package src.Exceptions.customexceptions;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {

        super("Usuário ou senha inválidos.");
    }
}
