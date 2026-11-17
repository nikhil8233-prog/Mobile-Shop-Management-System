package mobileshop;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;

    public Login() {

        setTitle("Login - Mobile Shop Management System");

        // FULL SCREEN
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ================= MAIN PANEL =================
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        // ================= HEADER =================
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(
                new BoxLayout(headerPanel, BoxLayout.Y_AXIS)
        );
        headerPanel.setBackground(Color.WHITE);

        // PIIT LOGO
        JLabel logoLabel = new JLabel();

        ImageIcon logoIcon =
                new ImageIcon(
                        getClass().getResource("/piit.jpeg")
                );

        Image logo = logoIcon.getImage()
                .getScaledInstance(
                        300,
                        90,
                        Image.SCALE_SMOOTH
                );

        logoLabel.setIcon(new ImageIcon(logo));
        logoLabel.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        headerPanel.add(
                Box.createVerticalStrut(25)
        );

        headerPanel.add(logoLabel);

        // ================= CENTER =================
        JPanel centerPanel = new JPanel();

        centerPanel.setLayout(
                new BoxLayout(
                        centerPanel,
                        BoxLayout.Y_AXIS
                )
        );

        centerPanel.setBackground(Color.WHITE);

        // TITLE
        JLabel title = new JLabel(
                "Mobile Shop Management System"
        );

        title.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        28
                )
        );

        title.setForeground(
                new Color(25, 55, 109)
        );

        title.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        centerPanel.add(
                Box.createVerticalStrut(20)
        );

        centerPanel.add(title);

        centerPanel.add(
                Box.createVerticalStrut(35)
        );

        // ================= USERNAME =================

        JPanel usernamePanel = new JPanel(
                new FlowLayout(
                        FlowLayout.CENTER,
                        10,
                        5
                )
        );

        usernamePanel.setBackground(Color.WHITE);

        JLabel usernameLabel =
                new JLabel("Username :");

        usernameLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        17
                )
        );

        usernameField =
                new JTextField(18);

        usernameField.setPreferredSize(
                new Dimension(260, 35)
        );

        usernamePanel.add(usernameLabel);
        usernamePanel.add(usernameField);

        centerPanel.add(usernamePanel);

        // ================= PASSWORD =================

        JPanel passwordPanel = new JPanel(
                new FlowLayout(
                        FlowLayout.CENTER,
                        10,
                        5
                )
        );

        passwordPanel.setBackground(Color.WHITE);

        JLabel passwordLabel =
                new JLabel("Password :");

        passwordLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        17
                )
        );

        passwordField =
                new JPasswordField(18);

        passwordField.setPreferredSize(
                new Dimension(260, 35)
        );

        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);

        centerPanel.add(passwordPanel);

        // ================= LOGIN BUTTON =================

        centerPanel.add(
                Box.createVerticalStrut(25)
        );

        JButton loginButton =
                new JButton("LOGIN");

        loginButton.setPreferredSize(
                new Dimension(260, 45)
        );

        loginButton.setMaximumSize(
                new Dimension(260, 45)
        );

        loginButton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        16
                )
        );

        loginButton.setForeground(Color.WHITE);

        loginButton.setBackground(
                new Color(25, 55, 109)
        );

        loginButton.setFocusPainted(false);

        loginButton.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );

        centerPanel.add(loginButton);

        loginButton.addActionListener(
                e -> login()
        );

        // ================= STUDENT DETAILS =================

        centerPanel.add(
                Box.createVerticalStrut(20)
        );

        JPanel detailsPanel =
                new JPanel(
                        new GridLayout(4, 2, 10, 5)
                );

        detailsPanel.setPreferredSize(
                new Dimension(400, 100)
        );

        detailsPanel.setMaximumSize(
                new Dimension(400, 100)
        );

        detailsPanel.setBorder(
                BorderFactory.createTitledBorder(
                        "Developed By"
                )
        );

        detailsPanel.setBackground(Color.WHITE);

        detailsPanel.add(
                new JLabel("Name")
        );

        detailsPanel.add(
                new JLabel(":  Nikhil Sharma")
        );

        detailsPanel.add(
                new JLabel("Roll No.")
        );

        detailsPanel.add(
                new JLabel(":  25EPTCS104")
        );

        detailsPanel.add(
                new JLabel("Branch")
        );

        detailsPanel.add(
                new JLabel(":  B.Tech CSE")
        );

        detailsPanel.add(
                new JLabel("Session")
        );

        detailsPanel.add(
                new JLabel(":  2026-2027")
        );

        centerPanel.add(detailsPanel);

        // ================= FOOTER =================

        JPanel footerPanel =
                new JPanel(
                        new GridLayout(1, 3)
                );

        footerPanel.setPreferredSize(
                new Dimension(
                        0,
                        55
                )
        );

        footerPanel.setBackground(
                new Color(25, 55, 109)
        );

        JLabel developed =
                new JLabel(
                        "Developed By : Nikhil Sharma",
                        SwingConstants.CENTER
                );

        JLabel roll =
                new JLabel(
                        "Roll No : 25EPTCS104",
                        SwingConstants.CENTER
                );

        JLabel branch =
                new JLabel(
                        "B.Tech CSE   |   Session : 2026-2027",
                        SwingConstants.CENTER
                );

        developed.setForeground(Color.WHITE);
        roll.setForeground(Color.WHITE);
        branch.setForeground(Color.WHITE);

        developed.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        13
                )
        );

        roll.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        13
                )
        );

        branch.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        13
                )
        );

        footerPanel.add(developed);
        footerPanel.add(roll);
        footerPanel.add(branch);

        // ================= ADD PANELS =================

        mainPanel.add(
                headerPanel,
                BorderLayout.NORTH
        );

        mainPanel.add(
                centerPanel,
                BorderLayout.CENTER
        );

        mainPanel.add(
                footerPanel,
                BorderLayout.SOUTH
        );

        add(mainPanel);
    }

    // ================= LOGIN METHOD =================

    private void login() {

        String username =
                usernameField.getText();

        String password =
                new String(
                        passwordField.getPassword()
                );

        if (username.equals("admin")
                && password.equals("admin")) {

            JOptionPane.showMessageDialog(
                    this,
                    "Login Successful!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );
            Dashboard dashboard = new Dashboard();
            dashboard.setVisible(true);
            dispose();

        } else {

            JOptionPane.showMessageDialog(
                    this,
                    "Invalid Username or Password!",
                    "Login Failed",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    // ================= MAIN =================

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            Login login =
                    new Login();

            login.setVisible(true);
        });
    }
}