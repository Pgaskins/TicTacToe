import javax.swing.*;

public class TicTacToeCLI {
    public static void main(String[] args) {

        JFrame window = new JFrame("EAST WEST CONNECT TLG LEARNING ");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(new TicTacToe()); // adds the data
        window.setBounds(700,700,700,700); // area of Board 4X4
        window.setVisible(true); // show the gameBoard
        window.setLocationRelativeTo(null); // center of the TV Screen

    }
}
