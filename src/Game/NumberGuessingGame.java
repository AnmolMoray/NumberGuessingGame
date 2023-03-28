package Game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGuessingGame {
    private JButton guessNumberButton;
    private JTextField Computernumber;
    private JTextField Message;
    private JTextField Mynumber;
    private JPanel Mypannel;
    private JLabel Enternumber;

    public NumberGuessingGame() {
        guessNumberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int myno=Integer.parseInt(Mynumber.getText());
                int compno=(int)(Math.random()*10);
                if(myno==compno){
                    Message.setText("Guess is correct");
                } else if (myno+1==compno || myno-1==compno) {
                    Message.setText("Too Close ! try again");

                }
                else{
                    Message.setText("Wrong answer");
                }
                Computernumber.setText(Integer.toString(compno));
            }
        });
    }

    public static void main(String[] args) {
JFrame jFrame=new JFrame("GuessingGame");
jFrame.setContentPane(new NumberGuessingGame().Mypannel);
jFrame.setSize(450,350);
jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jFrame.setVisible(true);

    }
}
