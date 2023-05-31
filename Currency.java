package conveter;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Currency extends JFrame implements ActionListener{    
    JButton bt;
    JTextField tx,tf;
    JComboBox co,com;

    Currency(){
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLocation(500, 60);
        ImageIcon im=new ImageIcon("exchange.jpg");
        Image i=im.getImage().getScaledInstance(180, 90, Image.SCALE_DEFAULT);
        ImageIcon im1=new ImageIcon(i);
        JLabel l1=new JLabel(im1);
        l1.setBounds(300,50,180,90);
        this.add(l1);

        JLabel l2=new JLabel("WELCOME TO CURRENCY CONVETER");
        l2.setBounds(500,20,900,180);
        l2.setFont(new Font("antipasto pro",Font.BOLD,40));
        this.add(l2);

        String[] cfrom={"india-INR","usa-DOLLAR","australia-DOLLAR","china-YUAN","japan-YEN","russia-RUBLE","british-POUNDS"};
        co=new JComboBox<>(cfrom);
        co.setBounds(900, 220, 130, 40);
        this.add(co);
        this.setVisible(true);

        JLabel la=new JLabel("FROM");
        la.setBounds(600,220,150,40);
        this.add(la);
        this.setVisible(true);

        tx=new JTextField();
        tx.setBounds(750,220,100,40);
        tx.setVisible(true);
        this.add(tx);

        


        String[] cto={"india-INR","usa-DOLLAR","australia-DOLLAR","china-YUAN","japan-YEN","russia-RUBLE","british-POUNDS"};
        com=new JComboBox<>(cto);
        com.setBounds(900, 320, 130, 40);
        this.add(com);
        this.setVisible(true);

        JLabel lam=new JLabel("to");
        lam.setBounds(600,320,150,40);
        this.add(lam);
        this.setVisible(true);

        tf=new JTextField();
        tf.setBounds(750,320,100,40);
        tf.setVisible(true);
        this.add(tf);

        bt=new JButton("CONVERT");
        bt.setBounds(722, 400, 100, 40);
        bt.setVisible(true);
        bt.setFocusable(false);
        bt.addActionListener(this);

        this.add(bt);
        

        

        

        
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==bt){
            double amt=Double.parseDouble(tx.getText());
            String from=co.getSelectedItem().toString();
            String to=com.getSelectedItem().toString();

            if(from.equalsIgnoreCase("india-INR")){
                if(to.equalsIgnoreCase("british-POUNDS")){
                    tf.setText((double)amt*0.0098612+" ");
                }
                else if(to.equalsIgnoreCase("australia-DOLLAR")){
                    tf.setText((double)amt*0.018196+" ");
                }
                else if(to.equalsIgnoreCase("russia-RUBLE")){
                    tf.setText((double)amt*0.94384+" ");
                }
                else if(to.equalsIgnoreCase("china-YUAN")){
                    tf.setText((double)amt*0.83602+" ");
                }
                else if(to.equalsIgnoreCase("japan-YEN")){
                    tf.setText((double)amt*1.6164+" ");
                }
                else if(to.equalsIgnoreCase("usa-DOLLAR")){
                    tf.setText((double)amt*0.12172+" ");
                }

            }
            if(from.equalsIgnoreCase("usa-DOLLAR")){
                if(to.equalsIgnoreCase("india-INR")){
                    tf.setText((double)amt*82.155+" ");
                }
                else if(to.equalsIgnoreCase("british-POUNDS")){
                    tf.setText((double)amt*0.81030+" ");
                }
                else if(to.equalsIgnoreCase("china-YUAN")){
                    tf.setText((double)amt*6.8682+" ");
                }
                else if(to.equalsIgnoreCase("japan-YEN")){
                    tf.setText((double)amt*132.79+" ");
                }
                else if(to.equalsIgnoreCase("australia-DOLLAR")){
                    tf.setText((double)amt*1.4951+" ");
                }
                else if(to.equalsIgnoreCase("russia-RUBLE")){
                    tf.setText((double)amt*77.538+" ");
                }

            }

            if(from.equalsIgnoreCase("australia-DOLLAR")){
                if(to.equalsIgnoreCase("india-INR")){
                    tf.setText((double)amt*54.950+" ");
                }
                else if(to.equalsIgnoreCase("usa-DOLLAR")){
                    tf.setText((double)amt*0.668+"$"+" ");
                }
                else if(to.equalsIgnoreCase("china-YUAN")){
                    tf.setText((double)amt*4.5939+" ");
                }
                else if(to.equalsIgnoreCase("japan-YEN")){
                    tf.setText((double)amt*88.819+" ");
                }
                else if(to.equalsIgnoreCase("russia-RUBLE")){
                    tf.setText((double)amt*51.862+" ");
                }
                else if(to.equalsIgnoreCase("british-POUNDS")){
                    tf.setText((double)amt*0.541+" ");
                }

            }

            if(from.equalsIgnoreCase("british-POUNDS")){
                if(to.equalsIgnoreCase("india-INR")){
                    tf.setText((double)amt*101.39 + " ");
                }
                else if(to.equalsIgnoreCase("australia-DOLLAR")){
                    tf.setText((double)amt*1.8451+ " ");
                }
                else if(to.equalsIgnoreCase("china-YUAN")){
                    tf.setText((double)amt*804761+" ");
                }
                else if(to.equalsIgnoreCase("japan-YEN")){
                    tf.setText((double)amt*163.88+" ");
                }
                else if(to.equalsIgnoreCase("russia-RUBLE")){
                    tf.setText((double)amt*95.690+" ");
                }
                
                else if(to.equalsIgnoreCase("usa-DOLLAR")){
                    tf.setText((double)amt*1.2341+" ");
                }


            }

            if(from.equalsIgnoreCase("russia-RUBLE")){
                if(to.equalsIgnoreCase("india-INR")){
                    tf.setText((double)amt*1.0595+" ");
                }
                else if(to.equalsIgnoreCase("usa-DOLLAR")){
                    tf.setText((double)amt*0.01289+" ");
                }
                else if(to.equalsIgnoreCase("china-YUAN")){
                    tf.setText((double)amt*0.088+" ");
                }
                else if(to.equalsIgnoreCase("australia-DOLLAR")){
                    tf.setText((double)amt*0.019+" ");
                }
                else if(to.equalsIgnoreCase("british-POUNDS")){
                    tf.setText((double)amt*0.010+" ");
                }
                else if(to.equalsIgnoreCase("japan-YEN")){
                    tf.setText((double)amt*1.7126+" ");
                }
            }

            if(from.equalsIgnoreCase("japan-YEN")){
                if(to.equalsIgnoreCase("india-INR")){
                    tf.setText((double)amt*0.618+" ");
                }
                else if(to.equalsIgnoreCase("usa-DOLLAR")){
                    tf.setText((double)amt*0.007+" ");
                }
                else if(to.equalsIgnoreCase("russia-RUBLE")){
                    tf.setText((double)amt*0.583+" ");
                }
                else if(to.equalsIgnoreCase("australia-DOLLAR")){
                    tf.setText((double)amt*0.011+" ");
                }
                else if(to.equalsIgnoreCase("british-POUNDS")){
                    tf.setText((double)amt*0.006+" ");
                }
                else if(to.equalsIgnoreCase("china-YUAN")){
                    tf.setText((double)amt*0.051+" ");
                }
            }


            if(from.equalsIgnoreCase("china-YUAN")){
                if(to.equalsIgnoreCase("india-INR")){
                    tf.setText((double)amt*11.962+" ");
                }
                else if(to.equalsIgnoreCase("usa-DOLLAR")){
                    tf.setText((double)amt*0.145+" ");
                }
                else if(to.equalsIgnoreCase("russia-RUBLE")){
                    tf.setText((double)amt*11.289+" ");
                }
                else if(to.equalsIgnoreCase("australia-DOLLAR")){
                    tf.setText((double)amt*0.217+" ");
                }
                else if(to.equalsIgnoreCase("british-POUNDS")){
                    tf.setText((double)amt*0.117+" ");
                }
                else if(to.equalsIgnoreCase("japan-YEN")){
                    tf.setText((double)amt*19.334+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        new Currency();
    }
}
