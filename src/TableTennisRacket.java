

public class TableTennisRacket extends Equipment{

    boolean needRepair;


    public TableTennisRacket(int id, String location, Boolean needReplacing, boolean needRepair) {
        super(id, location, needReplacing);
        this.needRepair = needRepair;
    }


    public boolean isNeedRepair() {
        return needRepair;
    }

    public void setNeedRepair(boolean needRepair) {
        this.needRepair = needRepair;
    }

    @Override
    public String toString() {
        return   String.format("TableTennisRacket{" + super.toString()  + "NeedRepair: %b }", needRepair);
    }
}
