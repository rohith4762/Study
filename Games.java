package tictactoe;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Games extends JFrame implements ActionListener{

    
    
    int temp=0;

    JButton[] btn=new JButton[9];
    int i;
    int n;
    boolean player1;
    boolean player2;

    
    Games(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,350);
        this.setLocation(500,60);
        this.setLayout(null);

        ImageIcon im=new ImageIcon("image.jpg");
        Image iz=im.getImage().getScaledInstance(400, 120, Image.SCALE_DEFAULT);
        ImageIcon imi=new ImageIcon(iz);

        JLabel l=new JLabel(imi);
        
        l.setBounds(410,10,700,140);
        this.add(l);

        JPanel p=new JPanel();
        p.setBounds(500,180,510,510);
        p.setBackground(Color.BLACK);
        
        

        for(i=0;i<9;i++){
            btn[i]=new JButton();
            btn[i].setFocusable(false);
            btn[i].setEnabled(true);
            btn[i].setFont(new Font("Roboto",Font.BOLD,30));
            btn[i].addActionListener(this);
            p.add(btn[i]);
        }

        p.setLayout(new GridLayout(3,3,5,5));
        this.add(p);
        
        
    }

    public void gameOver(String s){
        temp = 0;
        Object[] option={"Restart","Exit"};
        int n=JOptionPane.showOptionDialog(this, "YOUR GAME IS OVER\n"+s,"Game Over",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,option,option[0]);
        if(n==0){
            this.dispose();
            new Games();
        }
        else{
            this.dispose();
        }
    
    }

    public void check() {
        if((btn[0].getText() == "X") && (btn[1].getText() == "X") && (btn[2].getText() == "X")) {
            xWins(0, 1, 2);
        }
        else if((btn[0].getText() == "X") && (btn[4].getText() == "X") && (btn[8].getText() == "X")) {
            xWins(0, 4, 8);
        }
        else if((btn[0].getText() == "X") && (btn[3].getText() == "X") && (btn[6].getText() == "X")) {
            xWins(0, 3, 6);
        }
        else if((btn[1].getText() == "X") && (btn[4].getText() == "X") && (btn[7].getText() == "X")) {
            xWins(1, 4, 7);
        }
        else if((btn[2].getText() == "X") && (btn[4].getText() == "X") && (btn[6].getText() == "X")) {
            xWins(2, 4, 6);
        }
        else if((btn[2].getText() == "X") && (btn[5].getText() == "X") && (btn[8].getText() == "X")) {
            xWins(2, 5, 8);
        }
       else if((btn[3].getText() == "X") && (btn[4].getText() == "X") && (btn[5].getText() == "X")) {
            xWins(3, 4, 5);
        }
       else if((btn[6].getText() == "X") && (btn[7].getText() == "X") && (btn[8].getText() == "X")) {
            xWins(6, 7, 8);
        }
      
        else if((btn[0].getText() == "O") && (btn[1].getText() == "O") && (btn[2].getText() == "O")) {
            oWins(0, 1, 2);
        }
        else if((btn[0].getText() == "O") && (btn[3].getText() == "O") && (btn[6].getText() == "O")) {
            oWins(0, 3, 6);
        }
        else if((btn[0].getText() == "O") && (btn[4].getText() == "O") && (btn[8].getText() == "O")) {
            oWins(0, 4, 8);
        }
        else if((btn[1].getText() == "O") && (btn[4].getText() == "O") && (btn[7].getText() == "O")) {
            oWins(1, 4, 7);
        }
        else if((btn[2].getText() == "O") && (btn[4].getText() == "O") && (btn[6].getText() == "O")) {
            oWins(2, 4, 6);
        }
        else if((btn[2].getText() == "O") && (btn[5].getText() == "O") && (btn[8].getText() == "O")) {
            oWins(2, 5, 8);
        }
        else if((btn[3].getText() == "O") && (btn[4].getText() == "O") && (btn[5].getText() == "O")) {
            oWins(3, 4, 5);
        } else if((btn[6].getText() == "O") && (btn[7].getText() == "O") && (btn[8].getText() == "O")) {
            oWins(6, 7, 8);
        }
        else if(temp==9) {
            
             gameOver("maatch Tie");
        }
    }

    public void xWins(int x, int y, int z) {
        btn[x].setBackground(Color.RED);
        btn[y].setBackground(Color.RED);
        btn[z].setBackground(Color.RED);

        for (int i = 0; i < 9; i++) {
            btn[i].setEnabled(false);
        }
        gameOver("X Wins");
    }

    public void oWins(int x, int y, int z) {
        btn[x].setBackground(Color.pink);
        btn[y].setBackground(Color.pink);
        btn[z].setBackground(Color.pink);

        for (int i = 0; i < 9; i++) {
            btn[i].setEnabled(false);
        }
        gameOver("O Wins");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == btn[i]) {
                if (player1) {
                    if (btn[i].getText() == "") {
                        btn[i].setForeground(new Color(255, 0, 0));
                        btn[i].setText("X");
                        player1 = false;

                        temp++;
                        check();
                    }
                } else {
                    if (btn[i].getText() == "") {
                        btn[i].setForeground(new Color(0, 0, 255));
                        btn[i].setText("O");
                        player1 = true;

                        temp++;
                        check();
                    }
                }
            }
        }
    }




    public static void main(String[] args) {
        new Games();
    }

    
    
}

