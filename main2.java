import java.util.HashSet;
public class main2{
    public static void main(String[] args){
        HashSet<String> cars = new HashSet<String>();
        cars.add("volvo");
        cars.add("bmw");
        cars.add("mazda");
        String firstcar = cars.iterator().next();
        System.out.println(firstcar);
        System.out.println(cars);
        System.out.println(cars.size());
        cars.contains("madza");
        cars.clear();
    }
}
