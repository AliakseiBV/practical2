package task;

public class Subject {

    private Material material;
    private String name;
    private float volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Subject(String name, Material material, float volume){
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public Subject(){
        this.name = "shoes";
        this.material = new Material("blue suede", 1956);
    }

    public float getMass(){
        return volume * material.getDENSITY();
    }

    public String toString(){
        return name + ";"
                + material + ";"
                + volume + ";"
                + getMass();
    }

}
