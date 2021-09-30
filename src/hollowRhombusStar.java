public class hollowRhombusStar {

    public static void main(String[] args){
        for(int i=0; i<5; i++){
            for(int space=0; space<5-i-1; space++){
                System.out.print(" ");
            }
            for(int star=0; star<5; star++){
                if( i==0 || i==4 || star==0 || star==4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
