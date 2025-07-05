public class ServerStatusNumbers {
    public static void main(String[] args) {
        StatusNum num=StatusNum.NOTFOUND;
        switch (num.ordinal()){
            case 0:
                System.out.println("Status 200 ALL OK");
                break;
            case 1:
                System.out.println("Status 400 Page Not Found");
                break;
            case 2:
                System.out.println("Status 700 Internal Server Issues");
                break;
            case 3:
                System.out.println("Status 800 Server Not found issusse");
                break;

            default:
                System.out.println("Something went Wrong ");
                break;
        }
    }
}
enum StatusNum{
    GOOD,NOTFOUND,INTERNALERROR,SERVERNOTFOUND;
}