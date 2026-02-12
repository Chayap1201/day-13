public class main9 {
    public static void main(String[] args) {

        try {
            int a=10/0;
            System.out.println(a);  
        } 
        catch (NullPointerException e) {
            System.out.println("Error: String is null.");
        } 
        finally {
            System.out.println("Finally block always executes.");
        }
    }
}
