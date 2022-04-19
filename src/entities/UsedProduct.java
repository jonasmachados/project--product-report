package entities;

import java.util.Date;

public class UsedProduct extends Product {

    private Date manufactureDate;

    //CONSTRUCTOR
    public UsedProduct() {
    }

    //CONSTRUCTOR
    public UsedProduct(Date manufactureDate, String name, Double price) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

//    @Override
//     public Double priceTag(double amount){
//        price = amount;
//        return price;
//    }
    
    //GET AND SET
    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

}
