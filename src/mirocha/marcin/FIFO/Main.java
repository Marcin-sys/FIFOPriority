package mirocha.marcin.FIFO;

public class Main {
    public static void main(String[] args) {
        FIFOPriority fifoPiority = new FIFOPriority();
        fifoPiority.push("Zbyszek",50);
        fifoPiority.push("Adam",70);
        fifoPiority.push("Grzesiek",70);
        fifoPiority.push("Adam",10);


        System.out.println(fifoPiority.popHighTree());
        System.out.println(fifoPiority.popFirst());
    }
}
