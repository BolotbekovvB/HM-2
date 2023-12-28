public class Main {
    public static void main(String[] args) {
    Printable[] printable = {createObject("Snake"),createObject("Tiger"),
            createObject("Bear")};
    for (Printable print:printable) {
        print.print();
    }
    }
    public  static Printable createObject (String className){
        switch (className){
            case "Snake":
            return new snake(10);
            case "Tiger":
                return new tiger(74);
            case "Bear":
                return new bear("Бурый");
        }
        return null;
    }
}
