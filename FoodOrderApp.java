import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FoodTestUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FoodOrderApp app = new FoodOrderApp();
            JScrollPane scrollPane = new JScrollPane(app.getContentPane());
            scrollPane.getVerticalScrollBar().setUnitIncrement(16);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            app.setContentPane(scrollPane);
            app.setVisible(true);
        });
    }
}

class FoodOrderApp extends JFrame implements ActionListener {
    private JComboBox<String> foodNameDropdown, temperatureDropdown;
    private JTextField quantityField, priceField, weightField, caloriesField;
    private JTextField sweetnessLevelField;
    private JComboBox<String> dessertNameDropdown, flavorDropdown, toppingsDropdown;
    private JComboBox<String> beverageNameDropdown, sizeDropdown, packagingDropdown;
    private JCheckBox alcoholicCheckBox;
    private JTextArea displayArea;
    private JButton orderMainCourseButton, orderDessertButton, orderBeverageButton;

    // FoodData instance to access food, dessert, and beverage data
    private final FoodData foodData;

    public FoodOrderApp() {
        foodData = new FoodData(); // Initialize FoodData instance

        setTitle("Food Order Application");
        setSize(405, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel(new GridLayout(3, 1));
        displayArea = new JTextArea(10, 40);
        displayArea.setBorder(BorderFactory.createTitledBorder("Order Details"));
        displayArea.setEditable(false);

        JPanel mainCoursePanel = createMainCoursePanel();
        JPanel dessertPanel = createDessertPanel();
        JPanel beveragePanel = createBeveragePanel();

        mainPanel.add(mainCoursePanel);
        mainPanel.add(dessertPanel);
        mainPanel.add(beveragePanel);

        add(mainPanel, BorderLayout.CENTER);
        add(displayArea, BorderLayout.SOUTH);

        foodNameDropdown.addActionListener(this);
        quantityField.addActionListener(this);

        setVisible(true);
    }

    //Main Course Panel
    private JPanel createMainCoursePanel() {
        JPanel panel = new JPanel(new GridLayout(8, 2));
        panel.setBorder(BorderFactory.createTitledBorder("Main Course"));

        foodNameDropdown = new JComboBox<>(foodData.getFoodPrices().keySet().toArray(new String[0]));
        foodNameDropdown.addActionListener(this);
        panel.add(new JLabel("Food Name:"));
        panel.add(foodNameDropdown);

        quantityField = new JTextField("1");
        quantityField.addActionListener(this);
        quantityField.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                updateMainCourseDetails();
            }
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                updateMainCourseDetails();
            }
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                updateMainCourseDetails();
            }
        });
        panel.add(new JLabel("Quantity:"));
        panel.add(quantityField);

        priceField = new JTextField();
        priceField.setEditable(false);
        panel.add(new JLabel("Price:"));
        panel.add(priceField);

        temperatureDropdown = new JComboBox<>(new String[]{"Please Select","Hot", "Mild", "Cold"});
        panel.add(new JLabel("Temperature:"));
        panel.add(temperatureDropdown);

        weightField = new JTextField();
        weightField.setEditable(false);
        panel.add(new JLabel("Weight:"));
        panel.add(weightField);

        caloriesField = new JTextField();
        caloriesField.setEditable(false);
        panel.add(new JLabel("Calories:"));
        panel.add(caloriesField);

        orderMainCourseButton = new JButton("Order Main Course");
        orderMainCourseButton.addActionListener(this);
        panel.add(orderMainCourseButton);

        return panel;
    }


    //Dessert Panel
    private JPanel createDessertPanel() {
        JPanel panel = new JPanel(new GridLayout(7, 2));
        panel.setBorder(BorderFactory.createTitledBorder("Dessert"));

        dessertNameDropdown = new JComboBox<>(foodData.getDessertPrices().keySet().toArray(new String[0]));
        panel.add(new JLabel("Dessert Name:"));
        panel.add(dessertNameDropdown);

        sweetnessLevelField = new JTextField();
        panel.add(new JLabel("Sweetness Level (1-10):"));
        panel.add(sweetnessLevelField);

        flavorDropdown = new JComboBox<>(new String[]{"-", "Vanilla", "Chocolate", "Strawberry"});
        panel.add(new JLabel("Flavor:"));
        panel.add(flavorDropdown);

        toppingsDropdown = new JComboBox<>(new String[]{"-", "Sprinkles", "Nuts", "Fruits"});
        panel.add(new JLabel("Toppings:"));
        panel.add(toppingsDropdown);

        JTextField dessertPriceField = new JTextField();
        dessertPriceField.setEditable(false);
        panel.add(new JLabel("Price:"));
        panel.add(dessertPriceField);

        JTextField dessertCaloriesField = new JTextField();
        dessertCaloriesField.setEditable(false);
        panel.add(new JLabel("Calories:"));
        panel.add(dessertCaloriesField);

        dessertNameDropdown.addActionListener(e -> {
            String dessertName = (String) dessertNameDropdown.getSelectedItem();
            Double price = foodData.getDessertPrices().get(dessertName);
            Double calories = foodData.getDessertCalories().get(dessertName);

            if (price != null) {
                dessertPriceField.setText(String.format("%.2f", price));
            } else {
                dessertPriceField.setText("");
            }

            if (calories != null) {
                dessertCaloriesField.setText(String.format("%.2f", calories));
            } else {
                dessertCaloriesField.setText("");
            }
        });

        orderDessertButton = new JButton("Order Dessert");
        orderDessertButton.addActionListener(this);
        panel.add(orderDessertButton);

        return panel;
    }

    //Beverage Panel
    private JPanel createBeveragePanel() {
        JPanel panel = new JPanel(new GridLayout(7, 2));
        panel.setBorder(BorderFactory.createTitledBorder("Beverage"));

        beverageNameDropdown = new JComboBox<>(foodData.getBeveragePrices().keySet().toArray(new String[0]));
        panel.add(new JLabel("Beverage Name:"));
        panel.add(beverageNameDropdown);

        sizeDropdown = new JComboBox<>(new String[]{"Please Select", "Small", "Medium", "Large"});
        panel.add(new JLabel("Size:"));
        panel.add(sizeDropdown);

        alcoholicCheckBox = new JCheckBox();
        panel.add(new JLabel("Alcoholic:"));
        panel.add(alcoholicCheckBox);

        packagingDropdown = new JComboBox<>(new String[]{"Please Select", "Bottle", "Can", "Glass"});
        panel.add(new JLabel("Packaging Type:"));
        panel.add(packagingDropdown);

        JTextField beveragePriceField = new JTextField();
        beveragePriceField.setEditable(false);
        panel.add(new JLabel("Price:"));
        panel.add(beveragePriceField);

        JTextField beverageCaloriesField = new JTextField();
        beverageCaloriesField.setEditable(false);
        panel.add(new JLabel("Calories:"));
        panel.add(beverageCaloriesField);

        beverageNameDropdown.addActionListener(e -> {
            String beverageName = (String) beverageNameDropdown.getSelectedItem();
            Double price = foodData.getBeveragePrices().get(beverageName);
            Double calories = foodData.getBeverageCalories().get(beverageName);

            if (price != null) {
            beveragePriceField.setText(String.format("%.2f", price));
            } else {
            beveragePriceField.setText("");
            }

            if (calories != null) {
            beverageCaloriesField.setText(String.format("%.2f", calories));
            } else {
            beverageCaloriesField.setText("");
            }
        });

        orderBeverageButton = new JButton("Order Beverage");
        orderBeverageButton.addActionListener(this);
        panel.add(orderBeverageButton);

        return panel;
    }

    private void updateMainCourseDetails() {
        String foodName = (String) foodNameDropdown.getSelectedItem();
        int quantity = Integer.parseInt(quantityField.getText());

        Double pricePerUnit = foodData.getFoodPrices().get(foodName);
        Double weightPerUnit = foodData.getFoodWeights().get(foodName);
        Double caloriesPerUnit = foodData.getFoodCalories().get(foodName);

        if (pricePerUnit != null && weightPerUnit != null && caloriesPerUnit != null) {
            double totalPrice = pricePerUnit * quantity;
            double totalWeight = weightPerUnit * quantity;
            double totalCalories = caloriesPerUnit * quantity;

            priceField.setText(String.format("%.2f", totalPrice));
            weightField.setText(String.format("%.2f", totalWeight));
            caloriesField.setText(String.format("%.2f", totalCalories));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == foodNameDropdown || e.getSource() == quantityField) {
            updateMainCourseDetails();
        } else if (e.getSource() == orderMainCourseButton) {
            displayMainCourseOrder();
        } else if (e.getSource() == orderDessertButton) {
            displayDessertOrder();
        } else if (e.getSource() == orderBeverageButton) {
            displayBeverageOrder();
        }
    }

    private void displayMainCourseOrder() {
        String foodName = (String) foodNameDropdown.getSelectedItem();
        int quantity = Integer.parseInt(quantityField.getText());
        String temperature = (String) temperatureDropdown.getSelectedItem();

        displayArea.append("Main Course Ordered:\n");
        displayArea.append("Name: " + foodName + "\n");
        displayArea.append("Quantity: " + quantity + "\n");
        displayArea.append("Total Price: " + priceField.getText() + "\n");
        displayArea.append("Temperature: " + temperature + "\n");
        displayArea.append("Weight: " + weightField.getText() + " grams\n");
        displayArea.append("Calories: " + caloriesField.getText() + " kcal\n\n");
    }

    private void displayDessertOrder() {
        String dessertName = (String) dessertNameDropdown.getSelectedItem();
        int sweetnessLevel = Integer.parseInt(sweetnessLevelField.getText());
        String flavor = (String) flavorDropdown.getSelectedItem();
        String toppings = (String) toppingsDropdown.getSelectedItem();

        displayArea.append("Dessert Ordered:\n");
        displayArea.append("Dessert Name: " + dessertName + "\n");
        displayArea.append("Sweetness Level: " + sweetnessLevel + "\n");
        displayArea.append("Flavor: " + flavor + "\n");
        displayArea.append("Toppings: " + toppings + "\n\n");
    }

    private void displayBeverageOrder() {
        String beverageName = (String) beverageNameDropdown.getSelectedItem();
        String size = (String) sizeDropdown.getSelectedItem();
        boolean isAlcoholic = alcoholicCheckBox.isSelected();
        String packagingType = (String) packagingDropdown.getSelectedItem();

        displayArea.append("Beverage Ordered:\n");
        displayArea.append("Beverage Name: " + beverageName + "\n");
        displayArea.append("Size: " + size + "\n");
        displayArea.append("Alcoholic: " + (isAlcoholic ? "Yes" : "No") + "\n");
        displayArea.append("Packaging: " + packagingType + "\n\n");
    updateTotalBill();
    }

    private void updateTotalBill() {
        double totalBill = 0.0;
    
        // Calculate total bill for main course
        for (String foodName : foodData.getFoodPrices().keySet()) {
            int quantity = Integer.parseInt(quantityField.getText());
            Double pricePerUnit = foodData.getFoodPrices().get(foodName);
            if (pricePerUnit != null) {
                totalBill += pricePerUnit * quantity;
            }
        }
    
        // Calculate total bill for desserts
        for (String dessertName : foodData.getDessertPrices().keySet()) {
            Double price = foodData.getDessertPrices().get(dessertName);
            if (price != null) {
                totalBill += price;
            }
        }
    
        // Calculate total bill for beverages
        for (String beverageName : foodData.getBeveragePrices().keySet()) {
            Double price = foodData.getBeveragePrices().get(beverageName);
            if (price != null) {
                totalBill += price;
            }
        }
    
        //displayArea.append("Total Bill: " + String.format("%.2f", totalBill) + "\n\n");
    }
}

