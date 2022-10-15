 import java.util.Scanner;

// USING ENUM CONSTANT WITH CONSTANT VALUES
public enum Colour {
    Monday("monday"), tuesday("tuesday"), wednesday("wednesday"), Thursday("thursday"), Friday("friday"), Saturday("saturday"), Sunday("sunday");

    private String value;

    Colour(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

class main1 {
    public static void main(String[] args) {
        Colour c = Colour.Monday;
        System.out.println("monday enum name : " + c.name());
        System.out.println("monday enum value : " + c.getValue());

        for (Colour colour : Colour.values()) {
            System.out.println("Enum value : " + colour.getValue());
        }
    }
}

enum size {
    DOUBLELAEGE(26), LARGE(22), MEDIUM(20), SMALL(18);

    private int size;

    size(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

class SizeDmo {
    public static void main(String[] args) {
        // size s=size.DOUBLELAEGE;
        //System.out.println(s.getSize());
        for (size s : size.values()) {
            System.out.println(s.name() + " " + s.getSize());
        }
    }
}


// enum type safety
enum Direction {
    NORTH, EAST, WEST, SOUTH
}

class EnuDemo {
    public void show(String str) {
        System.out.println(str);
    }

    public void showEnum(Direction d) {
        System.out.println(d);
    }

    public static void main(String[] args) {
        EnuDemo e = new EnuDemo();
        e.show("pop");
        e.showEnum(Direction.EAST);
    }
}

// switch statement in use enum
class SwitchDemo {
    public static void main(String[] args) {
        Direction d = Direction.NORTH;
        switch (d) {
            case EAST -> System.out.println("you are in east side");
            case NORTH -> System.out.println("you are in north side");
            case WEST -> System.out.println("you are in west side");
            case SOUTH -> System.out.println("you are in south side");
            default -> System.out.println("invalid direction");
        }
    }
}

//   TAKING USER INPUT FOR ENUM
class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter enum constant of Direction");
        String e = sc.next();
        try {
            Direction d = Direction.valueOf(e);
            switch (d) {
                case EAST -> System.out.println("you are in east side");
                case NORTH -> System.out.println("you are in north side");
                case WEST -> System.out.println("you are in west side");
                case SOUTH -> System.out.println("you are in south side");
                default -> System.out.println("invalid direction");
            }
          //System.out.println(d);
        } catch (IllegalArgumentException i) {
            System.out.println("plz valid direction ");
            System.out.println(i);
        }
    }
}