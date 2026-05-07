public class Cats {
    String name;
    String color;
    int meou;

    void sayHi(){
        System.out.println("Hello. I am cat. My nae is " + name + ". I am " + "color." + "I say meou " + meou + " times!");
    }
}

class Main{
    public static void main(String[] args){
        Cats barsik = new Cats(); // create an object
        barsik.name = "Barsik";
        barsik.color = "grey";
        barsik.meou = 3;

        barsik.sayHi();
    }
}