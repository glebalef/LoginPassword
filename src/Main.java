import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        System.out.println(isNewUserDataOk("Gleb91", "Qwerty_123", "Qwerty_123"));
    }

    public static boolean checkLogin(String loginForCheck) throws WrongLoginException {
        if (loginForCheck.matches("\\w+") && loginForCheck.length() <= 20) {
            return true;
        } else {
            throw new WrongLoginException();
        }
    }
    public static boolean checkPassword(String passForCheck, String confirmPassForCheck) throws WrongPasswordException {
        if (passForCheck.matches("\\w+") && passForCheck.length() < 20 && passForCheck == confirmPassForCheck) {
            return true;
        } else {
            throw new WrongPasswordException();
        }
    }

    public static boolean isNewUserDataOk(String login, String password, String confirmPassword) {
        try {
            checkLogin(login);
        } catch (WrongLoginException e) {
            e.printStackTrace();
        return false;}
        try {
            checkPassword(password, confirmPassword);
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        return false;}

        return true;
    }
}










        