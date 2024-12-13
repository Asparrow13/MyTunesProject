import java.util.ArrayList;
import java.util.List;

class salesItem {
    private String name;
    private double price;

    public String getname() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public salesItem() {
    }

    public salesItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class consoleProgram {
    public static salesItem getMostExpensive(List<salesItem> items) {
        salesItem mostExpensive = items.get(0);

        for (salesItem item : items) {
            if (item.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = item;
            }
        }

        return mostExpensive;
    }

    public static void main(String[] args) {
        List<salesItem> items = new ArrayList<salesItem>();

        items.add(new salesItem("Bicycle", 2500.00));
        items.add(new salesItem("Car", 234500.00));
        items.add(new salesItem("Salt shaker", 20.5));
        items.add(new salesItem("Baby Yoda figurine", 250.00));
        items.add(new salesItem("CD – Wham – Last Christmas", 50.00));

        for (salesItem item : items) {
            System.out.println("Name: " + item.getname() + ", Price: " + item.getPrice());
        }

        salesItem mostExpensiveItem = getMostExpensive(items);
        System.out.println("Most Expensive Item: " + mostExpensiveItem.getname() + ", Price: " + mostExpensiveItem.getPrice());
    }
}
