package additions;

interface Floppa {
    String say();
}

class MiniFloppa implements Floppa {
    public String say() {return "mini floppa"; }
}

class BigFloppa implements Floppa {
    public String say() {return "big floppa";}
}


public class DIP {
    public static String Voice(Floppa floppa) {
        return floppa.say();
    }
    public static void main(String[] args){
        MiniFloppa miniFloppa = new MiniFloppa();
        BigFloppa bigFloppa = new BigFloppa();
        System.out.println(Voice(miniFloppa));
        System.out.println(Voice(bigFloppa));
    }
}
