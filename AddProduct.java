package mobileshop;

import javax.swing.*;
import java.awt.*;

public class AddProduct extends JFrame {

    Color blue = new Color(25, 55, 109);

    public AddProduct() {

        setTitle("Add Product - Mobile Shop Management System");
        setSize(700, 650);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // ================= MAIN PANEL =================

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        // ================= HEADER =================

        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(blue);
        headerPanel.setPreferredSize(new Dimension(0, 75));

        // ================= LOGO =================

        JLabel logoLabel = new JLabel();

        try {

            ImageIcon icon = new ImageIcon(
                    getClass().getResource("/piit.jpeg")
            );

            Image image = icon.getImage().getScaledInstance(
                    170,
                    52,
                    Image.SCALE_SMOOTH
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
                new FlowLayout(
                        FlowLayout.LEFT,
                        15,
                        11
                )
        );

        logoPanel.setBackground(Color.WHITE);
        logoPanel.add(logoLabel);

        headerPanel.add(
                logoPanel,
                BorderLayout.WEST
        );

        // ================= TITLE =================

        JLabel titleLabel = new JLabel(
                "Add Product",
                SwingConstants.CENTER
        );

        titleLabel.setForeground(Color.WHITE);

        titleLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        22
                )
        );

        headerPanel.add(
                titleLabel,
                BorderLayout.CENTER
        );

        mainPanel.add(
                headerPanel,
                BorderLayout.NORTH
        );

        // ================= FORM =================

        JPanel formPanel = new JPanel(
                new GridBagLayout()
        );

        formPanel.setBackground(Color.WHITE);

        GridBagConstraints gbc =
                new GridBagConstraints();

        gbc.insets =
                new Insets(10, 20, 10, 20);

        gbc.fill =
                GridBagConstraints.HORIZONTAL;

        // ================= LABELS =================

        JLabel mobileLabel =
                new JLabel("Mobile Name :");

        JLabel brandLabel =
                new JLabel("Brand :");

        JLabel categoryLabel =
                new JLabel("Category :");

        JLabel priceLabel =
                new JLabel("Price :");

        JLabel ramLabel =
                new JLabel("RAM :");

        JLabel storageLabel =
                new JLabel("Storage :");

        JLabel quantityLabel =
                new JLabel("Quantity :");

        Font labelFont =
                new Font(
                        "Arial",
                        Font.BOLD,
                        15
                );

        mobileLabel.setFont(labelFont);
        brandLabel.setFont(labelFont);
        categoryLabel.setFont(labelFont);
        priceLabel.setFont(labelFont);
        ramLabel.setFont(labelFont);
        storageLabel.setFont(labelFont);
        quantityLabel.setFont(labelFont);

        // ================= TEXT FIELDS =================

        JTextField mobileField =
                new JTextField(20);

        JTextField brandField =
                new JTextField(20);

        JTextField priceField =
                new JTextField(20);

        JTextField quantityField =
                new JTextField(20);

        Dimension fieldSize =
                new Dimension(280, 34);

        mobileField.setPreferredSize(fieldSize);
        brandField.setPreferredSize(fieldSize);
        priceField.setPreferredSize(fieldSize);
        quantityField.setPreferredSize(fieldSize);

        // ================= CATEGORY =================

        String[] categories = {
                "Select Category",
                "Smartphone",
                "Feature Phone",
                "Tablet",
                "Accessories"
        };

        JComboBox<String> categoryBox =
                new JComboBox<>(categories);

        categoryBox.setPreferredSize(fieldSize);

        // ================= RAM =================

        String[] ramOptions = {
                "Select RAM",
                "2 GB",
                "3 GB",
                "4 GB",
                "6 GB",
                "8 GB",
                "12 GB",
                "16 GB"
        };

        JComboBox<String> ramBox =
                new JComboBox<>(ramOptions);

        ramBox.setPreferredSize(fieldSize);

        // ================= STORAGE =================

        String[] storageOptions = {
                "Select Storage",
                "32 GB",
                "64 GB",
                "128 GB",
                "256 GB",
                "512 GB",
                "1 TB"
        };

        JComboBox<String> storageBox =
                new JComboBox<>(storageOptions);

        storageBox.setPreferredSize(fieldSize);

        // ================= ROW 1 =================

        gbc.gridx = 0;
        gbc.gridy = 0;

        formPanel.add(
                mobileLabel,
                gbc
        );

        gbc.gridx = 1;

        formPanel.add(
                mobileField,
                gbc
        );

        // ================= ROW 2 =================

        gbc.gridx = 0;
        gbc.gridy = 1;

        formPanel.add(
                brandLabel,
                gbc
        );

        gbc.gridx = 1;

        formPanel.add(
                brandField,
                gbc
        );

        // ================= ROW 3 =================

        gbc.gridx = 0;
        gbc.gridy = 2;

        formPanel.add(
                categoryLabel,
                gbc
        );

        gbc.gridx = 1;

        formPanel.add(
                categoryBox,
                gbc
        );

        // ================= ROW 4 =================

        gbc.gridx = 0;
        gbc.gridy = 3;

        formPanel.add(
                priceLabel,
                gbc
        );

        gbc.gridx = 1;

        formPanel.add(
                priceField,
                gbc
        );

        // ================= ROW 5 =================

        gbc.gridx = 0;
        gbc.gridy = 4;

        formPanel.add(
                ramLabel,
                gbc
        );

        gbc.gridx = 1;

        formPanel.add(
                ramBox,
                gbc
        );

        // ================= ROW 6 =================

        gbc.gridx = 0;
        gbc.gridy = 5;

        formPanel.add(
                storageLabel,
                gbc
        );

        gbc.gridx = 1;

        formPanel.add(
                storageBox,
                gbc
        );

        // ================= ROW 7 =================

        gbc.gridx = 0;
        gbc.gridy = 6;

        formPanel.add(
                quantityLabel,
                gbc
        );

        gbc.gridx = 1;

        formPanel.add(
                quantityField,
                gbc
        );

        mainPanel.add(
                formPanel,
                BorderLayout.CENTER
        );

        // ==================================================
        // BOTTOM AREA
        // ==================================================

        JPanel bottomPanel =
                new JPanel(
                        new BorderLayout()
                );

        bottomPanel.setBackground(Color.WHITE);

        // ================= SAVE + CLEAR =================

        JPanel buttonPanel =
                new JPanel(
                        new FlowLayout(
                                FlowLayout.CENTER,
                                25,
                                12
                        )
                );

        buttonPanel.setBackground(Color.WHITE);

        JButton saveButton =
                new JButton("SAVE");

        JButton clearButton =
                new JButton("CLEAR");

        saveButton.setPreferredSize(
                new Dimension(120, 40)
        );

        clearButton.setPreferredSize(
                new Dimension(120, 40)
        );

        saveButton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        clearButton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        saveButton.setBackground(
                new Color(20, 150, 80)
        );

        saveButton.setForeground(Color.WHITE);

        clearButton.setBackground(
                new Color(220, 220, 220)
        );

        buttonPanel.add(saveButton);
        buttonPanel.add(clearButton);

        bottomPanel.add(
                buttonPanel,
                BorderLayout.NORTH
        );

        // ================= SAVE ACTION =================

        saveButton.addActionListener(e -> {

            if (mobileField.getText().trim().isEmpty()
                    || brandField.getText().trim().isEmpty()
                    || priceField.getText().trim().isEmpty()
                    || quantityField.getText().trim().isEmpty()
                    || categoryBox.getSelectedIndex() == 0
                    || ramBox.getSelectedIndex() == 0
                    || storageBox.getSelectedIndex() == 0) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please fill all fields.",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE
                );

                return;
            }

            JOptionPane.showMessageDialog(
                    this,
                    "Product added successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        // ================= CLEAR ACTION =================

        clearButton.addActionListener(e -> {

            mobileField.setText("");
            brandField.setText("");
            priceField.setText("");
            quantityField.setText("");

            categoryBox.setSelectedIndex(0);
            ramBox.setSelectedIndex(0);
            storageBox.setSelectedIndex(0);
        });

        // ================= FOOTER =================

        JPanel footerPanel =
                new JPanel(
                        new GridLayout(
                                1,
                                3
                        )
                );

        footerPanel.setPreferredSize(
                new Dimension(0, 50)
        );

        footerPanel.setBackground(blue);

        JLabel nameLabel =
                new JLabel(
                        "Developed By : Nikhil Sharma",
                        SwingConstants.CENTER
                );

        JLabel rollLabel =
                new JLabel(
                        "Roll No : 25EPTCS104",
                        SwingConstants.CENTER
                );

        JLabel branchLabel =
                new JLabel(
                        "B.Tech CSE | Session : 2026-2027",
                        SwingConstants.CENTER
                );

        nameLabel.setForeground(Color.WHITE);
        rollLabel.setForeground(Color.WHITE);
        branchLabel.setForeground(Color.WHITE);

        Font footerFont =
                new Font(
                        "Arial",
                        Font.BOLD,
                        12
                );

        nameLabel.setFont(footerFont);
        rollLabel.setFont(footerFont);
        branchLabel.setFont(footerFont);

        footerPanel.add(nameLabel);
        footerPanel.add(rollLabel);
        footerPanel.add(branchLabel);

        // Footer ko bottom mein add karo
        bottomPanel.add(
                footerPanel,
                BorderLayout.SOUTH
        );

        mainPanel.add(
                bottomPanel,
                BorderLayout.SOUTH
        );

        // ================= ADD MAIN PANEL =================

        add(mainPanel);
    }

    // ================= MAIN =================

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            AddProduct page =
                    new AddProduct();

            page.setVisible(true);

        });
    }
}