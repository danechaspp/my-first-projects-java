import javax.swing.JOptionPane;
import java.time.LocalTime;

public class Game {
    public static void main(String[] args) {

        String userName = "User";
        String password = "123456";
        double balance = 15500;
        LocalTime now = LocalTime.now();

        while (true) {
            String login = JOptionPane.showInputDialog(null, "Введите логин: ");
            if (login.equals(userName)) {
                String checkPassword = JOptionPane.showInputDialog("Введите пароль: ");


                if (checkPassword.equals(password)) {

                    JOptionPane.showMessageDialog(null, "Успешный вход! Вы вошли под логином: " + login + "\nВремя: " + now);
                    int action = Integer.parseInt(JOptionPane.showInputDialog(null, "Выберите действие \n 1) Посмотреть баланс \n 2) Пополнить баланс \n 3) Снять деньги с баланса \n 4) Выход \n"));
                    if (action == 1) {
                        JOptionPane.showMessageDialog(null, "Ваш баланс: " + balance);
                    }
                    if (action == 2) {
                        String plus = JOptionPane.showInputDialog("Введите сумму пополнения: ");
                        balance = Integer.parseInt(plus) + balance;

                        JOptionPane.showMessageDialog(null, "Ваш баланс успешно пополнен на сумму: " + plus);

                    }
                    if (action == 3) {
                        String minus = JOptionPane.showInputDialog(null, "Введите сумму снятия с баланса: ");
                        balance = balance - Integer.parseInt(minus);
                        if (minus.equals(balance)){
                            JOptionPane.showMessageDialog(null,"Недостаточно средств на балансе!");
                        }else{
                            JOptionPane.showMessageDialog(null, "Вы успешно сняли с баланса сумму: " + minus);
                        }
                    }
                    if (action == 4) {
                        break;
                    }
                }

                }
            }

        }
    }


