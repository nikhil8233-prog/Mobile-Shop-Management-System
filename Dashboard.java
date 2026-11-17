package mobileshop;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    private final Color BLUE = new Color(25, 55, 109);

    public Dashboard() {

        setTitle("Dashboard - Mobile Shop Management System");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        // ================= HEADER =================

        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(BLUE);
        headerPanel.setPreferredSize(new Dimension(0, 80));

        JLabel logoLabel = new JLabel();

        try {
            ImageIcon icon =
                    new ImageIcon(getClass().getResource("/piit.jpeg"));

            Image image = icon.getImage().getScaledInstance(
                    190, 58, Image.SCALE_SMOOTH
            );

            logoLabel.setIcon(new ImageIcon(image));

        } catch (Exception e) {
            logoLabel.setText("POORNIMA");
            logoLabel.setForeground(Color.WHITE);
            logoLabel.setFont(
                    new Font("Arial", Font.BOLD, 20)
            );
        }

        JPanel logoPanel = new JPanel(
                new FlowLayout(FlowLayout.LEFT, 15, 10)
        );

        logoPanel.setBackground(Color.WHITE);
        logoPanel.add(logoLabel);

        headerPanel.add(logoPanel, BorderLayout.WEST);

        JLabel titleLabel = new JLabel(
                "Mobile Shop Management System",
                SwingConstants.CENTER
        );

        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(
                new Font("Arial", Font.BOLD, 23)
        );

        headerPanel.add(titleLabel, BorderLayout.CENTER);

        JLabel welcomeLabel =
                new JLabel("●  Welcome, Admin");

        welcomeLabel.setForeground(Color.WHITE);
        welcomeLabel.setFont(
                new Font("Arial", Font.BOLD, 15)
        );

        JPanel welcomePanel = new JPanel(
                new FlowLayout(
                        FlowLayout.RIGHT,
                        20,
                        28
                )
        );

        welcomePanel.setBackground(BLUE);
        welcomePanel.add(welcomeLabel);

        headerPanel.add(
                welcomePanel,
                BorderLayout.EAST
        );

        // ================= BUTTON AREA =================

        JPanel buttonPanel = new JPanel(
                new GridLayout(2, 3, 25, 25)
        );

        buttonPanel.setBackground(Color.WHITE);

        buttonPanel.setBorder(
                BorderFactory.createEmptyBorder(
                        40, 60, 40, 60
                )
        );

        JButton addButton =
                createButton("Add Product", 1);

        JButton viewButton =
                createButton("View All Products", 2);

        JButton updateButton =
                createButton("Update Product", 3);

        JButton deleteButton =
                createButton("Delete Product", 4);

        JButton passwordButton =
                createButton("Change Password", 5);

        JButton logoutButton =
                createButton("Logout", 6);

        buttonPanel.add(addButton);
        buttonPanel.add(viewButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(passwordButton);
        buttonPanel.add(logoutButton);

        // ================= ADD PRODUCT =================

        addButton.addActionListener(e -> {

            AddProduct page = new AddProduct();
            page.setVisible(true);

        });

        // ================= VIEW PRODUCTS =================

        viewButton.addActionListener(e -> {

            ViewProducts page = new ViewProducts();
            page.setVisible(true);

        });

        // ================= UPDATE PRODUCT =================

        updateButton.addActionListener(e -> {

            UpdateProduct page = new UpdateProduct();
            page.setVisible(true);

        });

        // ================= DELETE PRODUCT =================

        deleteButton.addActionListener(e -> {

            DeleteProduct page = new DeleteProduct();
            page.setVisible(true);

        });

        // ================= CHANGE PASSWORD =================

        passwordButton.addActionListener(e -> {

            ChangePassword page = new ChangePassword();
            page.setVisible(true);

        });

        // ================= LOGOUT =================

        logoutButton.addActionListener(e -> {

            int choice = JOptionPane.showConfirmDialog(
                    this,
                    "Do you want to logout?",
                    "Logout",
                    JOptionPane.YES_NO_OPTION
            );

            if (choice == JOptionPane.YES_OPTION) {

                dispose();

                Login login = new Login();
                login.setVisible(true);
            }
        });

        // ================= FOOTER =================

        JPanel footerPanel =
                new JPanel(new GridLayout(1, 3));

        footerPanel.setPreferredSize(
                new Dimension(0, 55)
        );

        footerPanel.setBackground(BLUE);

        JLabel nameLabel = new JLabel(
                "Developed By : Nikhil Sharma",
                SwingConstants.CENTER
        );

        JLabel rollLabel = new JLabel(
                "Roll No : 25EPTCS104",
                SwingConstants.CENTER
        );

        JLabel branchLabel = new JLabel(
                "B.Tech CSE   |   Session : 2026-2027",
                SwingConstants.CENTER
        );

        nameLabel.setForeground(Color.WHITE);
        rollLabel.setForeground(Color.WHITE);
        branchLabel.setForeground(Color.WHITE);

        Font footerFont =
                new Font("Arial", Font.BOLD, 13);

        nameLabel.setFont(footerFont);
        rollLabel.setFont(footerFont);
        branchLabel.setFont(footerFont);

        footerPanel.add(nameLabel);
        footerPanel.add(rollLabel);
        footerPanel.add(branchLabel);

        // ================= MAIN =================

        mainPanel.add(
                headerPanel,
                BorderLayout.NORTH
        );

        mainPanel.add(
                buttonPanel,
                BorderLayout.CENTER
        );

        mainPanel.add(
                footerPanel,
                BorderLayout.SOUTH
        );

        add(mainPanel);
    }

    // =====================================================
    // BUTTON DESIGN WITH ACTUAL DRAWN ICON
    // =====================================================

    private JButton createButton(
            String text,
            int iconType
    ) {

        JButton button = new JButton();

        button.setLayout(
                new BorderLayout()
        );

        button.setBackground(Color.WHITE);

        button.setFocusPainted(false);

        button.setBorder(
                BorderFactory.createLineBorder(
                        new Color(220, 220, 220),
                        2
                )
        );

        // Icon panel
        IconPanel iconPanel =
                new IconPanel(iconType);

        button.add(
                iconPanel,
                BorderLayout.CENTER
        );

        JLabel textLabel =
                new JLabel(
                        text,
                        SwingConstants.CENTER
                );

        textLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        16
                )
        );

        textLabel.setBorder(
                BorderFactory.createEmptyBorder(
                        0, 0, 25, 0
                )
        );

        button.add(
                textLabel,
                BorderLayout.SOUTH
        );

        return button;
    }

    // =====================================================
    // DRAW ICONS
    // =====================================================

    class IconPanel extends JPanel {

        private int type;

        IconPanel(int type) {

            this.type = type;

            setBackground(Color.WHITE);

            setPreferredSize(
                    new Dimension(100, 120)
            );
        }

        @Override
        protected void paintComponent(
                Graphics g
        ) {

            super.paintComponent(g);

            Graphics2D g2 =
                    (Graphics2D) g;

            g2.setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON
            );

            g2.setColor(BLUE);

            g2.setStroke(
                    new BasicStroke(
                            5,
                            BasicStroke.CAP_ROUND,
                            BasicStroke.JOIN_ROUND
                    )
            );

            int w = getWidth();
            int h = getHeight();

            int cx = w / 2;
            int cy = h / 2 - 5;

            // ================= ADD =================

            if (type == 1) {

                g2.drawRect(
                        cx - 25,
                        cy - 30,
                        50,
                        60
                );

                g2.drawLine(
                        cx - 10,
                        cy,
                        cx + 10,
                        cy
                );

                g2.drawLine(
                        cx,
                        cy - 10,
                        cx,
                        cy + 10
                );
            }

            // ================= VIEW =================

            else if (type == 2) {

                g2.drawRect(
                        cx - 32,
                        cy - 25,
                        64,
                        50
                );

                g2.drawLine(
                        cx - 20,
                        cy - 10,
                        cx + 20,
                        cy - 10
                );

                g2.drawLine(
                        cx - 20,
                        cy,
                        cx + 20,
                        cy
                );

                g2.drawLine(
                        cx - 20,
                        cy + 10,
                        cx + 10,
                        cy + 10
                );
            }

            // ================= UPDATE =================

            else if (type == 3) {

                g2.drawLine(
                        cx - 25,
                        cy + 25,
                        cx + 25,
                        cy - 25
                );

                g2.drawRect(
                        cx - 30,
                        cy - 30,
                        12,
                        12
                );

                g2.drawLine(
                        cx + 15,
                        cy - 35,
                        cx + 30,
                        cy - 20
                );
            }

            // ================= DELETE =================

            else if (type == 4) {

                g2.drawRect(
                        cx - 22,
                        cy - 20,
                        44,
                        50
                );

                g2.drawLine(
                        cx - 30,
                        cy - 28,
                        cx + 30,
                        cy - 28
                );

                g2.drawLine(
                        cx - 12,
                        cy - 38,
                        cx + 12,
                        cy - 38
                );

                g2.drawLine(
                        cx - 10,
                        cy - 10,
                        cx - 10,
                        cy + 20
                );

                g2.drawLine(
                        cx,
                        cy - 10,
                        cx,
                        cy + 20
                );

                g2.drawLine(
                        cx + 10,
                        cy - 10,
                        cx + 10,
                        cy + 20
                );
            }

            // ================= PASSWORD =================

            else if (type == 5) {

                g2.drawOval(
                        cx - 30,
                        cy - 5,
                        35,
                        35
                );

                g2.drawLine(
                        cx,
                        cy + 12,
                        cx + 35,
                        cy - 23
                );

                g2.drawLine(
                        cx + 20,
                        cy - 8,
                        cx + 32,
                        cy + 4
                );

                g2.drawLine(
                        cx + 28,
                        cy - 16,
                        cx + 38,
                        cy - 6
                );
            }

            // ================= LOGOUT =================

            else if (type == 6) {

                g2.drawLine(
                        cx - 25,
                        cy - 30,
                        cx - 25,
                        cy + 30
                );

                g2.drawLine(
                        cx - 25,
                        cy - 30,
                        cx,
                        cy - 30
                );

                g2.drawLine(
                        cx - 25,
                        cy + 30,
                        cx,
                        cy + 30
                );

                g2.drawLine(
                        cx - 5,
                        cy,
                        cx + 30,
                        cy
                );

                g2.drawLine(
                        cx + 30,
                        cy,
                        cx + 15,
                        cy - 15
                );

                g2.drawLine(
                        cx + 30,
                        cy,
                        cx + 15,
                        cy + 15
                );
            }
        }
    }

    // ================= MAIN =================

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            Dashboard dashboard =
                    new Dashboard();

            dashboard.setVisible(true);

        });
    }
}