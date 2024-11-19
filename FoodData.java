import java.util.HashMap;
import java.util.Map;

public class FoodData {
    private Map<String, Double> foodPrices = new HashMap<>();
    private Map<String, Double> foodWeights = new HashMap<>();
    private Map<String, Double> foodCalories = new HashMap<>();
    private Map<String, Double> dessertPrices = new HashMap<>();
    private Map<String, Double> dessertWeights = new HashMap<>();
    private Map<String, Double> dessertCalories = new HashMap<>();
    private Map<String, Double> beveragePrices = new HashMap<>();
    private Map<String, Double> beverageWeights = new HashMap<>();
    private Map<String, Double> beverageCalories = new HashMap<>();

    public FoodData() {
        initializeFoodData();
    }

    private void initializeFoodData() {
        // Main Course: Prices (INR), Weights (grams), and Calories (kcal)
        foodPrices.put("Please Select", 0.0);
        foodWeights.put("Please Select", 0.0);
        foodCalories.put("Please Select", 0.0);

        foodPrices.put("Paneer Butter Masala", 200.0);
        foodWeights.put("Paneer Butter Masala", 250.0);
        foodCalories.put("Paneer Butter Masala", 450.0);

        foodPrices.put("Chicken Biryani", 300.0);
        foodWeights.put("Chicken Biryani", 350.0);
        foodCalories.put("Chicken Biryani", 600.0);

        foodPrices.put("Vegetable Pulao", 150.0);
        foodWeights.put("Vegetable Pulao", 300.0);
        foodCalories.put("Vegetable Pulao", 350.0);

        foodPrices.put("Fish Curry", 250.0);
        foodWeights.put("Fish Curry", 300.0);
        foodCalories.put("Fish Curry", 400.0);

        foodPrices.put("Dal Makhani", 180.0);
        foodWeights.put("Dal Makhani", 250.0);
        foodCalories.put("Dal Makhani", 330.0);

        foodPrices.put("Mutton Rogan Josh", 400.0);
        foodWeights.put("Mutton Rogan Josh", 350.0);
        foodCalories.put("Mutton Rogan Josh", 700.0);

        foodPrices.put("Aloo Gobi", 120.0);
        foodWeights.put("Aloo Gobi", 250.0);
        foodCalories.put("Aloo Gobi", 200.0);

        foodPrices.put("Egg Curry", 150.0);
        foodWeights.put("Egg Curry", 300.0);
        foodCalories.put("Egg Curry", 300.0);

        foodPrices.put("Mixed Vegetable Curry", 160.0);
        foodWeights.put("Mixed Vegetable Curry", 300.0);
        foodCalories.put("Mixed Vegetable Curry", 250.0);

        foodPrices.put("Butter Chicken", 320.0);
        foodWeights.put("Butter Chicken", 350.0);
        foodCalories.put("Butter Chicken", 590.0);

        foodPrices.put("Chole Masala", 150.0);
        foodWeights.put("Chole Masala", 300.0);
        foodCalories.put("Chole Masala", 350.0);

        foodPrices.put("Lamb Korma", 380.0);
        foodWeights.put("Lamb Korma", 350.0);
        foodCalories.put("Lamb Korma", 650.0);

        foodPrices.put("Kadai Paneer", 220.0);
        foodWeights.put("Kadai Paneer", 250.0);
        foodCalories.put("Kadai Paneer", 430.0);

        foodPrices.put("Prawns Masala", 320.0);
        foodWeights.put("Prawns Masala", 300.0);
        foodCalories.put("Prawns Masala", 500.0);

        foodPrices.put("Malai Kofta", 200.0);
        foodWeights.put("Malai Kofta", 250.0);
        foodCalories.put("Malai Kofta", 520.0);

        foodPrices.put("Palak Paneer", 190.0);
        foodWeights.put("Palak Paneer", 250.0);
        foodCalories.put("Palak Paneer", 300.0);

        foodPrices.put("Chicken Tikka Masala", 280.0);
        foodWeights.put("Chicken Tikka Masala", 300.0);
        foodCalories.put("Chicken Tikka Masala", 550.0);

        foodPrices.put("Mushroom Masala", 180.0);
        foodWeights.put("Mushroom Masala", 250.0);
        foodCalories.put("Mushroom Masala", 250.0);

        foodPrices.put("Paneer Tikka", 240.0);
        foodWeights.put("Paneer Tikka", 300.0);
        foodCalories.put("Paneer Tikka", 400.0);

        foodPrices.put("Bhindi Masala", 140.0);
        foodWeights.put("Bhindi Masala", 250.0);
        foodCalories.put("Bhindi Masala", 200.0);

        // Beverages: Prices (INR), Weights (ml), and Calories (kcal)
        beveragePrices.put("Please Select", 0.0);
        beverageWeights.put("Please Select", 0.0);
        beverageCalories.put("Please Select", 0.0);

        beveragePrices.put("Masala Chai", 30.0);
        beverageWeights.put("Masala Chai", 200.0);
        beverageCalories.put("Masala Chai", 100.0);

        beveragePrices.put("Lassi", 60.0);
        beverageWeights.put("Lassi", 300.0);
        beverageCalories.put("Lassi", 180.0);

        beveragePrices.put("Fresh Lime Soda", 50.0);
        beverageWeights.put("Fresh Lime Soda", 250.0);
        beverageCalories.put("Fresh Lime Soda", 90.0);

        beveragePrices.put("Mango Lassi", 70.0);
        beverageWeights.put("Mango Lassi", 300.0);
        beverageCalories.put("Mango Lassi", 220.0);

        beveragePrices.put("Sweet Lassi", 60.0);
        beverageWeights.put("Sweet Lassi", 300.0);
        beverageCalories.put("Sweet Lassi", 200.0);

        beveragePrices.put("Filter Coffee", 40.0);
        beverageWeights.put("Filter Coffee", 200.0);
        beverageCalories.put("Filter Coffee", 60.0);

        beveragePrices.put("Cold Coffee", 70.0);
        beverageWeights.put("Cold Coffee", 250.0);
        beverageCalories.put("Cold Coffee", 150.0);

        beveragePrices.put("Coconut Water", 30.0);
        beverageWeights.put("Coconut Water", 300.0);
        beverageCalories.put("Coconut Water", 60.0);

        beveragePrices.put("Jaljeera", 40.0);
        beverageWeights.put("Jaljeera", 250.0);
        beverageCalories.put("Jaljeera", 70.0);

        beveragePrices.put("Iced Tea", 50.0);
        beverageWeights.put("Iced Tea", 300.0);
        beverageCalories.put("Iced Tea", 80.0);

        beveragePrices.put("Beer", 100.0);
        beverageWeights.put("Beer", 330.0);
        beverageCalories.put("Beer", 150.0);

        beveragePrices.put("Wine", 150.0);
        beverageWeights.put("Wine", 150.0);
        beverageCalories.put("Wine", 120.0);

        beveragePrices.put("Whiskey", 200.0);
        beverageWeights.put("Whiskey", 60.0);
        beverageCalories.put("Whiskey", 100.0);

        beveragePrices.put("Vodka", 150.0);
        beverageWeights.put("Vodka", 60.0);
        beverageCalories.put("Vodka", 100.0);

        beveragePrices.put("Rum", 150.0);
        beverageWeights.put("Rum", 60.0);
        beverageCalories.put("Rum", 100.0);

        beveragePrices.put("Gin", 150.0);
        beverageWeights.put("Gin", 60.0);
        beverageCalories.put("Gin", 100.0);

        beveragePrices.put("Tequila", 150.0);
        beverageWeights.put("Tequila", 60.0);
        beverageCalories.put("Tequila", 100.0);

        beveragePrices.put("Brandy", 150.0);
        beverageWeights.put("Brandy", 60.0);
        beverageCalories.put("Brandy", 100.0);
        

        // Desserts: Prices (INR), Weights (grams), and Calories (kcal)
        dessertPrices.put("Please Select", 0.0);
        dessertWeights.put("Please Select", 0.0);
        dessertCalories.put("Please Select", 0.0);

        dessertPrices.put("Gulab Jamun", 40.0);
        dessertWeights.put("Gulab Jamun", 100.0);
        dessertCalories.put("Gulab Jamun", 150.0);

        dessertPrices.put("Rasgulla", 40.0);
        dessertWeights.put("Rasgulla", 100.0);
        dessertCalories.put("Rasgulla", 120.0);

        dessertPrices.put("Jalebi", 30.0);
        dessertWeights.put("Jalebi", 100.0);
        dessertCalories.put("Jalebi", 250.0);

        dessertPrices.put("Kheer", 50.0);
        dessertWeights.put("Kheer", 150.0);
        dessertCalories.put("Kheer", 200.0);

        dessertPrices.put("Gajar Ka Halwa", 60.0);
        dessertWeights.put("Gajar Ka Halwa", 150.0);
        dessertCalories.put("Gajar Ka Halwa", 220.0);

        dessertPrices.put("Ras Malai", 50.0);
        dessertWeights.put("Ras Malai", 100.0);
        dessertCalories.put("Ras Malai", 180.0);

        dessertPrices.put("Kulfi", 40.0);
        dessertWeights.put("Kulfi", 80.0);
        dessertCalories.put("Kulfi", 150.0);

        dessertPrices.put("Ice Cream", 50.0);
        dessertWeights.put("Ice Cream", 100.0);
        dessertCalories.put("Ice Cream", 180.0);

        dessertPrices.put("Chocolate Brownie", 80.0);
        dessertWeights.put("Chocolate Brownie", 150.0);
        dessertCalories.put("Chocolate Brownie", 320.0);

        dessertPrices.put("Shahi Tukda", 60.0);
        dessertWeights.put("Shahi Tukda", 150.0);
        dessertCalories.put("Shahi Tukda", 250.0);

        dessertPrices.put("Phirni", 50.0);
        dessertWeights.put("Phirni", 150.0);
        dessertCalories.put("Phirni", 200.0);
    }

    // Getters for each category
    public Map<String, Double> getFoodPrices() { return foodPrices; }
    public Map<String, Double> getFoodWeights() { return foodWeights; }
    public Map<String, Double> getFoodCalories() { return foodCalories; }
    public Map<String, Double> getDessertPrices() { return dessertPrices; }
    public Map<String, Double> getDessertWeights() { return dessertWeights; }
    public Map<String, Double> getDessertCalories() { return dessertCalories; }
    public Map<String, Double> getBeveragePrices() { return beveragePrices; }
    public Map<String, Double> getBeverageWeights() { return beverageWeights; }
    public Map<String, Double> getBeverageCalories() { return beverageCalories; }
}
