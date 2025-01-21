package twentyfour.fall.oop.group1.lesson11.m24w0199;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;

public class Employee_info extends JFrame {
    Employee_info() {

        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 1280, 720);
        panel.setBackground(new Color(93, 118, 205));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(100, 100, 1000, 450);
        table.setBackground(new Color(132, 156, 239));
        panel.add(table);

        // Add Label
        JLabel label1 = new JLabel("Employee Details");
        label1.setBounds(100, 20, 200, 30);
        label1.setFont(new Font("Mono", Font.BOLD, 20));
        label1.setForeground(Color.WHITE);
        panel.add(label1);

        JLabel label2 = new JLabel("Employee Name");
        label2.setBounds(100, 70, 200, 30);
        label2.setFont(new Font("Mono", Font.BOLD, 17));
        label2.setForeground(Color.WHITE);
        panel.add(label2);

        JLabel label3 = new JLabel("Employee Age");
        label3.setBounds(270, 70, 200, 30);
        label3.setFont(new Font("Mono", Font.BOLD, 17));
        label3.setForeground(Color.WHITE);
        panel.add(label3);

        JLabel label4 = new JLabel("Contact Number");
        label4.setBounds(440, 70, 200, 30);
        label4.setFont(new Font("Mono", Font.BOLD, 17));
        label4.setForeground(Color.WHITE);
        panel.add(label4);

        JLabel label5 = new JLabel("Salary");
        label5.setBounds(650, 70, 200, 30);
        label5.setFont(new Font("Mono", Font.BOLD, 17));
        label5.setForeground(Color.WHITE);
        panel.add(label5);

        JLabel label6 = new JLabel("Email");
        label6.setBounds(800, 70, 200, 30);
        label6.setFont(new Font("Mono", Font.BOLD, 17));
        label6.setForeground(Color.WHITE);
        panel.add(label6);

        JLabel label7 = new JLabel("Employee ID");
        label7.setBounds(900, 70, 200, 30);
        label7.setFont(new Font("Mono", Font.BOLD, 17));
        label7.setForeground(Color.WHITE);
        panel.add(label7);

        JButton closeButton = new JButton("Close");
        closeButton.setBounds(100, 600, 100, 40);
        closeButton.setBackground(Color.WHITE);
        closeButton.setForeground(Color.black);
        panel.add(closeButton);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        // export ext file in desktop

        JButton exportButton = new JButton("Export File");
        exportButton.setBounds(250, 600, 150, 40);
        exportButton.setBackground(Color.WHITE);
        exportButton.setForeground(Color.black);
        panel.add(exportButton);
        exportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Save as TXT File");
                int userSelection = fileChooser.showSaveDialog(null);

                if (userSelection == JFileChooser.APPROVE_OPTION) {
                    File fileToSave = fileChooser.getSelectedFile();
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave + ".txt"))) {
                        for (int i = 0; i < table.getRowCount(); i++) {
                            for (int j = 0; j < table.getColumnCount(); j++) {
                                writer.write(table.getValueAt(i, j) + "\t");
                            }
                            writer.newLine();
                        }
                        JOptionPane.showMessageDialog(null, "Data exported successfully to " + fileToSave.getAbsolutePath());
                    } catch (IOException ioException) {
                        JOptionPane.showMessageDialog(null, "Error exporting data: " + ioException.getMessage());
                    }
                }
            }
        });

        // Retrieve Data From DB
        try {
            DataBaseConnection c = new DataBaseConnection();
            String query = "select * from employee_info";
            ResultSet resultSet = c.statement.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception E) {
            E.printStackTrace();
        }

        setUndecorated(true);
        setSize(1280, 720);
        setLocation(75, 100);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Employee_info();
    }
}
