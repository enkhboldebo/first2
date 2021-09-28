public class stringReserve {

    public static void main(String[] args){
        String reverseSen = "oguulberiig reverse bolgie";
        String answer = "";
        for(int i=reverseSen.length()-1; i>=0; i--){
            answer = answer + reverseSen.charAt(i);
        }
        System.out.println(answer);
    }

}
