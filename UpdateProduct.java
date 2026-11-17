package mobileshop;

import javax.swing.*;
import java.awt.*;

public class UpdateProduct extends JFrame {

    Color blue = new Color(25, 55, 109);

    public UpdateProduct() {

        setTitle("Update Product - Mobile Shop Management System");
        setSize(700, 650);
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
                "Update Product",
                SwingConstants.CENTER
        );

        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(
                new Font("Arial", Font.BOLD, 23)
        );

        headerPanel.add(titleLabel, BorderLayout.CENTER);

        mainPanel.add(headerPanel, BorderLayout.NORTH);

        // ================= FORM =================

        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(10, 20, 10, 20);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        Font labelFont =
                new Font("Arial", Font.BOLD, 15);

        // Product ID

        JLabel idLabel =
                new JLabel("Product ID :");

        idLabel.setFont(labelFont);

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

        JButton loadButton =
                new JButton("LOAD");

        // Product Name

        JLabel nameLabel =
                new JLabel("Mobile Name :");

        nameLabel.setFont(labelFont);

        JTextField nameField =
                new JTextField(20);

        // Brand

        JLabel brandLabel =
                new JLabel("Brand :");

        brandLabel.setFont(labelFont);

        JTextField brandField =
                new JTextField(20);

        // Category

        JLabel categoryLabel =
                new JLabel("Category :");

        categoryLabel.setFont(labelFont);

        JTextField categoryField =
                new JTextField(20);

        // Price

        JLabel priceLabel =
                new JLabel("Price :");

        priceLabel.setFont(labelFont);

        JTextField priceField =
                new JTextField(20);

        // RAM

        JLabel ramLabel =
                new JLabel("RAM :");

        ramLabel.setFont(labelFont);

        JTextField ramField =
                new JTextField(20);

        // Storage

        JLabel storageLabel =
                new JLabel("Storage :");

        storageLabel.setFont(labelFont);

        JTextField storageField =
                new JTextField(20);

        // Quantity

        JLabel quantityLabel =
                new JLabel("Quantity :");

        quantityLabel.setFont(labelFont);

        JTextField quantityField =
                new JTextField(20);

        // ================= ROW 1 =================

        gbc.gridx = 0;
        gbc.gridy = 0;

        formPanel.add(idLabel, gbc);

        gbc.gridx = 1;

        formPanel.add(idBox, gbc);

        gbc.gridx = 2;

        formPanel.add(loadButton, gbc);

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

        formPanel.add(categoryLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;

        formPanel.add(categoryField, gbc);

        gbc.gridwidth = 1;

        // ================= ROW 5 =================

        gbc.gridx = 0;
        gbc.gridy = 4;

        formPanel.add(priceLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;

        formPanel.add(priceField, gbc);

        gbc.gridwidth = 1;

        // ================= ROW 6 =================

        gbc.gridx = 0;
        gbc.gridy = 5;

        formPanel.add(ramLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;

        formPanel.add(ramField, gbc);

        gbc.gridwidth = 1;

        // ================= ROW 7 =================

        gbc.gridx = 0;
        gbc.gridy = 6;

        formPanel.add(storageLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;

        formPanel.add(storageField, gbc);

        gbc.gridwidth = 1;

        // ================= ROW 8 =================

        gbc.gridx = 0;
        gbc.gridy = 7;

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
                                10
                        )
                );

        buttonPanel.setBackground(Color.WHITE);

        JButton updateButton =
                new JButton("UPDATE");

        JButton clearButton =
                new JButton("CLEAR");

        updateButton.setPreferredSize(
                new Dimension(120, 40)
        );

        clearButton.setPreferredSize(
                new Dimension(120, 40)
        );

        updateButton.setFont(
                new Font("Arial", Font.BOLD, 14)
        );

        clearButton.setFont(
                new Font("Arial", Font.BOLD, 14)
        );

        updateButton.setBackground(
                new Color(20, 150, 80)
        );

        updateButton.setForeground(Color.WHITE);

        clearButton.setBackground(
                new Color(220, 220, 220)
        );

        buttonPanel.add(updateButton);
        buttonPanel.add(clearButton);

        // ================= LOAD ACTION =================

        loadButton.addActionListener(e -> {

            String id =
                    (String) idBox.getSelectedItem();

            if (id.equals("1")) {

                nameField.setText("Galaxy S24");
                brandField.setText("Samsung");
                categoryField.setText("Smartphone");
                priceField.setText("74999");
                ramField.setText("8 GB");
                storageField.setText("256 GB");
                quantityField.setText("10");

            } else if (id.equals("2")) {

                nameField.setText("iPhone 15");
                brandField.setText("Apple");
                categoryField.setText("Smartphone");
                priceField.setText("69999");
                ramField.setText("6 GB");
                storageField.setText("128 GB");
                quantityField.setText("8");

            } else if (id.equals("3")) {

                nameField.setText("Nord CE 4");
                brandField.setText("OnePlus");
                categoryField.setText("Smartphone");
                priceField.setText("24999");
                ramField.setText("8 GB");
                storageField.setText("128 GB");
                quantityField.setText("15");

            } else if (id.equals("4")) {

                nameField.setText("Moto G85");
                brandField.setText("Motorola");
                categoryField.setText("Smartphone");
                priceField.setText("17999");
                ramField.setText("8 GB");
                storageField.setText("128 GB");
                quantityField.setText("12");

            } else if (id.equals("5")) {

                nameField.setText("Redmi Note 14");
                brandField.setText("Xiaomi");
                categoryField.setText("Smartphone");
                priceField.setText("18999");
                ramField.setText("8 GB");
                storageField.setText("256 GB");
                quantityField.setText("20");

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Please select a Product ID."
                );
            }
        });

        // ================= UPDATE ACTION =================

        updateButton.addActionListener(e -> {

            if (nameField.getText().trim().isEmpty()
                    || brandField.getText().trim().isEmpty()
                    || priceField.getText().trim().isEmpty()
                    || quantityField.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please fill all required fields.",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE
                );

                return;
            }

            JOptionPane.showMessageDialog(
                    this,
                    "Product updated successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        // ================= CLEAR ACTION =================

        clearButton.addActionListener(e -> {

            idBox.setSelectedIndex(0);

            nameField.setText("");
            brandField.setText("");
            categoryField.setText("");
            priceField.setText("");
            ramField.setText("");
            storageField.setText("");
            quantityField.setText("");
        });

        // ================= BOTTOM PANEL =================

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

    // ================= MAIN =================

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            UpdateProduct page =
                    new UpdateProduct();

            page.setVisible(true);

        });
    }
}