package additions;


abstract class DeafaultRobot {
    protected String name = "робот", limb, hardWare;
}

class RobotWithHands extends DeafaultRobot{
    {
        limb = "рука";
        hardWare = " ";
    }
}

class RobotWithLegs extends DeafaultRobot{
    {
        limb = "нога";
        hardWare = " ";
    }
}


class RobotWithHandsAndKnife extends RobotWithHands {
    {
        limb = "рука-";
        hardWare = " нож";
    }
    protected String msg() { return "y " + name + "a " +"есть " + limb  + hardWare ; }
}
class RobotWithHandsAndChainSaw extends RobotWithHands {
    {
        limb = "рука-";
        hardWare = " бензопила ";
    }
    protected String msg() { return "y " + name + "a " + "есть " + limb + hardWare ; }
}

class RobotWithLegsAndKnife extends RobotWithLegs {
    {
        limb = "нога-";
        hardWare = " нож ";
    }
    protected String msg() { return "y " + name + "a " + "есть " + limb  + hardWare ; }
}
class RobotWithLegsAndChainSaw extends RobotWithLegs {
    {
        limb = "нога-";
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
