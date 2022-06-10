import java.util.ArrayList;

public class Ball extends Equipment {

    String type;
    boolean needsAir;


    public Ball(int id, String location, Boolean needReplacing, String type, boolean needsAir) {
        super(id, location, needReplacing);
        this.type = type;
        this.needsAir = needsAir;

    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isNeedsAir() {
        return needsAir;
    }

    public void setNeedsAir(boolean needsAir) {
        this.needsAir = needsAir;
    }


    @Override
    public String toString() {

        return  String.format("Ball{" + super.toString() + "type: %s, NeedsAir: %b }", type, needsAir);
    }
}
