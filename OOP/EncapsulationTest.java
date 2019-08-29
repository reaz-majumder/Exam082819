package OOP;

public class EncapsulationTest {

    public static void main(String[] args) {

        Encapsulation myObj = new Encapsulation();

        //myObj.name = "John";//this will show error since the name variable is private
        //System.out.println(myObj.name);

        myObj.setName("John");
        myObj.setId(2222);
        System.out.println(myObj.getName());
        System.out.println(myObj.getId());

    }
}