package HomeWork13.Task1;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Validator.validate("user", "pass123", "pass123");
        //Validator.validate("user with space", "pass123", "pass123"); // WrongLoginException
        //Validator.validate("user", "password", "password"); // нет цифры
        Validator.validate("user", "pass123", "pass124"); // пароли не совпадают
    }
}