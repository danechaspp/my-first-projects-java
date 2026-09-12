import java.util.Scanner;
import javax.swing.JOptionPane;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secretNumber = (int) (Math.random() * 100);


        JOptionPane.showMessageDialog(null,"Я загадал рандомное число, попробуй отгадать! ");
        int attempts = 0;
        while(true){

            attempts++;

            int number = Integer.parseInt(JOptionPane.showInputDialog("Введи число: "));



            if ( number  == secretNumber){
                JOptionPane.showMessageDialog(null,"Вы угадали число! Вот оно: " + secretNumber + " Попыток: " + attempts);
                break;

            }if ( number > secretNumber){
                JOptionPane.showMessageDialog(null,"Ваше число больше, попробуй ещё");

            }else{
                JOptionPane.showMessageDialog(null,"Ваше число меньше, попробуй ещё");
            }

        }

    }
}