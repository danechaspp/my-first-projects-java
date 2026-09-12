import javax.swing.JOptionPane;
import java.time.LocalTime;

public class pass {
    public static void main(String[] args) {

        String userName1 = "User";
        String password1 = "123456";

        while (true) {

            String login = JOptionPane.showInputDialog("Введите логин:");

            if (login.equals(userName1)) {

                String password = JOptionPane.showInputDialog(null, "Введите пароль:"
                );

                if (password.equals(password1)) {

                    LocalTime now = LocalTime.now();

                    JOptionPane.showMessageDialog(null, "Успешный вход! Вы вошли под логином: " + login + "\nВремя: " + now);

                    break;

                } else {
                    JOptionPane.showMessageDialog(null, "Неверный пароль"
                    );
                }

            } else {
                JOptionPane.showMessageDialog(null, "Неверный логин"
                );
            }
        }
    }
}