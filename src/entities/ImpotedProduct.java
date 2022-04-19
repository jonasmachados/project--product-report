package entities;

public class ImpotedProduct extends Product {

    private Double customsFee;

    //OONSTRUCTOR
    public ImpotedProduct() {
        super();
    }

    //OONSTRUCTOR
    public ImpotedProduct(Double customsFee, String name, Double price) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public Double priceTag(double amount) {
        super.priceTag(amount);
        totalPrice();
        return price;
    }

    double sum = 0;

    public Double totalPrice() {
        sum = price + customsFee;
        return sum;
    }

    //GET AND SET
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

}
