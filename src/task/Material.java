package task;

public class Material {

    private String name;
    private float density;

    public Material(String name, int density){
        this.name = name;
        this.density = density;
    }

    public Material(){
        this.name = "Moonstone";
        this.density= 42;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name + ";" + this.density;
    }

    public String getName() {
        return name;
    }

    public float getDensity() {
        return density;
    }




}
