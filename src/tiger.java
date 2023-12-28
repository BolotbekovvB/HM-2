public class tiger extends Animal implements Printable{
    private int powerBite;

    public tiger(int powerBite){
        this.powerBite = powerBite;
    }

    @Override
    public void print() {
        System.out.println("Сила укуса тигра:" + powerBite + " кгс на кв. см.");
    }
}

