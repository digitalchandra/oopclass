package twentyfour.fall.oop.group1.lesson11.m24w0199;

import javax.swing.*;
import java.awt.*;
import java.util.jar.JarEntry;

public class Add_New_Patient extends JFrame {

    // Globle Declear of Fields
    JComboBox comboBox;

    JTextField textFieldNumber, textName, textFieldCountry, textFieldDeposit;
    JRadioButton r1, r2;
    Choice c1;
    JLabel date;
    JButton b1, b2;

    Add_New_Patient(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,1280,720);
        panel.setBackground(new Color(93,118,205));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/bed.png"));
        Image image = imageIcon.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(850,0,200,200);
        panel.add(label);

        // Title
        JLabel lableName = new JLabel("ADD NEW PATIENT DETAILS");
        lableName.setBounds(15,0,500,75);
        lableName.setFont(new Font("Mono",Font.BOLD,25));
        lableName.setForeground(Color.WHITE);
        panel.add(lableName);

        // ID Field
        JLabel lableID = new JLabel("PATIENT ID");
        lableID.setBounds(15,56,200,30);
        lableID.setFont(new Font("Mono",Font.PLAIN,17));
        lableID.setForeground(Color.WHITE);
        panel.add(lableID);


        // Dropdown for ID
        comboBox = new JComboBox(new String[]{"Jayaru Card", "My Number Card", "Driving License"});
        comboBox.setBounds(271,56,200,30);
        comboBox.setBackground(new Color(93,118,245));
        comboBox.setForeground(Color.BLACK);
        comboBox.setFont(new Font("Mono",Font.PLAIN,17));
        panel.add(comboBox);

        // ID Field
        JLabel lableNumber = new JLabel("ID Number ");
        lableNumber.setBounds(15,100,200,30);
        lableNumber.setFont(new Font("Mono",Font.PLAIN,17));
        lableNumber.setForeground(Color.WHITE);
        panel.add(lableNumber);

        // Add ID Field
        textFieldNumber = new JTextField();
        textFieldNumber.setBounds(271,100,200,30);
        panel.add(textFieldNumber);

        // Patient Name Field
        JLabel lableName1 = new JLabel("Patient Name  ");
        lableName1.setBounds(15,150,200,30);
        lableName1.setFont(new Font("Mono",Font.PLAIN,17));
        lableName1.setForeground(Color.WHITE);
        panel.add(lableName1);

        // Add Name
        textName = new JTextField();
        textName.setBounds(271,150,200,30);
        panel.add(textName);

        // Patient Gender
        JLabel lableGender = new JLabel("Patient Gender  ");
        lableGender.setBounds(15,200,200,30);
        lableGender.setFont(new Font("Mono",Font.PLAIN,17));
        lableGender.setForeground(Color.WHITE);
        panel.add(lableGender);

        // Gender Radio Button
        r1= new JRadioButton("Male");
        r1.setFont(new Font("Mono",Font.PLAIN,30));
        r1.setForeground(Color.WHITE);
        r1.setBackground(new Color(190,164,170));
        r1.setBounds(271,200,80,12);
        panel.add(r1);





        setSize(1020,700);
        setLayout(null);
        setLocation(230,100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Add_New_Patient();
    }
}
