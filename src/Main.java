public class Main {

    public static void main(String[] args) {
        Printable printable2 = new Cow("Milky", Color.BLACK, 100, "получаем молоко", 10);
        Printable printable = new Dog("Tom", Color.WHITE, 10, "охраняет дом");
        Printable printable1 = new Fish("Yummy", Color.RED, 20, "сочетается с интерьером");
        printable.print();
        printable1.print();
        printable2.print();


    }


    




}
