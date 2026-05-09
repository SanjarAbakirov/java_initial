public class Cat {
    String name;
    String color;
    String breed;
    int num;

    void sayHi(){
        System.out.println("Hello. I am cat. My name is " + name + ". My breed is " + breed + ". I am " + color + ". I say Meow " + num + " times!");
    }
    void sleep() {
        System.out.println("Z z z ... Z z z ..." + name + " is sleeping!");
    }
//    void sayMeow(){
//            for (int i = 0 ; i < meow; i++){
//            System.out.println("Meow!");
//        }
//    }

    int sayMeow(int times){
        for (int i = 0 ; i < times; i++) {
            System.out.println("Meow!");
            num = times;
        }
        return num;
    }

    int getMeowCount(int times){
        return 2 * times;
    }
}

class Main{
    public static void main(String[] args){
//        barsik
        Cat barsik = new Cat(); // create an object Barsik
        barsik.name = "Barsik";
        barsik.color = "grey";
        barsik.breed = "tabby";

        barsik.sayHi();
        barsik.sleep();
        int base = barsik.sayMeow(3);
        System.out.println(barsik.name + "said meow " + base + " times.");
        barsik.getMeowCount(2);

//        Yod
        Cat yod = new Cat();
        yod.name = "Yod";
        yod.color = "pale";
        yod.breed = "yard-cat";

        yod.sayHi();
        yod.sleep();
        yod.sayMeow(2);
    }
}