public class GroupTask03Tester {
    public static void main(String[] args) {
        Truck truck1 = new Truck(10000, "Red", 1000);
        Truck truck2 = new Truck(10000, "Blue", 2500);
        System.out.println(truck1.calculateSalePrice());
        System.out.println(truck2.calculateSalePrice());

        Sedan sedan1 = new Sedan(10000, "Red", 15);
        Sedan sedan2 = new Sedan(10000, "Blue", 25);
        System.out.println(sedan1.calculateSalePrice());
        System.out.println(sedan2.calculateSalePrice());
    }
}
