public class ServerStatus {
    public static void main(String[] args) {

        Status[] s=Status.values();
        for(Status ss:s){
            System.out.println(ss+" "+ss.ordinal());
        }

    }
}
enum Status{
    NOTFOUND,GOOD,ALLOK,INTERNALSERVERERROR;
}