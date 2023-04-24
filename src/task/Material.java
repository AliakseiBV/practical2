package task;

public class Material {

    private final String NAME;
    private final float DENSITY;

    public Material(String NAME, int DENSITY){
        this.NAME = NAME;
        this.DENSITY = DENSITY;
    }

    public Material(){
        this(null,0);
    }

    public String toString(){
        return this.NAME + ";" + this.DENSITY;
    }

    public String getNAME() {
        return NAME;
    }

    public float getDENSITY() {
        return DENSITY;
    }




}
