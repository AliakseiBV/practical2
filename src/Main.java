import task.Material;
import task.Subject;

public class Main {
    public static void main(String[] args) {
        Material steel = new Material("steel",7850);
        Material copper = new Material("copper", 8500);

        Subject subject = new Subject("wire", steel, 0.03F);

        System.out.println(subject);

        subject.setMaterial(copper);

        System.out.println(
                String.format("The %s mass is %.1f kg.", subject.getName(), subject.getMass()));

    }
}