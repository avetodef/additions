package additions;


abstract class DeafaultRobot {
    protected String name = "робот", limb, hardWare;
}

class RobotWithHands extends DeafaultRobot{
    {
        limb = "руки";
        hardWare = " ";
    }
}

class RobotWithLegs extends DeafaultRobot{
    {
        limb = "ноги";
        hardWare = " ";
    }
}


class RobotWithHandsAndKnife extends RobotWithHands {
    {
        limb = "руки-";
        hardWare = " нож";
    }
    protected String msg() { return "y " + name + "a " +"есть " + limb  + hardWare ; }
}
class RobotWithHandsAndChainSaw extends RobotWithHands {
    {
        limb = "руки-";
        hardWare = " бензопила ";
    }
    protected String msg() { return "y " + name + "a " + "есть " + limb + hardWare ; }
}

class RobotWithLegsAndKnife extends RobotWithLegs {
    {
        limb = "ноги-";
        hardWare = " нож ";
    }
    protected String msg() { return "y " + name + "a " + "есть " + limb  + hardWare ; }
}
class RobotWithLegsAndChainSaw extends RobotWithLegs {
    {
        limb = "ноги-";
        hardWare = " бензопила ";
    }
    protected String msg() { return "y " + name + "a " + "есть " + limb  + hardWare ; }
}




public class BadRobot {
    public static String summary(RobotWithHandsAndChainSaw robotWithHandsAndChainSaw) {
        return robotWithHandsAndChainSaw.msg();
    }
    public static String summary(RobotWithHandsAndKnife robotWithHandsAndKnife) {
        return robotWithHandsAndKnife.msg();
    }
    public static String summary(RobotWithLegsAndChainSaw robotWithLegsAndChainSaw) {
        return robotWithLegsAndChainSaw.msg();
    }
    public static String summary(RobotWithLegsAndKnife robotWithLegsAndKnife) {
        return robotWithLegsAndKnife.msg();
    }

    public static void main(String[] args) {
        RobotWithHandsAndChainSaw handsAndChainSaw = new RobotWithHandsAndChainSaw();
        RobotWithHandsAndKnife handsAndKnife = new RobotWithHandsAndKnife();
        RobotWithLegsAndChainSaw legsAndChainSaw = new RobotWithLegsAndChainSaw();
        RobotWithLegsAndKnife legsAndKnife = new RobotWithLegsAndKnife();

        System.out.println(summary(handsAndChainSaw));
        System.out.println(summary(handsAndKnife));
        System.out.println(summary(legsAndChainSaw));
        System.out.println(summary(legsAndKnife));
    }
}
