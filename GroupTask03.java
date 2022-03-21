//        Create a Class Car that would have the following fields:
//        carPrice, color and method calculateSalePrice()
//        which should be returning a price of the car.

//        Create 2 sub-classes: Sedan and Truck.
//        The Truck class has field as weight and has its own
//        implementation   of   calculateSalePrice()   method   in
//        which   returned   price   calculated   as   following:   if
//        weight>2000 then returned price car should include
//        10% discount, otherwise 20% discount.
//        The Sedan class has field as length and also does it
//        is own   implementation   of   calculateSalePrice():   if
//        length of sedan is >20 feet then returned car price
//        should include 5% discount, otherwise 10% discount


class Car{
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    double calculateSalePrice(){
        double salePrice=0;
        return salePrice;
    }
}
class Sedan extends Car{
    int length;
    public Sedan(double carPrice, String color, int length) {
        super(carPrice, color);
        this.length=length;
    }

    @Override
    double calculateSalePrice() {
        double salePrice = 0;
        if(length>20){
            salePrice=carPrice*.95;
        } else {
            salePrice=carPrice*.9;
        }
        return salePrice;
    }
}
class Truck extends Car{
    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight=weight;
    }

    @Override
    double calculateSalePrice() {
        double salePrice=0;
        if (weight>2000){
            salePrice=carPrice*.9;
        } else {
            salePrice=carPrice*.8;
        }
        return salePrice;
    }
}
public class GroupTask03 {
}
