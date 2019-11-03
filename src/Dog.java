import java.awt.*;

public class Dog extends DomesticAnimal implements Printable{
    private String service;


    public String getService() {
        return service;
    }

    public Dog(String name, Color color, int weight, String service) {
        super(name, color, weight);
        this.service = service;
    }

    @Override
    public void print() {
        System.out.println("Собака:"+ getName()+" "+ getColor()+ " "+ getWeight() +" кг "+ service);


    }
}
