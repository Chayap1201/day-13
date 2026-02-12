import java.util.ArrayList;
public class main{
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
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
