package entities;

public class ImpotedProduct extends Product {

    private Double customsFee;

    //OONSTRUCTOR
    public ImpotedProduct() {
        super();
    }

    //OONSTRUCTOR
    public ImpotedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return ""
                + getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + customsFee
                + ") ";
    }

    public Double totalPrice() {
        price += customsFee;
        return price;
    }

    //GET AND SET
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

}
