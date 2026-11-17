package mobileshop;

import javax.swing.*;
import java.awt.*;

public class DeleteProduct extends JFrame {

    Color blue = new Color(25, 55, 109);

    public DeleteProduct() {

        setTitle("Delete Product - Mobile Shop Management System");
        setSize(700, 600);
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
                "Delete Product",
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

        JLabel idLabel =
                new JLabel("Product ID :");

        idLabel.setFont(
                new Font("Arial", Font.BOLD, 15)
        );

        JComboBox<String> idBox =
                new JComboBox<>(
                        new String[]{
                                "Select ID",
                                "1",
                                "2",
                                "3",
                                "4",
                                "5"
                        }
                );

        JButton viewButton =
                new JButton("VIEW");

        JLabel nameLabel =
                new JLabel("Mobile Name :");

        JLabel brandLabel =
                new JLabel("Brand :");

        JLabel priceLabel =
                new JLabel("Price :");

        JLabel quantityLabel =
                new JLabel("Quantity :");

        Font labelFont =
                new Font(
                        "Arial",
                        Font.BOLD,
                        15
                );

        nameLabel.setFont(labelFont);
        brandLabel.setFont(labelFont);
        priceLabel.setFont(labelFont);
        quantityLabel.setFont(labelFont);

        JTextField nameField =
                new JTextField(20);

        JTextField brandField =
                new JTextField(20);

        JTextField priceField =
                new JTextField(20);

        JTextField quantityField =
                new JTextField(20);

        nameField.setEditable(false);
        brandField.setEditable(false);
        priceField.setEditable(false);
        quantityField.setEditable(false);

        // ================= ROW 1 =================

        gbc.gridx = 0;
        gbc.gridy = 0;

        formPanel.add(idLabel, gbc);

        gbc.gridx = 1;

        formPanel.add(idBox, gbc);

        gbc.gridx = 2;

        formPanel.add(viewButton, gbc);

        // ================= ROW 2 =================

        gbc.gridx = 0;
        gbc.gridy = 1;

        formPanel.add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;

        formPanel.add(nameField, gbc);

        gbc.gridwidth = 1;

        // ================= ROW 3 =================

        gbc.gridx = 0;
        gbc.gridy = 2;

        formPanel.add(brandLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;

        formPanel.add(brandField, gbc);

        gbc.gridwidth = 1;

        // ================= ROW 4 =================

        gbc.gridx = 0;
        gbc.gridy = 3;

        formPanel.add(priceLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;

        formPanel.add(priceField, gbc);

        gbc.gridwidth = 1;

        // ================= ROW 5 =================

        gbc.gridx = 0;
        gbc.gridy = 4;

        formPanel.add(quantityLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;

        formPanel.add(quantityField, gbc);

        gbc.gridwidth = 1;

        mainPanel.add(
                formPanel,
                BorderLayout.CENTER
        );

        // ================= BUTTONS =================

        JPanel buttonPanel =
                new JPanel(
                        new FlowLayout(
                                FlowLayout.CENTER,
                                25,
                                12
                        )
                );

        buttonPanel.setBackground(Color.WHITE);

        JButton deleteButton =
                new JButton("DELETE");

        JButton clearButton =
                new JButton("CLEAR");

        deleteButton.setPreferredSize(
                new Dimension(120, 40)
        );

        clearButton.setPreferredSize(
                new Dimension(120, 40)
        );

        deleteButton.setFont(
                new Font("Arial", Font.BOLD, 14)
        );

        clearButton.setFont(
                new Font("Arial", Font.BOLD, 14)
        );

        deleteButton.setBackground(
                new Color(200, 50, 50)
        );

        deleteButton.setForeground(Color.WHITE);

        clearButton.setBackground(
                new Color(220, 220, 220)
        );

        buttonPanel.add(deleteButton);
        buttonPanel.add(clearButton);

        // ================= VIEW ACTION =================

        viewButton.addActionListener(e -> {

            String id =
                    (String) idBox.getSelectedItem();

            if (id.equals("1")) {

                nameField.setText("Galaxy S24");
                brandField.setText("Samsung");
                priceField.setText("74999");
                quantityField.setText("10");

            } else if (id.equals("2")) {

                nameField.setText("iPhone 15");
                brandField.setText("Apple");
                priceField.setText("69999");
                quantityField.setText("8");

            } else if (id.equals("3")) {

                nameField.setText("Nord CE 4");
                brandField.setText("OnePlus");
                priceField.setText("24999");
                quantityField.setText("15");

            } else if (id.equals("4")) {

                nameField.setText("Moto G85");
                brandField.setText("Motorola");
                priceField.setText("17999");
                quantityField.setText("12");

            } else if (id.equals("5")) {

                nameField.setText("Redmi Note 14");
                brandField.setText("Xiaomi");
                priceField.setText("18999");
                quantityField.setText("20");

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Please select a Product ID."
                );
            }
        });

        // ================= DELETE ACTION =================

        deleteButton.addActionListener(e -> {

            if (idBox.getSelectedIndex() == 0) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please select a Product ID.",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE
                );

                return;
            }

            int choice =
                    JOptionPane.showConfirmDialog(
                            this,
                            "Are you sure you want to delete this product?",
                            "Confirm Delete",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.WARNING_MESSAGE
                    );

            if (choice == JOptionPane.YES_OPTION) {

                JOptionPane.showMessageDialog(
                        this,
                        "Product deleted successfully!",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE
                );

                clearFields();
            }
        });

        // ================= CLEAR ACTION =================

        clearButton.addActionListener(e -> {

            clearFields();

            idBox.setSelectedIndex(0);
        });

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
                new Font(
                        "Arial",
                        Font.BOLD,
                        12
                );

        nameFooter.setFont(footerFont);
        rollFooter.setFont(footerFont);
        branchFooter.setFont(footerFont);

        footerPanel.add(nameFooter);
        footerPanel.add(rollFooter);
        footerPanel.add(branchFooter);

        // ================= BOTTOM =================

        JPanel bottomPanel =
                new JPanel(new BorderLayout());

        bottomPanel.setBackground(Color.WHITE);

        bottomPanel.add(
                buttonPanel,
                BorderLayout.NORTH
        );

        bottomPanel.add(
                footerPanel,
                BorderLayout.SOUTH
        );

        mainPanel.add(
                bottomPanel,
                BorderLayout.SOUTH
        );

        add(mainPanel);
    }

    // ================= CLEAR FIELDS =================

    private void clearFields() {

        // This method will be connected with fields later.
    }

    // ================= MAIN =================

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            DeleteProduct page =
                    new DeleteProduct();

            page.setVisible(true);

        });
    }
}
