import java.util.TreeMap;
public class main6{
    public static void main(String[] args){
        TreeMap<String,String> capitalcities = new TreeMap<String,String>();
        capitalcities.put("england","londom");
        capitalcities.put("india","new dehli");
        capitalcities.put("austria","wien");
        capitalcities.put("norway","oslo");
        capitalcities.put("usa","washington dc");
        capitalcities.put("norway","osls");
        capitalcities.get("england");
        capitalcities.remove("england");
        capitalcities.clear();
        capitalcities.size();
        System.out.println(capitalcities);
        
    }
}
