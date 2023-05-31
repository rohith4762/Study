package Calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener{

    JLabel lb;
    JPanel pa;
    Double a,temp,temp1,result;
    JTextField textfields;
    char ch;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bplus,bminus,bmul,bdiv,bmod,bclr,bsin,bcos,btan,bsinh,bcosh,bxsy,bxsq,bxs,brx,brxy,blog,bln,bpo,bans;

    Calculator(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(true);
        this.setSize(450,600);
        this.setLocation(450,20);
        this.setLayout(null);

        lb=new JLabel("CALCULATOR");
        lb.setFont(new Font("Roboto",Font.BOLD,40));
        lb.setBounds(94,1,300,80);
        this.add(lb);

        

        pa=new JPanel();
        pa.setBounds(50,80,350,440);
        pa.setBackground(new Color(215, 193, 244));
        pa.setLayout(null);
     //   pa.setVisible(true);
        this.add(pa);
        
        textfields=new JTextField();
        textfields.setFont(new Font("Roboto",Font.BOLD,20));
        textfields.setBounds(20,20,300,30);
       // textfields.setVisible(true);
        pa.add(textfields);


        //first row
        bsin=new JButton("sin");
        bsin.setBounds(20,60,55,55);
        bsin.setEnabled(true);
        bsin.addActionListener(this);
        pa.add(bsin);
        bcos=new JButton("cos");
        bcos.setBounds(80,60,55,55);
        bcos.setEnabled(true);
        bcos.addActionListener(this);
        pa.add(bcos);
        btan=new JButton("tan");
        btan.setBounds(140,60,55,55);
        btan.setEnabled(true);
        btan.addActionListener(this);
        pa.add(btan);
        bsinh=new JButton("sinh");
        bsinh.setBounds(200,60,59,55);
        bsinh.setEnabled(true);
        bsinh.addActionListener(this);
        pa.add(bsinh);
        bcosh=new JButton("cosh");
        bcosh.setBounds(261,60,62,55);
        bcosh.setEnabled(true);
        bcosh.addActionListener(this);
        pa.add(bcosh);

        //2nd row

        bxsy=new JButton("tanh");
        bxsy.setBounds(19,120,59,55);
        bxsy.setEnabled(true);
        bxsy.addActionListener(this);
        pa.add(bxsy);
        bxsq=new JButton("x^3");
        bxsq.setBounds(80,120,55,55);
        bxsq.setEnabled(true);
        bxsq.addActionListener(this);
        pa.add(bxsq);
        bxs=new JButton("x^2");
        bxs.setBounds(140,120,55,55);
        bxs.setEnabled(true);
        bxs.addActionListener(this);
        pa.add(bxs);
        brx=new JButton("√x");
        brx.setBounds(200,120,55,55);
        brx.setEnabled(true);
        brx.addActionListener(this);
        pa.add(brx);
        brxy=new JButton("3√x");
        brxy.setBounds(260,120,58,55);
        brxy.setEnabled(true);
        brxy.addActionListener(this);
        pa.add(brxy);

        //3rd row

        b9=new JButton("9");
        b9.setBounds(20,180,55,55);
        b9.setEnabled(true);
        b9.addActionListener(this);
        pa.add(b9);
        b8=new JButton("8");
        b8.setBounds(80,180,55,55);
        b8.setEnabled(true);
        b8.addActionListener(this);
        pa.add(b8);
        b7=new JButton("7");
        b7.setBounds(140,180,55,55);
        b7.setEnabled(true);
        b7.addActionListener(this);
        pa.add(b7);
        bln=new JButton("ln");
        bln.setBounds(200,180,55,55);
        bln.setEnabled(true);
        bln.addActionListener(this);
        pa.add(bln);
        blog=new JButton("log");
        blog.setBounds(260,180,58,55);
        blog.setEnabled(true);
        blog.addActionListener(this);
        pa.add(blog);
        

        //4th row

        b6=new JButton("6");
        b6.setBounds(20,240,55,55);
        b6.setEnabled(true);
        b6.addActionListener(this);
        pa.add(b6);
        b5=new JButton("5");
        b5.setBounds(80,240,55,55);
        b5.setEnabled(true);
        b5.addActionListener(this);
        pa.add(b5);
        b4=new JButton("4");
        b4.setBounds(140,240,55,55);
        b4.setEnabled(true);
        b4.addActionListener(this);
        pa.add(b4);
        bplus=new JButton("+");
        bplus.setBounds(200,240,55,55);
        bplus.setEnabled(true);
        bplus.addActionListener(this);
        pa.add(bplus);
        bminus= new JButton("-");
        bminus.setBounds(260,240,55,55);
        bminus.setEnabled(true);
        bminus.addActionListener(this);;
        pa.add(bminus);


        b3=new JButton("3");
        b3.setBounds(20,300,55,55);
        b3.setEnabled(true);
        b3.addActionListener(this);
        pa.add(b3);
        b2=new JButton("2");
        b2.setBounds(80,300,55,55);
        b2.setEnabled(true);
        b2.addActionListener(this);
        pa.add(b2);
        b1=new JButton("1");
        b1.setBounds(140,300,55,55);
        b1.setEnabled(true);
        b1.addActionListener(this);
        pa.add(b1);
        bmul=new JButton("*");
        bmul.setBounds(200,300,55,55);
        bmul.setEnabled(true);
        bmul.addActionListener(this);
        pa.add(bmul);
        bdiv=new JButton("/");
        bdiv.setBounds(260,300,55,55);
        bdiv.setEnabled(true);
        bdiv.addActionListener(this);
        pa.add(bdiv);


        b0=new JButton("0");
        b0.setBounds(20,360,55,55);
        b0.setEnabled(true);
        b0.addActionListener(this);
        pa.add(b0);
        bpo=new JButton(".");
        bpo.setBounds(80,360,55,55);
        bpo.setEnabled(true);
        bpo.addActionListener(this);
        pa.add(bpo);
        bmod=new JButton("%");
        bmod.setBounds(140,360,55,55);
        bmod.setEnabled(true);
        bmod.addActionListener(this);
        pa.add(bmod);
        bclr=new JButton("ac");
        bclr.setBounds(200,360,58,55);
        bclr.setEnabled(true);
        bclr.addActionListener(this);
        pa.add(bclr);
        bans=new JButton("=");
        bans.setBounds(260,360,55,55);
        bans.setEnabled(true);
        bans.addActionListener(this);
        pa.add(bans);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==bsin){
            a=Math.sin(Double.parseDouble(textfields.getText()));
            textfields.setText("");
            textfields.setText(textfields.getText() + a);
        }
        else if(e.getSource()==bcos){
            a=Math.cos(Double.parseDouble(textfields.getText()));
            textfields.setText("");
            textfields.setText(textfields.getText() + a);
        }
        else if(e.getSource()==btan){
            a=Math.tan(Double.parseDouble(textfields.getText()));
            textfields.setText("");
            textfields.setText(textfields.getText() + a);
        }
        else if(e.getSource()==b0){
            
            textfields.setText(textfields.getText() + "0");
        }
        else if(e.getSource()==b1){
            
            textfields.setText(textfields.getText() + "1");
        }
        else if(e.getSource()==b2){
            
            textfields.setText(textfields.getText() + "2");
        }
        else if(e.getSource()==b3){
            
            textfields.setText(textfields.getText() + "3");
        }
        else if(e.getSource()==b4){
            
            textfields.setText(textfields.getText() + "4");
        }
        else if(e.getSource()==b5){
            
            textfields.setText(textfields.getText() + "5");
        }
        else if(e.getSource()==b6){
            
            textfields.setText(textfields.getText() + "6");
        }
        else if(e.getSource()==b7){
            
            textfields.setText(textfields.getText() + "7");
        }
        else if(e.getSource()==b8){
            
            textfields.setText(textfields.getText() + "8");
        }
        else if(e.getSource()==b9){
            
            textfields.setText(textfields.getText() + "9");
        }
        else if(e.getSource()==bpo){
            if(textfields.getText()==""){
                textfields.setText("invalid");
            }else{
                textfields.setText(textfields.getText() + ".");
                
            }
        }
        else if(e.getSource()==bclr){
            textfields.setText("");
        }
        else if(e.getSource()==bplus){
            
            temp=Double.parseDouble(textfields.getText());
            ch='+';
            textfields.setText("");
            
            
        }
        else if(e.getSource()==bminus){
            temp=Double.parseDouble(textfields.getText());
            ch='-';
            textfields.setText("");
            
        }
        else if(e.getSource()==bmul){
            temp=Double.parseDouble(textfields.getText());
            ch='*';
            textfields.setText("");
            
        }
        else if(e.getSource()==bdiv){
            temp=Double.parseDouble(textfields.getText());
            ch='/';
            textfields.setText("");
            
        }
        else if(e.getSource()==bmod){
            temp=Double.parseDouble(textfields.getText());
            ch='%';
            textfields.setText("");
            
        }
        else if(e.getSource()==bsinh){
            a=Math.sinh(Double.parseDouble(textfields.getText()));
            textfields.setText("");
            textfields.setText(textfields.getText() + a);
        }
        else if(e.getSource()==bcosh){
            a=Math.cosh(Double.parseDouble(textfields.getText()));
            textfields.setText("");
            textfields.setText(textfields.getText() + a);
        }
        else if(e.getSource()==brxy){
            a=Math.cbrt(Double.parseDouble(textfields.getText()));
            textfields.setText("");
            textfields.setText(textfields.getText() + a);
        }
        else if(e.getSource()==brx){
            a=Math.sqrt(Double.parseDouble(textfields.getText()));
            textfields.setText("");
            textfields.setText(textfields.getText() + a);
        }
        else if(e.getSource()==bxsy){
            a=Math.tanh(Double.parseDouble(textfields.getText()));
            textfields.setText("");
            textfields.setText(textfields.getText() + a);
        }
        else if(e.getSource()==bxs){
            a=Math.pow(Double.parseDouble(textfields.getText()),2);
            textfields.setText("");
            textfields.setText(textfields.getText() + a);
        }
        else if(e.getSource()==bxsq){
            a=Math.pow(Double.parseDouble(textfields.getText()),3);
            textfields.setText("");
            textfields.setText(textfields.getText() + a);
        }
        else if(e.getSource()==bln){
            a=Math.log10(Double.parseDouble(textfields.getText()));
            textfields.setText("");
            textfields.setText(textfields.getText() + a);
        }

        else if(e.getSource()==blog){
            
            a=Math.log(Double.parseDouble(textfields.getText()));
            textfields.setText("");
            textfields.setText(textfields.getText() + a);

        }
        else if(e.getSource()==bans){
            temp1=Double.parseDouble(textfields.getText());
            switch(ch){
                case '+':
                result=temp+temp1;
                break;
                case '-':
                result=temp-temp1;
                break;
                case '*':
                result=temp*temp1;
                break;
                case '/':
                result=temp/temp1;
                break;
                case '%':
                result=temp%temp1;
                break;
            }
            textfields.setText("");
            textfields.setText(textfields.getText() + result);

        }
    }
    public static void main(String[] args) {
        new Calculator();

    }
}
