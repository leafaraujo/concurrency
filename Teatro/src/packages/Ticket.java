package src.packages;

public class Ticket {
    private float price;
    private String id;

    public Ticket(float price, String id) {
        this.price = price;
        this.id = id;
    }
    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
