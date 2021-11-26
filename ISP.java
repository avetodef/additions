package additions;

interface FlowerTulip {
    String drawTulip();
}
interface FlowerRose {
    String drawRose();
}


class Tulip implements FlowerTulip {

    public String drawTulip() {
        return "tulip ";
    }
}

class Rose implements FlowerRose {

    public String drawRose() {
        return "rose ";
    }
}

public class ISP {

    public static String paintTulip(FlowerTulip flowerTulip) {
        return flowerTulip.drawTulip();
    }

    public static String paintRose(FlowerRose flowerRose) {
        return flowerRose.drawRose();
    }

    public static void main(String[] args) {
        Tulip tulip = new Tulip();
        Rose rose = new Rose();
        System.out.println(paintRose(rose));
        System.out.println(paintTulip(tulip));
    }
}
