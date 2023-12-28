public class bear extends Animal implements Printable{
    private String race;

    public bear(String race){
        this.race = race;
    }

    @Override
    public void print() {
        System.out.println("Раса медведя:" + race);
    }
}
