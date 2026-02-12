import java.util.LinkedList;
public class main1{
    public static void main(String[] args){
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("volvo");
        cars.add("bmw");
        cars.add("mazda");
        String firstcar = cars.get(0);
        System.out.println(firstcar);
        System.out.println(cars);
        System.out.println(cars.size());
        cars.clear();
    }
}
