abstract class Equipment {

    private int id;
    private String location;
    private Boolean needReplacing;

    public Equipment(int id, String location, Boolean NeedReplacing){
        this.id = id;
        this.location = location;
        this.needReplacing = NeedReplacing;
    }

    @Override
    public String toString() {
        return  String.format("ID: %d, Location: %s, NeedReplacing: %b, ", id, location, needReplacing);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getNeedReplacing() {
        return needReplacing;
    }

    public void setNeedReplacing(Boolean needReplacing) {
        needReplacing = needReplacing;
    }
}
