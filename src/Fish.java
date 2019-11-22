import java.awt.*;

public class Fish extends DomesticAnimal implements Printable{
    private String decoration;

    public String getDecoration() {
        return decoration;
    }

    public Fish(String name, Color color, int weight, String decoration) {
        super(name, color, weight);
        this.decoration = decoration;
    }


    @Override
    public void print() {
        System.out.println("Рыбка :"+ getName()+ " "+getColor()+ " "+getDecoration());

    }
}
