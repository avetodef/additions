package additions;

import java.util.*;
//ohehigewhifgewiphgpjwigpidfpghh
abstract class Place {
    protected String name;
    protected final List<Weapon> equipment = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return Objects.equals(name, place.name) && Objects.equals(equipment, place.equipment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, equipment);
    }

    public void equip(Weapon weapon) {
        equipment.add(weapon);
    }
}

class Hand extends Place {
    {
        name = "рука-";
    }
}

class Leg extends Place {
    {
        name = "нога-";
    }
}

abstract class Weapon {
    protected String name;
}

class Knife extends Weapon {
    {
        name = "нож";
    }
}

class Chainsaw extends Weapon {
    {
        name = "бензопила";
    }
}

class CoolRobot {
    private final String name = "робот";
    private final List<Place> places = new ArrayList<>();

    public void equip(Place place, Weapon weapon) {
        if (!places.contains(place)) {
            addPlace(place, weapon);
            return;
        }

        for (Place p: places)
            if (p.equals(place))
                p.equip(weapon);

    }

    private void addPlace(Place place, Weapon weapon) {
        place.equip(weapon);
        places.add(place);
    }

    public String summary() {
        String msg = "У " + name + "а ";
        for (Place p: places) {
            for (Weapon w: p.equipment)
                msg += p.name + w.name + ", ";
        }

        return msg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoolRobot robot = (CoolRobot) o;
        return name.equals(robot.name) && places.equals(robot.places);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, places);
    }
}

public class Robot {
    public static void main(String[] args) {
        CoolRobot robot = new CoolRobot();
        robot.equip(new Hand(), new Knife());
        robot.equip(new Hand(), new Chainsaw());
        robot.equip(new Leg(), new Chainsaw());
        robot.equip(new Leg(), new Knife());
        System.out.print(robot.summary());
    }
}
