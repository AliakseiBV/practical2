import task.Material;
import task.Subject;

public class Main {
    public static void main(String[] args) {
        Material steel = new Material("steel",7850);
        Subject wire = new Subject("wire", steel, 0.03F);

        System.out.println(wire);

        Material copper = new Material("copper", 8500);
        wire.setMaterial(copper);

        System.out.println(
                String.format("The %s mass is %.1f kg.", wire.getName(), wire.getMass()));

    }
}