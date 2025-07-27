package HomeWork13.Task1;

public class Validator {
    public static void validate(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        validateLogin(login);
        validatePassword(password, confirmPassword);
    }

    private static void validateLogin(String login) throws WrongLoginException {
        if (login == null || login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Login is invalid");
        }
    }

    private static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password == null || password.length() >= 20 || password.contains(" ") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password is invalid");
        }

        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }

        if (!hasDigit) {
            throw new WrongPasswordException("Password must contain at least one digit");
        }
    }
}