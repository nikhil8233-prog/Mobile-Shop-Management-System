package mobileshop;

import javax.swing.*;
import java.awt.*;

public class ChangePassword extends JFrame {

    Color blue = new Color(25, 55, 109);

    public ChangePassword() {

        setTitle("Change Password - Mobile Shop Management System");
        setSize(650, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        // ================= HEADER =================

        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(blue);
        headerPanel.setPreferredSize(new Dimension(0, 75));

        JLabel logoLabel = new JLabel();

        try {
            ImageIcon icon = new ImageIcon(
                    getClass().getResource("/piit.jpeg")
            );

            Image image = icon.getImage().getScaledInstance(
                    170, 52, Image.SCALE_SMOOTH
            );

            logoLabel.setIcon(new ImageIcon(image));

        } catch (Exception e) {
            logoLabel.setText("POORNIMA");
            logoLabel.setForeground(Color.WHITE);
            logoLabel.setFont(new Font("Arial", Font.BOLD, 20));
        }

        JPanel logoPanel = new JPanel(
                new FlowLayout(FlowLayout.LEFT, 15, 11)
        );

        logoPanel.setBackground(Color.WHITE);
        logoPanel.add(logoLabel);

        headerPanel.add(logoPanel, BorderLayout.WEST);

        JLabel titleLabel = new JLabel(
                "Change Password",
                SwingConstants.CENTER
        );

        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(
                new Font("Arial", Font.BOLD, 23)
        );

        headerPanel.add(titleLabel, BorderLayout.CENTER);

        mainPanel.add(headerPanel, BorderLayout.NORTH);

        // ================= FORM =================

        JPanel formPanel = new JPanel(
                new GridBagLayout()
        );

        formPanel.setBackground(Color.WHITE);

        GridBagConstraints gbc =
                new GridBagConstraints();

        gbc.insets =
                new Insets(12, 20, 12, 20);

        gbc.fill =
                GridBagConstraints.HORIZONTAL;

        Font labelFont =
                new Font("Arial", Font.BOLD, 15);

        // Current Password

        JLabel currentLabel =
                new JLabel("Current Password :");

        currentLabel.setFont(labelFont);

        JPasswordField currentField =
                new JPasswordField(20);

        // New Password

        JLabel newLabel =
                new JLabel("New Password :");

        newLabel.setFont(labelFont);

        JPasswordField newField =
                new JPasswordField(20);

        // Confirm Password

        JLabel confirmLabel =
                new JLabel("Confirm Password :");

        confirmLabel.setFont(labelFont);

        JPasswordField confirmField =
                new JPasswordField(20);

        // ================= ROW 1 =================

        gbc.gridx = 0;
        gbc.gridy = 0;

        formPanel.add(currentLabel, gbc);

        gbc.gridx = 1;

        formPanel.add(currentField, gbc);

        // ================= ROW 2 =================

        gbc.gridx = 0;
        gbc.gridy = 1;

        formPanel.add(newLabel, gbc);

        gbc.gridx = 1;

        formPanel.add(newField, gbc);

        // ================= ROW 3 =================

        gbc.gridx = 0;
        gbc.gridy = 2;

        formPanel.add(confirmLabel, gbc);

        gbc.gridx = 1;

        formPanel.add(confirmField, gbc);

        // ================= BUTTONS =================

        JButton changeButton =
                new JButton("CHANGE PASSWORD");

        JButton clearButton =
                new JButton("CLEAR");

        changeButton.setPreferredSize(
                new Dimension(170, 40)
        );

        clearButton.setPreferredSize(
                new Dimension(110, 40)
        );

        changeButton.setFont(
                new Font("Arial", Font.BOLD, 13)
        );

        clearButton.setFont(
                new Font("Arial", Font.BOLD, 13)
        );

        changeButton.setBackground(
                new Color(20, 150, 80)
        );

        changeButton.setForeground(Color.WHITE);

        clearButton.setBackground(
                new Color(220, 220, 220)
        );

        JPanel buttonPanel =
                new JPanel(
                        new FlowLayout(
                                FlowLayout.CENTER,
                                20,
                                15
                        )
                );

        buttonPanel.setBackground(Color.WHITE);

        buttonPanel.add(changeButton);
        buttonPanel.add(clearButton);

        // ================= CHANGE ACTION =================

        changeButton.addActionListener(e -> {

            String current =
                    new String(
                            currentField.getPassword()
                    );

            String newPassword =
                    new String(
                            newField.getPassword()
                    );

            String confirm =
                    new String(
                            confirmField.getPassword()
                    );

            if (current.isEmpty()
                    || newPassword.isEmpty()
                    || confirm.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please fill all fields.",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE
                );

                return;
            }

            if (!newPassword.equals(confirm)) {

                JOptionPane.showMessageDialog(
                        this,
                        "New password and confirm password do not match.",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE
                );

                return;
            }

            JOptionPane.showMessageDialog(
                    this,
                    "Password changed successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );

            currentField.setText("");
            newField.setText("");
            confirmField.setText("");
        });

        // ================= CLEAR ACTION =================

        clearButton.addActionListener(e -> {

            currentField.setText("");
            newField.setText("");
            confirmField.setText("");
        });

        // ================= BOTTOM =================

        JPanel bottomPanel =
                new JPanel(new BorderLayout());

        bottomPanel.setBackground(Color.WHITE);

        bottomPanel.add(
                buttonPanel,
                BorderLayout.NORTH
        );

        // ================= FOOTER =================

        JPanel footerPanel =
                new JPanel(new GridLayout(1, 3));

        footerPanel.setPreferredSize(
                new Dimension(0, 50)
        );

        footerPanel.setBackground(blue);

        JLabel nameFooter =
                new JLabel(
                        "Developed By : Nikhil Sharma",
                        SwingConstants.CENTER
                );

        JLabel rollFooter =
                new JLabel(
                        "Roll No : 25EPTCS104",
                        SwingConstants.CENTER
                );

        JLabel branchFooter =
                new JLabel(
                        "B.Tech CSE | Session : 2026-2027",
                        SwingConstants.CENTER
                );

        nameFooter.setForeground(Color.WHITE);
        rollFooter.setForeground(Color.WHITE);
        branchFooter.setForeground(Color.WHITE);

        Font footerFont =
                new Font("Arial", Font.BOLD, 12);

        nameFooter.setFont(footerFont);
        rollFooter.setFont(footerFont);
        branchFooter.setFont(footerFont);

        footerPanel.add(nameFooter);
        footerPanel.add(rollFooter);
        footerPanel.add(branchFooter);

        bottomPanel.add(
                footerPanel,
                BorderLayout.SOUTH
        );

        mainPanel.add(
                formPanel,
                BorderLayout.CENTER
        );

        mainPanel.add(
                bottomPanel,
                BorderLayout.SOUTH
        );

        add(mainPanel);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            ChangePassword page =
                    new ChangePassword();

            page.setVisible(true);

        });
    }
}
