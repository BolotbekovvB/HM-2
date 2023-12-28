public class snake extends Animal implements Printable {
    private int lenght;

    public snake (int lenght){
        this.lenght = lenght;
    }

    @Override
    public void print() {
        System.out.println("Длина змеи:" + lenght + " метров");
    }
}
