package twentyfour.fall.oop.group1.lesson11.m24w0199;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Add_New_Patient extends JFrame implements ActionListener {

    JComboBox<String> comboBoxIDType;
    JTextField textFieldIDNumber, textFieldName, textFieldDisease, textFieldDeposit;
    JRadioButton rMale, rFemale;
    Choice roomChoice;
    JLabel dateLabel;
    JButton addButton, backButton;

    Add_New_Patient() {
        // Frame setup
        setTitle("Hospital Management System - Add New Patient");
        setSize(1020, 700);
        setLayout(null);
        setLocation(230, 100);

        // Main panel
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 1000, 650);
        panel.setBackground(new Color(93, 118, 205));
        panel.setLayout(null);
        add(panel);

        // Title label
        JLabel labelTitle = new JLabel("ADD NEW PATIENT DETAILS");
        labelTitle.setBounds(300, 10, 400, 50);
        labelTitle.setFont(new Font("Mono", Font.BOLD, 25));
        labelTitle.setForeground(Color.WHITE);
        panel.add(labelTitle);

        // ID Type
        JLabel idTypeLabel = new JLabel("ID Type:");
        idTypeLabel.setBounds(50, 100, 100, 30);
        idTypeLabel.setForeground(Color.WHITE);
        idTypeLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(idTypeLabel);

        comboBoxIDType = new JComboBox<>(new String[]{"Passport", "National ID", "Driving License"});
        comboBoxIDType.setBounds(200, 100, 200, 30);
        panel.add(comboBoxIDType);

        // ID Number
        JLabel idNumberLabel = new JLabel("ID Number:");
        idNumberLabel.setBounds(50, 150, 100, 30);
        idNumberLabel.setForeground(Color.WHITE);
        idNumberLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(idNumberLabel);

        textFieldIDNumber = new JTextField();
        textFieldIDNumber.setBounds(200, 150, 200, 30);
        panel.add(textFieldIDNumber);

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 200, 100, 30);
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(nameLabel);

        textFieldName = new JTextField();
        textFieldName.setBounds(200, 200, 200, 30);
        panel.add(textFieldName);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 250, 100, 30);
        genderLabel.setForeground(Color.WHITE);
        genderLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(genderLabel);

        rMale = new JRadioButton("Male");
        rMale.setBounds(200, 250, 80, 30);
        rMale.setBackground(new Color(93, 118, 205));
        rMale.setForeground(Color.WHITE);
        panel.add(rMale);

        rFemale = new JRadioButton("Female");
        rFemale.setBounds(300, 250, 80, 30);
        rFemale.setBackground(new Color(93, 118, 205));
        rFemale.setForeground(Color.WHITE);
        panel.add(rFemale);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rMale);
        genderGroup.add(rFemale);

        // Disease
        JLabel diseaseLabel = new JLabel("Disease:");
        diseaseLabel.setBounds(50, 300, 100, 30);
        diseaseLabel.setForeground(Color.WHITE);
        diseaseLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(diseaseLabel);

        textFieldDisease = new JTextField();
        textFieldDisease.setBounds(200, 300, 200, 30);
        panel.add(textFieldDisease);

        // Room Number
        JLabel roomLabel = new JLabel("Room Number:");
        roomLabel.setBounds(50, 350, 120, 30);
        roomLabel.setForeground(Color.WHITE);
        roomLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(roomLabel);

        /// Show data form the Database
        roomChoice = new Choice();
        try {
            DataBaseConnection c = new DataBaseConnection();
            ResultSet rs = c.statement.executeQuery("SELECT room_no FROM Room WHERE Availability = 'Availabil'");
            while (rs.next()) {
                roomChoice.add(rs.getString("room_no"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        roomChoice.setBounds(200, 350, 200, 30);
        panel.add(roomChoice);

        // Deposit
        JLabel depositLabel = new JLabel("Deposit:");
        depositLabel.setBounds(50, 400, 100, 30);
        depositLabel.setForeground(Color.WHITE);
        depositLabel.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(depositLabel);

        textFieldDeposit = new JTextField();
        textFieldDeposit.setBounds(200, 400, 200, 30);
        panel.add(textFieldDeposit);

        // Date and Time
        JLabel dateLabelStatic = new JLabel("Date and Time:");
        dateLabelStatic.setBounds(50, 450, 120, 30);
        dateLabelStatic.setForeground(Color.WHITE);
        dateLabelStatic.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(dateLabelStatic);

        dateLabel = new JLabel(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        dateLabel.setBounds(200, 450, 200, 30);
        dateLabel.setForeground(Color.WHITE);
        panel.add(dateLabel);

        // Buttons
        addButton = new JButton("Add Patient");
        addButton.setBounds(150, 500, 120, 40);
        addButton.addActionListener(this);
        panel.add(addButton);

        setUndecorated(true);
        backButton = new JButton("Back");
        backButton.setBounds(300, 500, 120, 40);
        backButton.addActionListener(this);
        panel.add(backButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String gender = rMale.isSelected() ? "Male" : "Female";
            String idType = (String) comboBoxIDType.getSelectedItem();
            String idNumber = textFieldIDNumber.getText();
            String name = textFieldName.getText();
            String disease = textFieldDisease.getText();
            String roomNo = roomChoice.getSelectedItem();
            String deposit = textFieldDeposit.getText();
            String currentDate = dateLabel.getText();

            if (idNumber.isEmpty() || name.isEmpty() || disease.isEmpty() || deposit.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all fields!");
                return;
            }

            try {
                DataBaseConnection c = new DataBaseConnection();
                String query = "INSERT INTO patient_info (ID, Number, Name, Gender, Patient_Disease, Room_Number, Time, Deposit) VALUES ('"
                        + idType + "', '" + idNumber + "', '" + name + "', '" + gender + "', '"
                        + disease + "', '" + roomNo + "', '" + currentDate + "', '" + deposit + "')";
                String updateRoom = "UPDATE Room SET Availability = 'Occupied' WHERE room_no = '" + roomNo + "'";

                c.statement.executeUpdate(query);
                c.statement.executeUpdate(updateRoom);

                JOptionPane.showMessageDialog(null, "Patient added successfully.");
                setVisible(false);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else if (e.getSource() == backButton) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Add_New_Patient();
    }
}
