public class Cat {
    String name;
    String color;
    String breed;
    int num;

//    void sayMeow(){
//            for (int i = 0 ; i < meow; i++){
//            System.out.println("Meow!");
//        }
//    }

    int sayMeow(int times){
        for (int i = 0 ; i < times; i++) {
            System.out.println("Meow!");
        }
        num = times;
        return num;

    }
    void sayHi(){
        System.out.println("Hello. I am cat. My name is " + name + ". My breed is " + breed + ". I am " + color + ". I say Meow " + num + " times!");
    }
    int getMeowCount(int idx){
        return 2 * idx;
    }
    void sleep() {
        System.out.println("Z z z ... Z z z ..." + name + " is sleeping!");
    }
}



class Main{
    public static void main(String[] args){
//        barsik
        Cat barsik = new Cat(); // create an object Barsik
        barsik.name = "Barsik";
        barsik.color = "grey";
        barsik.breed = "tabby";

        int base = barsik.sayMeow(3);
        barsik.sayHi();
        barsik.sleep();
        int points = barsik.getMeowCount(base);
        System.out.println(barsik.name + " said meow " + base + " times.");
        System.out.println(barsik.name + " got " + points + " points");

//        Yod
        Cat yod = new Cat();
        yod.name = "Yod";
        yod.color = "pale";
        yod.breed = "yard-cat";

        int base1 = yod.sayMeow(2);
        yod.sayHi();
        barsik.sleep();
        int points1 = yod.getMeowCount(base1);
        System.out.println(yod.name + " said meow " + base1 + " times.");
        System.out.println(yod.name + " got " + points1 + " points");
    }
}