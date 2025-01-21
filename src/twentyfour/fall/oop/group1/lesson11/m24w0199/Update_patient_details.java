package twentyfour.fall.oop.group1.lesson11.m24w0199;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Update_patient_details extends JFrame {
    Update_patient_details(){

        JPanel panel = new JPanel();
        panel.setBounds(0,0,1275,718);
        panel.setBackground(new Color(93, 118, 205));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("Update Patient Info");
        label.setBounds(50,10,250,40);
        label.setFont(new Font("Mono",Font.PLAIN,20));
        label.setBackground(Color.BLACK);
        label.setForeground(Color.WHITE);
        panel.add(label);

        JLabel label1 = new JLabel("Name of Patient");
        label1.setBounds(50,70,250,40);
        label1.setFont(new Font("Mono",Font.PLAIN,17));
        label1.setBackground(Color.BLACK);
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        Choice choice = new Choice();
        choice.setBounds(300,70,200,40);
        panel.add(choice);

        try{
            DataBaseConnection c= new DataBaseConnection();
            ResultSet resultSet = c.statement.executeQuery("select * from patient_info");
            while (resultSet.next()){
                choice.add(resultSet.getString("Name"));

            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel label2 = new JLabel("Room Number");
        label2.setBounds(50,110,250,40);
        label2.setFont(new Font("Mono",Font.PLAIN,17));
        label2.setBackground(Color.BLACK);
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        JTextField roomTextField = new JTextField();
        roomTextField.setBounds(300,110,200,35);
        panel.add(roomTextField);


        JLabel label3 = new JLabel("In Time");
        label3.setBounds(50,150,250,40);
        label3.setFont(new Font("Mono",Font.PLAIN,17));
        label3.setBackground(Color.BLACK);
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        JTextField inTimeTextField = new JTextField();
        inTimeTextField.setBounds(300,150,200,35);
        panel.add(inTimeTextField);

        JLabel label4 = new JLabel("Deposit Amount");
        label4.setBounds(50,190,250,40);
        label4.setFont(new Font("Mono",Font.PLAIN,17));
        label4.setBackground(Color.BLACK);
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        JTextField amountTextField = new JTextField();
        amountTextField.setBounds(300,190,200,35);
        panel.add(amountTextField);


        JLabel label5 = new JLabel("Pending Amount");
        label5.setBounds(50,230,250,40);
        label5.setFont(new Font("Mono",Font.PLAIN,17));
        label5.setBackground(Color.BLACK);
        label5.setForeground(Color.WHITE);
        panel.add(label5);

        JTextField pendingAmountTextField = new JTextField();
        pendingAmountTextField.setBounds(300,230,200,35);
        panel.add(pendingAmountTextField);

        JLabel label6 = new JLabel("Disease");
        label6.setBounds(50,270,250,40);
        label6.setFont(new Font("Mono",Font.PLAIN,17));
        label6.setBackground(Color.BLACK);
        label6.setForeground(Color.WHITE);
        panel.add(label6);

        JTextField diseaseTextField = new JTextField();
        diseaseTextField.setBounds(300,270,200,35);
        panel.add(diseaseTextField);


        JButton check = new JButton("Check Details");
        check.setBounds(50,350,150,40);
        check.setForeground(Color.black);
        check.setBackground(Color.white);
        check.setFont(new Font("Mono",Font.PLAIN,17));
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = choice.getSelectedItem();
                String query = "select * from patient_info Where Name = '"+id+"'";

                try{
                    DataBaseConnection c = new DataBaseConnection();
                    ResultSet resultSet = c.statement.executeQuery(query);
                    while (resultSet.next()){

                        roomTextField.setText(resultSet.getString("Room_Number"));
                        inTimeTextField.setText(resultSet.getString("Time"));
                        amountTextField.setText(resultSet.getString("Deposit"));
//                        pendingAmountTextField.setText(resultSet.getString("Deposit"));
                        diseaseTextField.setText(resultSet.getString("Patient_Disease"));


                    }
                    ResultSet resultSet1 = c.statement.executeQuery("select * from Room where room_no = '"+roomTextField.getText()+"'");
                    while (resultSet1.next()){
                        String price = resultSet1.getString("Price");
                        int amountPaid = Integer.parseInt(price)- Integer.parseInt(amountTextField.getText());
                        pendingAmountTextField.setText(""+amountPaid);
                    }


                }catch (Exception E){
                    E.printStackTrace();
                }

            }
        });

        // For Update Data

        JButton update = new JButton("Update Details");
        update.setBounds(200,350,150,40);
        update.setForeground(Color.black);
        update.setBackground(Color.white);
        update.setFont(new Font("Mono",Font.PLAIN,17));
        panel.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    DataBaseConnection c = new DataBaseConnection();
                    String query = choice.getSelectedItem();
                    String room = roomTextField.getText();
                    String time = inTimeTextField.getText();
                    String amount = amountTextField.getText();
                    String disease = diseaseTextField.getText();

                    c.statement.executeUpdate("update into patient_info set Room_Number ='"+room+"', Time='"+time+"',Deposit ='"+amount+"',Patient_Disease='"+disease+"' where name='"+query+"'");
                    JOptionPane.showMessageDialog(null ,"Patient Data update successfully");
                    setVisible(false);

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton close = new JButton("Close");
        close.setBounds(400,350,150,40);
        close.setForeground(Color.black);
        close.setBackground(Color.white);
        close.setFont(new Font("Mono",Font.PLAIN,17));
        panel.add(close);
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });




        setSize(1280,720);
        setLayout(null);
        setLocation(100,100);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Update_patient_details();
    }
}
