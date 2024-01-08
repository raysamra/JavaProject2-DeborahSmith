public class Car {
    double carPrice;
    private String color;
    public Car(double carPrice, String color){
        this.carPrice=carPrice;
        this.color=color;
    }
    public double calculateSalePrice(){
        return carPrice;
    }
}
class Truck extends Car{
    private double weight;
    Truck(double carPrice, String color, double weight){
        super(carPrice, color);
        this.weight=weight;
    }
    @Override
    public double calculateSalePrice(){
        if(weight>2000){
            return carPrice*0.90;
        }else{
            return carPrice*0.80;
        }
    }
}
class Sedan extends Car{
    private double length;
    Sedan(double carPrice, String color, double length){
        super(carPrice, color);
        this.length=length;
    }
    @Override
    public double calculateSalePrice(){
        if(length>20){
            return carPrice*0.95;
        }else{
            return carPrice*0.90;
        }
    }
}
class CarTester{
    public static void main(String[] args) {
        Truck t=new Truck(85000, "Black", 3250);
        System.out.println("The discounted Truck price is = $"+t.calculateSalePrice());

        Sedan s=new Sedan(15750, "Red", 32);
        System.out.println("The discounted Sedan price is = $"+s.calculateSalePrice());
    }
}
