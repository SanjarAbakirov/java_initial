public class Cats {
    String name;
    String color;
    int meou;

    void sayHi(){
        System.out.println("Hello. I am cat. My name is " + name + ". I am " + "color." + "I say meou " + meou + " times!");
    }

    void sleep() {
        System.out.println("Z z z ... Z z z ..." + name + " is sleeping!");
    }

}

class Main{
    public static void main(String[] args){
        Cats barsik = new Cats(); // create an object Barsik
        barsik.name = "Barsik";
        barsik.color = "grey";
        barsik.meou = 3;

        barsik.sayHi();
        barsik.sleep();
    }
}