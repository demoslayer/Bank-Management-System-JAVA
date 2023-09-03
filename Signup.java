package bank.management.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1,r2,m1,m2,m3;
    JButton next;

    JTextField textName,textFathername,textemail,textmariedstat, textaddress,textcity,textpin,textstate;

    JDateChooser dateChooser;
     Random ran=new Random();
     long first4=(ran.nextLong()%900L)+1000L;
     String first=" "+Math.abs(first4);
    Signup(){

        super("APPLICATION FORM");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

       JLabel label1=new JLabel("APPLICATION FORM NO."+first);
       label1.setBounds(160,40,600,40);
       label1.setFont(new Font("Raleway",Font.BOLD,38));
       add(label1);

       JLabel label2=new JLabel("Page 1");
       label2.setFont(new Font("Raleway",Font.BOLD,22));
       label2.setBounds(330,90,600,30);
       add(label2);

       JLabel label3=new JLabel("Personal Details");
       label3.setFont(new Font("Raleway",Font.BOLD,22));
       label3.setBounds(290,120,600,30);
       add(label3);

       JLabel labelname=new JLabel("Name : ");
       labelname.setFont(new Font("Raleway",Font.BOLD,20));
       labelname.setBounds(100,190,100,30);
       add(labelname);

       textName =new JTextField();
       textName.setFont(new Font("Raleway",Font.BOLD,14));
       textName.setBounds(280,195,350,30);
       add(textName);

       JLabel labelfathername=new JLabel("Father's Name : ");
       labelfathername.setFont(new Font("Raleway",Font.BOLD,20));
       labelfathername.setBounds(100,240,200,30);
       add(labelfathername);

       textFathername=new JTextField();
       textFathername.setFont(new Font("Raleway",Font.BOLD,14));
       textFathername.setBounds(280,240,350,30);
       add(textFathername);


        JLabel DOB=new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(280,340,400,30);
        add(dateChooser);


        JLabel labelgender=new JLabel("Gender :");
        labelgender.setFont(new Font("Raleway",Font.BOLD,20));
        labelgender.setBounds(100,290,200,30);
        add(labelgender);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(280,290,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(435,290,90,30);
        add(r2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelemail=new JLabel("Email address :");
        labelemail.setFont(new Font("Raleway",Font.BOLD,20));
        labelemail.setBounds(100,390,200,30);
        add(labelemail);

        textemail=new JTextField();
        textemail.setFont(new Font("Raleway",Font.BOLD,20));
        textemail.setBounds(280,390,400,30);
        add(textemail);


        JLabel labelmariedstat=new JLabel("Married Status :");
        labelmariedstat.setFont(new Font("Raleway",Font.BOLD,20));
        labelmariedstat.setBounds(100,440,200,30);
        add(labelmariedstat);

        m1=new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(280,440,100,30);
        add(m1);

        m2=new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(435,440,100,30);
        add(m2);

        m3=new JRadioButton("Other");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(615,440,100,30);
        add(m3);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);




        JLabel labeladdress=new JLabel("Address :");
        labeladdress.setFont(new Font("Raleway",Font.BOLD,20));
        labeladdress.setBounds(100,490,200,30);
        add(labeladdress);

        textaddress=new JTextField();
        textaddress.setFont(new Font("Raleway",Font.BOLD,20));
        textaddress.setBounds(280,490,400,30);
        add(textaddress);


        JLabel labelcity=new JLabel("City :");
        labelcity.setFont(new Font("Raleway",Font.BOLD,20));
        labelcity.setBounds(100,540,200,30);
        add(labelcity);

        textcity=new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD,20));
        textcity.setBounds(280,540,400,30);
        add(textcity);


        JLabel labelpin=new JLabel("Pin Code :");
        labelpin.setFont(new Font("Raleway",Font.BOLD,20));
        labelpin.setBounds(100,590,200,30);
        add(labelpin);

        textpin=new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,20));
        textpin.setBounds(280,590,400,30);
        add(textpin);


        JLabel labelstate=new JLabel("State :");
        labelstate.setFont(new Font("Raleway",Font.BOLD,20));
        labelstate.setBounds(100,640,200,30);
        add(labelstate);

        textstate=new JTextField();
        textstate.setFont(new Font("Raleway",Font.BOLD,20));
        textstate.setBounds(280,640,400,30);
        add(textstate);


       next =new JButton("Next");
       next.setFont(new Font("Raleway",Font.BOLD,14));
       next.setBackground(Color.BLACK);
       next.setForeground(Color.WHITE);
       next.setBounds(840,640,80,30);
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
       String formno=first;
       String name=textName.getText();
       String fathername=textFathername.getText();
       String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
       String gender=null;
       if(r1.isSelected()){
           gender="Male";
       } else if (r2.isSelected()) {
        gender="Female";
       }
       String email=textemail.getText();
       String marital=null;
       if(m1.isSelected()){
           marital="Married";
       }else if(m2.isSelected()){
           marital="Unmarried";
       }
       else if(m3.isSelected()){
           marital="Other";
       }
       String address=textaddress.getText();
       String city=textcity.getText();
       String pincode=textpin.getText();
       String state=textstate.getText();

       try{
           if(textName.getText().equals("")){
               JOptionPane.showMessageDialog(null,"Fill all the details");

           }
           else{
               Con con1=new Con();
               String q="insert into signup values('"+formno+"','"+name+"','"+fathername+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
               con1.statement.executeUpdate(q);
               new Signup2(formno);
               setVisible(false);
           }
       }catch (Exception E){
           E.printStackTrace();
       }
    }

    public static void main(String[] args) {
        new Signup();
    }
}
