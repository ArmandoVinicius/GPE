package utils;

public class LoginInvalidoException extends Exception {
    String message;
    
    public LoginInvalidoException(String message) {
        this.message = message;
    }
    
    @Override
    public String getMessage() {
        return message;
    }
}
