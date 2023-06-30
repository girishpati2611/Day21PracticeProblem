public class NullPointerExceptionExample {
    static String value=null;
    public static void checkValue(String value){
        if(value=="Something value"){
            System.out.println("There is something value.");
        }
        else{
            System.out.println("Its null pointer exception");
        }
    }
    public static void main(String[] args) {
    try{
        checkValue(value);
    }catch(NullPointerException ne){
        ne.printStackTrace();
    }
    }
}
