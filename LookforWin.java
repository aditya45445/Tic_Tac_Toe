//Chances of win:(According to the boxes in the board)
//0,1,2,
//3,4,5,
//6,7,8 

//win is either 3 horizontal columns({0,3,6},{1,4,7},{2,5,8}), or 
//3 vertical rows({0,1,2},{3,4,5},{6,7,8}) or 
//in 2 diagonal direction({0,4,8},{2,4,6})

import javax.swing.*;

public class LookforWin {
     public void whoWins(String[] values, JFrame jF) {
          
          //win possibilities on 3 vertical rows
          if (values[0] == values[1] && values[1] == values[2] && values[0] != "") {
               JOptionPane.showMessageDialog(null, values[0] + "wins");
               Restart(jF);
          }
          else if (values[3] == values[4] && values[4] == values[5] && values[3] != "") {
               JOptionPane.showMessageDialog(null, values[3] + "wins");
               Restart(jF);
          }
          else if (values[6] == values[7] && values[7] == values[8] && values[6] != "") {
               JOptionPane.showMessageDialog(null, values[6] + "wins");
               Restart(jF);
          }

          //win possibilities on 3 horizontal columns
          else if (values[0] == values[3] && values[3] == values[6] && values[0] != "") {
               JOptionPane.showMessageDialog(null, values[0] + "wins");
               Restart(jF);
          }
          else if (values[1] == values[4] && values[4] == values[7] && values[1] != "") {
               JOptionPane.showMessageDialog(null, values[1] + "wins");
               Restart(jF);
          }
          else if (values[2] == values[5] && values[5] == values[8] && values[2] != "") {
               JOptionPane.showMessageDialog(null, values[2] + "wins");
               Restart(jF);
          }

          //win possibilities on 2 diagonal directions
          else if (values[0] == values[4] && values[4] == values[8] && values[0] != "") {
               JOptionPane.showMessageDialog(null, values[0] + "wins");
               Restart(jF);
          }
          else if (values[2] == values[4] && values[4] == values[6] && values[2] != "") {
               JOptionPane.showMessageDialog(null, values[2] + "wins");
               Restart(jF);
          }

          //for tie condition
          else if(
               values[0] == values[1] && 
               values[1] == values[2] &&
               values[2] == values[3] &&
               values[3] == values[4] &&
               values[4] == values[5] &&
               values[5] == values[6] &&
               values[6] == values[7] &&
               values[7] == values[8] &&
               values[8] == values[0] 
          ){
               JOptionPane.showMessageDialog(null, "It's a Tie");
               Restart(jF);
          }
     }

     public void Restart(JFrame JF){
          JF.dispose();
          new ttt();
     }
}