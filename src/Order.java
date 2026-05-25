public class Order {
   private int id;
   private double amount;
   private String currency;

    public Order(int id, double amount, String currency) {
        this.id = id;
        this.amount = amount;
        this.currency = currency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
//    Классы
//1. Order
//
//    Простой класс с полями(POJO):
//
//    id
//            amount
//    currency

}
