package jdesign.prototype;

/**
 * Created by Ivans on 9/24/2017.
 */
public abstract class Shape implements Cloneable{

    private String id;
    protected String type;

    abstract void drawn();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return clone;

    }
}