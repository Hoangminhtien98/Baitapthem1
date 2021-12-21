public class Candy {
    private int id;
    private String color;
    private double price;
    private int quantity;
    private String feature;

    private static int ID = 0;

    public Candy() {
    }

    public Candy(int id, String color, double price, int quantity, String feature) {
        this.id = id;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.feature = feature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Candy.ID = ID;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", feature='" + feature + '\'' +
                '}';
    }
}
