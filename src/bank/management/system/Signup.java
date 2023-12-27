package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Set;
import java.util.zip.Adler32;

public class Signup extends JFrame implements ActionListener {
    JRadioButton R1, R2, R3,R4;
    JButton  next;
    JTextField textname, textname2, textname3, textname4,textname5,textname6,textname7;
    JDateChooser dateChooser;


    Random ran = new Random();
    long first4= (ran.nextLong() % 9000L)+1000L;
    String first = " "+ Math.abs(first4);

    Signup(){
        super("APPLICATION FORM ");
        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image I2 = I1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon I3 = new ImageIcon(I2);
        JLabel Image = new JLabel(I3);
        Image.setBounds(25,10,100,100);
        add(Image);

        JLabel label1 = new JLabel("APPLICATION FROM NO .:" + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Railway", Font.BOLD,28));
        add(label1);

        JLabel label2 = new JLabel("PAGE 1");
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font("Railway", Font.BOLD,22));
        add(label2);

        JLabel label3 = new JLabel("PERSONAL DETAILS" );
        label3.setBounds(290,90,600,30);
        label3.setFont(new Font("Railway", Font.BOLD,22));
        add(label3);

        JLabel Lname1 = new JLabel("Name");
        Lname1.setFont(new Font("Railway",Font.BOLD,20));
        Lname1.setBounds(100,190,100,30);
        add(Lname1);


        textname = new JTextField();
        textname.setFont(new Font("Railway",Font.BOLD,14));
        textname.setBounds(300,190,400,30);
        add(textname);

        JLabel Lname2 = new JLabel("Father's Name");
        Lname2.setFont(new Font("Railway",Font.BOLD,20));
        Lname2.setBounds(100,240,200,30);
        add(Lname2);

        textname2 = new JTextField();
        textname2.setFont(new Font("Railway",Font.BOLD,14));
        textname2.setBounds(300,240,400,30);
        add(textname2);


        JLabel dob = new JLabel("Date of birth");
        dob.setFont(new Font("Railway",Font.BOLD,20));
        dob.setBounds(100,290,200,30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("Railway",Font.BOLD,20));
        labelG.setBounds(100,340,200,30);
        add(labelG);

        R1 = new JRadioButton("Male");
        R1.setFont(new Font("Railway",Font.BOLD,14));
        R1.setBounds(300,340,60,30);
        R1.setBackground(new Color(222,255,228));
        add(R1);
        R2 = new JRadioButton("Female");
        R2.setFont(new Font("Railway",Font.BOLD,14));
        R2.setBackground(new Color(222,255,228));
        R2.setBounds(390,340,100,30);
        add(R2);
        ButtonGroup Gbutton= new ButtonGroup();
        Gbutton.add(R1);
        Gbutton.add(R2);

        JLabel LEmail = new JLabel("Email ID");
        LEmail.setFont(new Font("Railway",Font.BOLD,20));
        LEmail.setBounds(100,390,200,30);
        add(LEmail);

        textname3 = new JTextField();
        textname3.setFont(new Font("Railway",Font.BOLD,14));
        textname3.setBounds(300,390,400,30);
        add(textname3);

        JLabel Lmstatus = new JLabel("Marritle Status");
        Lmstatus.setFont(new Font("Railway",Font.BOLD,20));
        Lmstatus.setBounds(100,440,250,30);
        add(Lmstatus);

        R3 = new JRadioButton("Married");
        R3.setFont(new Font("Railway",Font.BOLD,14));
        R3.setBounds(300,440,100,30);
        R3.setBackground(new Color(222,255,228));
        add(R3);
        R4 = new JRadioButton("Unmarried");
        R4.setFont(new Font("Railway",Font.BOLD,14));
        R4.setBackground(new Color(222,255,228));
        R4.setBounds(400,440,100,30);
        add(R4);
        ButtonGroup Gbutton2= new ButtonGroup();
        Gbutton2.add(R3);
        Gbutton2.add(R4);

        JLabel address = new JLabel("Address");
        address.setFont(new Font("Railway",Font.BOLD,20));
        address.setBounds(100,490,200,30);
        add(address);

        textname4 = new JTextField();
        textname4.setFont(new Font("Railway",Font.BOLD,14));
        textname4.setBounds(300,490,400,30);
        add(textname4);

        JLabel city = new JLabel("City");
        city.setFont(new Font("Railway",Font.BOLD,20));
        city.setBounds(100,540,200,30);
        add(city);

        textname5 = new JTextField();
        textname5.setFont(new Font("Railway",Font.BOLD,14));
        textname5.setBounds(300,540,400,30);
        add(textname5);

        JLabel Pincode = new JLabel("Pin code");
        Pincode.setFont(new Font("Railway",Font.BOLD,20));
        Pincode.setBounds(100,590,200,30);
        add(Pincode);

        textname6 = new JTextField();
        textname6.setFont(new Font("Railway",Font.BOLD,14));
        textname6.setBounds(300,590,400,30);
        add(textname6);

        JLabel State = new JLabel("State");
        State.setFont(new Font("Railway",Font.BOLD,20));
        State.setBounds(100,640,200,30);
        add(State);

        textname7 = new JTextField();
        textname7.setFont(new Font("Railway",Font.BOLD,14));
        textname7.setBounds(300,640,400,30);
        add(textname7);

        next = new JButton("Next");
        next.setFont(new Font("Railway", Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textname.getText();
        String fname = textname2.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (R1.isSelected()){
            gender = "Male";
        } else if (R2.isSelected()) {
            gender = "Female";
        }
        String email = textname3.getText();
        String marital = null;
        if (R3.isSelected()){
            marital = "Married";

        } else if (R4.isSelected()) {
            marital = "Unmarried";
        }
        String Address = textname4.getText();
        String city  = textname5.getText();
        String pincode= textname6.getText();
        String state = textname7.getText();

        try {
            if (textname.getText().equals(" ")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                Con con1= new Con();
                String  q = "insert into Signup values('"+formno+"','" +fname+"','"+dob+"','"+email+"','"+Address+"')";
                con1.statement.executeUpdate(q);
                new Signup2();
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
