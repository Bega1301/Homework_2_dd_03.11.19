public class Main {

    public static void main(String[] args) {

        DomesticAnimal animal = createObject("Cow");
        DomesticAnimal animal1 = createObject("Dog");

        System.out.println(animal.getName());
        System.out.println(animal1.getName());



        Printable printable2 = new Cow("Milky", Color.BLACK, 100, "получаем молоко", 10);
        Printable printable = new Dog("Tom", Color.WHITE, 10, "охраняет дом");
        Printable printable1 = new Fish("Yummy", Color.RED, 20, "сочетается с интерьером");
        printable.print();
        printable1.print();
        printable2.print();


    }


    public static DomesticAnimal createObject(String objectName) {
        switch (objectName) {
            case "Cow":
                return new Cow("Milka", Color.RED, 150, "прлучаем молоко ", 20);
            case "Dog":
                return new Dog("Samy", Color.WHITE, 18, "выступает в цирке");
            default:
                return null;
        }
    }
}






