import java.util.TreeSet;
import java.util.ArrayList;
public class main3{
    public static void main(String[] args){
        TreeSet<String> cars = new TreeSet<String>();
        cars.add("volvo");
        cars.add("bmw");
        cars.add("mazda");
        ArrayList<String> list = new ArrayList<>(cars);
        String firstcar = list.get(0);
        System.out.println(firstcar);
        System.out.println(cars);
        System.out.println(cars.size());
        cars.clear();
    }
}
