package twentyfour.fall.oop.group1.lesson11.m24w0199;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    Reception(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5, 160, 1430, 700 );
        panel.setBackground(new Color(137,207,240));
        add(panel);

        // top section design
         JPanel panel1 = new JPanel();
         panel1.setLayout(null);
         panel1.setBounds(5,6,1430,150);
         panel1.setBackground(new Color(139,207,240));
         add(panel1);

        // office image display form here
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/office.png"));
         Image image = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
         ImageIcon i2=new ImageIcon(image);
         JLabel label = new JLabel(i2);
         label.setBounds(1200, 0, 200,200);
         panel1.add(label);

        // hospital icon image display here
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/h3.png"));
        Image image2 = i11.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i22=new ImageIcon(image2);
        JLabel label1 = new JLabel(i22);
        label1.setBounds(1050, 0, 200,200);
        panel1.add(label1);

        // Cateogries Services

        JButton btn1 = new JButton("Add New Clints");
        btn1.setBounds(30,15,200,40);
        btn1.setBackground(new Color(75,55,135));
        panel1.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Add_New_Patient();
            }
        });

        JButton btn2 = new JButton("Room Status");
        btn2.setBounds(30,58,200,40);
        btn2.setBackground(new Color(75,55,135));
        panel1.add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Room();
            }
        });

        JButton btn3 = new JButton("Department");
        btn3.setBounds(30,100,200,40);
        btn3.setBackground(new Color(75,55,135));
        panel1.add(btn3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Department();
            }
        });

        JButton btn4 = new JButton("Employee Details");
        btn4.setBounds(270,15,200,40);
        btn4.setBackground(new Color(75,55,135));
        panel1.add(btn4);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Employee_info();
            }
        });

        JButton btn5 = new JButton("Patient Information");
        btn5.setBounds(270,58,200,40);
        btn5.setBackground(new Color(75,55,135));
        panel1.add(btn5);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new All_patient_info();
            }
        });

        JButton btn6 = new JButton("Patient Discharge");
        btn6.setBounds(270,100,200,40);
        btn6.setBackground(new Color(75,55,135));
        panel1.add(btn6);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Discharge_patient();
            }
        });

        JButton btn7 = new JButton("Patient Details");
        btn7.setBounds(510,15,200,40);
        btn7.setBackground(new Color(75,55,135));
        panel1.add(btn7);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Update_patient_details();
            }
        });

//        JButton btn8 = new JButton("Ambulance Status");
//        btn8.setBounds(510,58,200,40);
//        btn8.setBackground(new Color(75,55,135));
//        panel1.add(btn8);
//        btn8.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//
//        JButton btn9 = new JButton("Find The Room");
//        btn9.setBounds(510,100,200,40);
//        btn9.setBackground(new Color(75,55,135));
//        panel1.add(btn9);
//        btn9.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });

        JButton btn10 = new JButton("Log Out");
        btn10.setBounds(15,600,200,40);
        btn10.setBackground(Color.red);
        panel.add(btn10);
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });




        setSize(1980,1080);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new Reception();
    }
}
