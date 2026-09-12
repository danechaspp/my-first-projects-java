import javax.swing.JOptionPane;

public class calculate {

    public static void main(String[] args) {


        String lang = JOptionPane.showInputDialog(null, "Select to language: \n 1) English \n 2) Русский");
        if (lang.equals("1")) {
            JOptionPane.showMessageDialog(null, "Hi, its my first java calculator");
        } else if (lang.equals("2")) {
            JOptionPane.showMessageDialog(null, "Привет, это мой первый java калькулятор");

        }

        while (true) {
            if (lang.equals("1")) {
                String calculEng = JOptionPane.showInputDialog(null, " Select to sign \n 1) + \n 2) - \n 3) : \n 4) x : \n 5) Exit");
                if (calculEng.equals("1")) {
                    String firstText = JOptionPane.showInputDialog(null, "first number: ");
                    double first = Double.parseDouble(firstText);
                    String secondText = JOptionPane.showInputDialog(null, "second number: ");
                    double second = Double.parseDouble(secondText);
                    double otvet = first + second;
                    JOptionPane.showMessageDialog(null, "Your number = " + otvet);

                }
                if (calculEng.equals("2")) {
                    String firstText = JOptionPane.showInputDialog(null, "first number: ");
                    double first = Double.parseDouble(firstText);
                    String secondText = JOptionPane.showInputDialog(null, "second number: ");
                    double second = Double.parseDouble(secondText);
                    double otvet = first - second;
                    JOptionPane.showMessageDialog(null, "Your number = " + otvet);

                }
                if (calculEng.equals("3")) {
                    String firstText = JOptionPane.showInputDialog(null, "first number: ");
                    double first = Double.parseDouble(firstText);
                    String secondText = JOptionPane.showInputDialog(null, "second number: ");
                    double second = Double.parseDouble(secondText);
                    double otvet = first / second;
                    if (second == 0){
                        JOptionPane.showMessageDialog(null,"Error: division by zero is not allowed");
                    }else {

                        JOptionPane.showMessageDialog(null, "Your number = " + otvet);
                    }


                }
                if (calculEng.equals("4")) {
                    String firstText = JOptionPane.showInputDialog(null, "first number: ");
                    double first = Double.parseDouble(firstText);
                    String secondText = JOptionPane.showInputDialog(null, "second number: ");
                    double second = Double.parseDouble(secondText);
                    double otvet = first * second;
                    JOptionPane.showMessageDialog(null, "Your number = " + otvet);
                }
                if (calculEng.equals("5")) {
                    String exit = JOptionPane.showInputDialog(null, "Are you sure? \n 1) Yes \n 2) No");
                    if (exit.equals("1")) {
                        break;
                    } else {
                        continue;
                    }

                }
            }

            if (lang.equals("2")){
            String calculRuss = JOptionPane.showInputDialog(null, " Выберите знак \n 1) + \n 2) - \n 3) : \n 4) x \n 5) Выход ");
            if (calculRuss.equals("1")) {
                String firstText = JOptionPane.showInputDialog(null, "Первое число: ");
                double first = Double.parseDouble(firstText);
                String secondText = JOptionPane.showInputDialog(null, "Второе число: ");
                double second = Double.parseDouble(secondText);
                double otvet = first + second;
                JOptionPane.showMessageDialog(null, "Твое число = " + otvet);

            }
            if (calculRuss.equals("2")) {
                String firstText = JOptionPane.showInputDialog(null, "Первое число: ");
                double first = Double.parseDouble(firstText);
                String secondText = JOptionPane.showInputDialog(null, "Второе число: ");
                double second = Double.parseDouble(secondText);
                double otvet = first - second;
                JOptionPane.showMessageDialog(null, "Твое число = " + otvet);

            }
            if (calculRuss.equals("3")) {
                String firstText = JOptionPane.showInputDialog(null, "Первое число: ");
                double first = Double.parseDouble(firstText);
                String secondText = JOptionPane.showInputDialog(null, "Второе число: ");
                double second = Double.parseDouble(secondText);
                double otvet = first / second;
                if (second == 0){
                    JOptionPane.showMessageDialog(null,"Ошибка: на 0 делить нельзя");
                }else {

                    JOptionPane.showMessageDialog(null, "Твое число = " + otvet);
                }

            }
            if (calculRuss.equals("4")) {
                String firstText = JOptionPane.showInputDialog(null, "Первое число: ");
                double first = Double.parseDouble(firstText);
                String secondText = JOptionPane.showInputDialog(null, "Второе число: ");
                double second = Double.parseDouble(secondText);
                double otvet = first * second;
                JOptionPane.showMessageDialog(null, "Твое число = " + otvet);
            }
            if (calculRuss.equals("5")) {
                String exit = JOptionPane.showInputDialog(null, "Вы уверены? \n 1) Да \n 2) Нет");
                if (exit.equals("1")) {
                    break;
                } else {
                    continue;
                }
            }
            }


        }

    }
}

