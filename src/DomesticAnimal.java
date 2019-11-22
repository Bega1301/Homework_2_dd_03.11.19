import java.awt.*;

public class DomesticAnimal {

 private String name;
 private Color color;
 private int weight ;

 public Color getColor () {
     return color;
 }

 public int getWight (){
     return  weight;
 }

 public String getName (){
     return  name;
 }

 public DomesticAnimal(String name, Color color, int weight) {
  this.name = name;
  this.color = color;
  this.weight = weight;

 }
}
