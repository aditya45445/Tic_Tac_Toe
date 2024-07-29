import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ttt extends JFrame implements ActionListener {

     JButton b1 = new JButton();
     JButton b2 = new JButton();
     JButton b3 = new JButton();
     JButton b4 = new JButton();
     JButton b5 = new JButton();
     JButton b6 = new JButton();
     JButton b7 = new JButton();
     JButton b8 = new JButton();
     JButton b9 = new JButton();

     String Chanceof = "X";
     String[] values = {
          "", "", "",
          "", "", "",
          "", "", "",
     };

      //Add Image icons to the board
     ImageIcon x = new ImageIcon("img\\cross1.png");
     ImageIcon o = new ImageIcon("img\\circle2.png");
     ImageIcon clear = new ImageIcon("img\\blankwhite.png");

     //Constructor
     ttt(){
          setVisible(true);
          setSize(600,600);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setTitle("Tic Tac Toe Game");

          setLocationRelativeTo(null); //to bring the window in the middle of the screen

          //Adding buttons. Buttons here are the grid lines        
          add(b1);
          add(b2);
          add(b3);
          add(b4);
          add(b5);
          add(b6);
          add(b7);
          add(b8);
          add(b9);
          setLayout(new GridLayout(3,3));

          //ActionListener to buttons
          b1.addActionListener(this);
          b2.addActionListener(this);
          b3.addActionListener(this);
          b4.addActionListener(this);
          b5.addActionListener(this);
          b6.addActionListener(this);
          b7.addActionListener(this);
          b8.addActionListener(this);
          b9.addActionListener(this);

     }

          //actionlistener implemented auto method
     @Override
     public void actionPerformed(ActionEvent e) {
          Object n = e.getSource();
          //Button b1
          if(n == b1){
               if(values[0].equals("")){
                    if(Chanceof.equals("X")){
                         values[0] = "X";
                         b1.setIcon(x);
                         Chanceof = "O";
                    } else if(Chanceof.equals("O")){
                         values[0] = "O";
                         b1.setIcon(o);
                         Chanceof = "X";
                    }
                    b1.setEnabled(true);
               }
          }

          //Button b2
          else if(n == b2){
               if(values[1].equals("")){
                    if(Chanceof.equals("X")){
                         values[1] = "X";
                         b2.setIcon(x);
                         Chanceof = "O";
                    } else if(Chanceof.equals("O")){
                         values[1] = "O";
                         b2.setIcon(o);
                         Chanceof = "X";
                    }
                    b2.setEnabled(true);
               }
          }

          //Button b3
          else if(n == b3){
               if(values[2].equals("")){
                    if(Chanceof.equals("X")){
                         values[2] = "X";
                         b3.setIcon(x);
                         Chanceof = "O";
                    } else if(Chanceof.equals("O")){
                         values[2] = "O";
                         b3.setIcon(o);
                         Chanceof = "X";
                    }
                    b3.setEnabled(true);
               }
          }

          //Button b4
          else if(n == b4){
               if(values[3].equals("")){
                    if(Chanceof.equals("X")){
                         values[3] = "X";
                         b4.setIcon(x);
                         Chanceof = "O";
                    } else if(Chanceof.equals("O")){
                         values[3] = "O";
                         b4.setIcon(o);
                         Chanceof = "X";
                    }
                    b4.setEnabled(true);
               }
          }

          //Button b5
          else if(n == b5){
               if(values[4].equals("")){
                    if(Chanceof.equals("X")){
                         values[4] = "X";
                         b5.setIcon(x);
                         Chanceof = "O";
                    } else if(Chanceof.equals("O")){
                         values[4] = "O";
                         b5.setIcon(o);
                         Chanceof = "X";
                    }
                    b5.setEnabled(true);
               }
          }

          //Button b6
          else if(n == b6){
               if(values[5].equals("")){
                    if(Chanceof.equals("X")){
                         values[5] = "X";
                         b6.setIcon(x);
                         Chanceof = "O";
                    } else if(Chanceof.equals("O")){
                         values[5] = "O";
                         b6.setIcon(o);
                         Chanceof = "X";
                    }
                    b6.setEnabled(true);
               }
          }

          //Button b7
          else if(n == b7){
               if(values[6].equals("")){
                    if(Chanceof.equals("X")){
                         values[6] = "X";
                         b7.setIcon(x);
                         Chanceof = "O";
                    } else if(Chanceof.equals("O")){
                         values[6] = "O";
                         b7.setIcon(o);
                         Chanceof = "X";
                    }
                    b7.setEnabled(true);
               }
          }

          //Button b8
          else if(n == b8){
               if(values[7].equals("")){
                    if(Chanceof.equals("X")){
                         values[7] = "X";
                         b8.setIcon(x);
                         Chanceof = "O";
                    } else if(Chanceof.equals("O")){
                         values[7] = "O";
                         b8.setIcon(o);
                         Chanceof = "X";
                    }
                    b8.setEnabled(true);
               }
          }

          //Button b9
          else if(n == b9){
               if(values[8].equals("")){
                    if(Chanceof.equals("X")){
                         values[8] = "X";
                         b9.setIcon(x);
                         Chanceof = "O";
                    } else if(Chanceof.equals("O")){
                         values[8] = "O";
                         b9.setIcon(o);
                         Chanceof = "X";
                    }
                    b9.setEnabled(true);
               }
          }
          new LookforWin().whoWins(values, this);
     }
}

//main class
public class tictactoe {
     public static void main(String[] args){
          @SuppressWarnings("unused")
          ttt t = new ttt();
     }
}