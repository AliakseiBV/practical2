package task;

public class Material {

    private final String name;
    private final float density;

    public Material(String NAME, int DENSITY){
        this.name = NAME;
        this.density = DENSITY;
    }

    public Material(){
        this(null,0);
    }

    public String toString(){
        return this.name + ";" + this.density;
    }

    public String getNAME() {
        return name;
    }

    public float getDensity() {
        return density;
    }




}
