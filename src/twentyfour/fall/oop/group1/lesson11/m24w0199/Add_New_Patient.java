package twentyfour.fall.oop.group1.lesson11.m24w0199;

import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.jar.JarEntry;

public class Add_New_Patient extends JFrame {

    // Globle Declear of Fields
    JComboBox comboBox;

    JTextField textFieldNumber, textName, textFieldDisease, textFieldDeposit;
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
        r1.setFont(new Font("Mono",Font.PLAIN,15));
        r1.setForeground(Color.WHITE);
        r1.setBackground(new Color(190,164,170));
        r1.setBounds(271, 200, 200, 40);
        panel.add(r1);


        r2= new JRadioButton("Female");
        r2.setFont(new Font("Mono",Font.PLAIN,15));
        r2.setForeground(Color.WHITE);
        r2.setBackground(new Color(190,164,170));
        r2.setBounds(400, 200, 200, 40);
        panel.add(r2);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(r1);
        genderGroup.add(r2);

        // Disease
        JLabel lableDisease = new JLabel("Symptoms");
        lableDisease.setBounds(15,250,200,30);
        lableDisease.setFont(new Font("Mono",Font.PLAIN,17));
        lableDisease.setForeground(Color.WHITE);
        panel.add(lableDisease);

        // Add Name
        textFieldDisease = new JTextField();
        textFieldDisease.setBounds(271,250,200,30);
        panel.add(textFieldDisease);


        // Disease
        JLabel lableRoom = new JLabel("Assign Room");
        lableRoom.setBounds(15,300,200,30);
        lableRoom.setFont(new Font("Mono",Font.PLAIN,17));
        lableRoom.setForeground(Color.WHITE);
        panel.add(lableRoom);

        // room show form DB

        // Disease
        JLabel lableDate = new JLabel("Date and Time");
        lableDate.setBounds(15,350,200,30);
        lableDate.setFont(new Font("Mono",Font.PLAIN,17));
        lableDate.setForeground(Color.WHITE);
        panel.add(lableDate);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentDate = new Date(); // Create a new Date object with the current date and time
        String formattedDate = formatter.format(currentDate); // Format the date
        date = new JLabel(formattedDate); // Use the formatted date in the JLabel
        date.setBounds(271, 350, 200, 30);
        date.setForeground(Color.WHITE);
        date.setFont(new Font("Mono", Font.PLAIN, 17));
        panel.add(date);


        // Disease
        JLabel lableDiposit = new JLabel("Deposit Amount");
        lableDiposit.setBounds(15,400,200,30);
        lableDiposit.setFont(new Font("Mono",Font.PLAIN,17));
        lableDiposit.setForeground(Color.WHITE);
        panel.add(lableDiposit);

        // Add Name
        textFieldDeposit = new JTextField();
        textFieldDeposit.setBounds(271,400,200,30);
        panel.add(textFieldDeposit);

        b1= new JButton("Add Patient");
        b1.setBounds(160,450,120,50);
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.white);
        panel.add(b1);

        b2= new JButton("Back");
        b2.setBounds(400,450,120,50);
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.WHITE);
        panel.add(b2);





        setUndecorated(true);
        setSize(1020,700);
        setLayout(null);
        setLocation(230,100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Add_New_Patient();
    }
}
