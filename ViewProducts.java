package mobileshop;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewProducts extends JFrame {

    Color blue = new Color(25, 55, 109);

    public ViewProducts() {

        setTitle("View Products - Mobile Shop Management System");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);

        // ================= HEADER =================

        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(blue);
        headerPanel.setPreferredSize(new Dimension(0, 80));

        JLabel logoLabel = new JLabel();

        try {
            ImageIcon icon = new ImageIcon(
                    getClass().getResource("/piit.jpeg")
            );

            Image image = icon.getImage().getScaledInstance(
                    180, 55, Image.SCALE_SMOOTH
            );

            logoLabel.setIcon(new ImageIcon(image));

        } catch (Exception e) {
            logoLabel.setText("POORNIMA");
            logoLabel.setForeground(Color.WHITE);
            logoLabel.setFont(new Font("Arial", Font.BOLD, 20));
        }

        JPanel logoPanel = new JPanel(
                new FlowLayout(FlowLayout.LEFT, 15, 12)
        );

        logoPanel.setBackground(Color.WHITE);
        logoPanel.add(logoLabel);

        headerPanel.add(logoPanel, BorderLayout.WEST);

        JLabel titleLabel = new JLabel(
                "View All Products",
                SwingConstants.CENTER
        );

        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(
                new Font("Arial", Font.BOLD, 24)
        );

        headerPanel.add(titleLabel, BorderLayout.CENTER);

        mainPanel.add(
                headerPanel,
                BorderLayout.NORTH
        );

        // ================= SEARCH AREA =================

        JPanel searchPanel = new JPanel(
                new FlowLayout(
                        FlowLayout.RIGHT,
                        20,
                        15
                )
        );

        searchPanel.setBackground(Color.WHITE);

        JLabel searchLabel = new JLabel("Search:");

        searchLabel.setFont(
                new Font("Arial", Font.BOLD, 15)
        );

        JTextField searchField =
                new JTextField(20);

        searchField.setPreferredSize(
                new Dimension(230, 32)
        );

        JButton searchButton =
                new JButton("SEARCH");

        JButton refreshButton =
                new JButton("REFRESH");

        searchButton.setBackground(blue);
        searchButton.setForeground(Color.WHITE);

        refreshButton.setBackground(
                new Color(230, 230, 230)
        );

        searchPanel.add(searchLabel);
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        searchPanel.add(refreshButton);

        // ================= TABLE =================

        String[] columns = {
                "ID",
                "Mobile Name",
                "Brand",
                "Category",
                "Price",
                "RAM",
                "Storage",
                "Quantity"
        };

        DefaultTableModel model =
                new DefaultTableModel(
                        columns,
                        0
                );

        // Demo data
        model.addRow(new Object[]{
                "1",
                "Galaxy S24",
                "Samsung",
                "Smartphone",
                "₹74,999",
                "8 GB",
                "256 GB",
                "10"
        });

        model.addRow(new Object[]{
                "2",
                "iPhone 15",
                "Apple",
                "Smartphone",
                "₹69,999",
                "6 GB",
                "128 GB",
                "8"
        });

        model.addRow(new Object[]{
                "3",
                "Nord CE 4",
                "OnePlus",
                "Smartphone",
                "₹24,999",
                "8 GB",
                "128 GB",
                "15"
        });

        model.addRow(new Object[]{
                "4",
                "Moto G85",
                "Motorola",
                "Smartphone",
                "₹17,999",
                "8 GB",
                "128 GB",
                "12"
        });

        JTable table =
                new JTable(model);

        table.setRowHeight(35);

        table.setFont(
                new Font("Arial", Font.PLAIN, 14)
        );

        table.getTableHeader().setFont(
                new Font("Arial", Font.BOLD, 14)
        );

        table.getTableHeader().setBackground(blue);
        table.getTableHeader().setForeground(Color.WHITE);

        table.setSelectionMode(
                ListSelectionModel.SINGLE_SELECTION
        );

        JScrollPane scrollPane =
                new JScrollPane(table);

        scrollPane.setBorder(
                BorderFactory.createEmptyBorder(
                        5, 30, 15, 30
                )
        );

        // ================= CENTER =================

        JPanel centerPanel =
                new JPanel(new BorderLayout());

        centerPanel.setBackground(Color.WHITE);

        centerPanel.add(
                searchPanel,
                BorderLayout.NORTH
        );

        centerPanel.add(
                scrollPane,
                BorderLayout.CENTER
        );

        mainPanel.add(
                centerPanel,
                BorderLayout.CENTER
        );

        // ================= SEARCH ACTION =================

        searchButton.addActionListener(e -> {

            String search =
                    searchField.getText()
                            .trim()
                            .toLowerCase();

            if (search.isEmpty()) {
                return;
            }

            for (int i = 0; i < table.getRowCount(); i++) {

                String mobile =
                        table.getValueAt(i, 1)
                                .toString()
                                .toLowerCase();

                String brand =
                        table.getValueAt(i, 2)
                                .toString()
                                .toLowerCase();

                if (mobile.contains(search)
                        || brand.contains(search)) {

                    table.setRowSelectionInterval(i, i);

                    table.scrollRectToVisible(
                            table.getCellRect(i, 0, true)
                    );

                    return;
                }
            }

            JOptionPane.showMessageDialog(
                    this,
                    "Product not found.",
                    "Search",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        // ================= REFRESH =================

        refreshButton.addActionListener(e -> {

            searchField.setText("");

            table.clearSelection();
        });

        // ================= FOOTER =================

        JPanel footerPanel =
                new JPanel(new GridLayout(1, 3));

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

        mainPanel.add(
                footerPanel,
                BorderLayout.SOUTH
        );

        add(mainPanel);
    }

    // ================= MAIN =================

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            ViewProducts page =
                    new ViewProducts();

            page.setVisible(true);

        });
    }
}