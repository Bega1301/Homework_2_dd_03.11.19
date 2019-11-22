import java.awt.*;

public class Cow extends DomesticAnimal implements Printable{
    private String product;
    private int amountOfProduct;

    public String getProduct() {
        return product;
    }

    public int getAmountOfProduct() {
        return amountOfProduct;
    }

    public Cow(String name, Color color, int weight, String product, int amountOfProduct) {
        super(name, color, weight);
        this.product = product;
        this.amountOfProduct = amountOfProduct;
    }

    @Override
    public void print() {

        System.out.println("Корова:" + getName()+" " +getColor()+  product +" " + amountOfProduct+ "литров");





    }
}
