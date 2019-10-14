package Jobsheet7;

class Ikan1841720206Kaisar {
    public void swim(){
        System.out.println("Ikan bisa berenang");
    }
}
class Piranha1841720206Kaisar extends Ikan1841720206Kaisar{
    public void swim(){
        System.out.println("Piranha bisa makan daging");
    }
}
public class Fish1841720206Kaisar {
    public static void main(String[] args) {
        Ikan1841720206Kaisar a = new Ikan1841720206Kaisar();
        Ikan1841720206Kaisar b = new Piranha1841720206Kaisar();
        a.swim();
        b.swim();
    }
}
