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
    public Double priceTag(){
        return price += customsFee;
    }

    //GET AND SET
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

}
