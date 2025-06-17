package constants;

public enum DBProperties {
    URL("jdbc:mysql://localhost:3306/aeroplanedatabase"),
    USER_NAME("root"),
    SECRET("Pruthvi@123");


    private String Prop;
    private DBProperties(String prop){
        this.Prop=prop;
    }

    public String getProp() {
        return Prop;
    }
}
