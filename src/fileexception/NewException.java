package fileexception;

public class NewException {
    public static void main(String[] args) {

        String name=null;
        String company= "Neoteric";

        System.out.println(name);
        System.out.println(company);
        try {
            System.out.println(name.toUpperCase());
        }catch (Exception e){
            System.out.println("Exception Occurred "+e.getMessage());
        }finally {
            System.out.println("From Finally Block");
        }
        System.out.println(company.toUpperCase());
    }
}
