package homework.day.eight;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Şifrəni daxil edin: ");
        String password = in.nextLine();

        System.out.println(checkPassword(password));

    }
    public static boolean checkPassword(String psw) {
        if (psw.length() >= 10 &&
            psw.matches("[a-zA-Z0-9]*") &&
            psw.matches("^(?=.*?\\d.*\\d)[a-zA-Z0-9]{8,}$"))
            return true;
        else return false;
    }

}
