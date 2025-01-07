package twentyfour.fall.oop.group1.lesson11.m24w0199;

import java.sql.ResultSet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Font.BOLD;

public class Login extends JFrame implements ActionListener {

    JTextField textField;
    JPasswordField jPasswordField;
    JButton b1, b2;

    Login(){

        JLabel nameLable = new JLabel("UserName");
        nameLable.setBounds(40,25,100,30);
        nameLable.setFont(new Font("Tahoma", BOLD, 15));
        nameLable.setForeground(Color.white);
        add(nameLable);
        
        JLabel password = new JLabel("Password");
        password.setBounds(40,65,100,30);
        password.setFont(new Font("Tahoma", BOLD,15));
        password.setForeground(Color.white);
        add(password);


        // createing the username and password text field

        textField = new JTextField();
        textField.setBounds(150, 20, 250, 40);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField.setBackground(new Color(255,255,255));
        add(textField);
        // Password Field

        jPasswordField=new JPasswordField();
        jPasswordField.setBounds(150,60,250,40);
        jPasswordField.setFont(new Font("Tahoma", Font.PLAIN,15));
        jPasswordField.setBackground(new Color(255,255,255));
        add(jPasswordField);




    ImageIcon imageIcone = new ImageIcon(ClassLoader.getSystemResource("icon/h.png"));
    Image i1= imageIcone.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
    ImageIcon imageIcon1= new ImageIcon(i1);
    JLabel lable= new JLabel(imageIcon1);
    lable.setBounds(150, 200, 200, 200);
    add(lable);

    b1=new JButton("Login");
    b1.setBounds(40,140,120,50);
    b1.setFont(new Font("serif", BOLD,17));
    b1.setBackground(Color.blue);
    b1.setForeground(Color.black);
    b1.addActionListener(this);
    add(b1);

    b2=new JButton("Cancle");
    b2.setBounds(200,140,120,50);
    b2.setFont(new Font("serif", BOLD,17));
    b2.setBackground(Color.red);
    b2.setForeground(Color.red);
    b2.addActionListener(this);
    add(b2);


        getContentPane().setBackground(new Color(157, 168, 227));
        setSize(450,650);
        setLocation(500,0);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args){
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                DataBaseConnection c = new DataBaseConnection();
                String user = textField.getText();
                char[] passwordChars = jPasswordField.getPassword();
                String password = new String(passwordChars);

                String query = "SELECT * FROM login WHERE ID = '" + user + "' AND PW = '" + password + "'";
                ResultSet resultSet = c.statement.executeQuery(query);

                if (resultSet.next()) {
                    new Reception(); // Ensure 'Test' class exists
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                }

                // Close the ResultSet
                resultSet.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == b2) {
            System.exit(0);
        }
    }

}
