public class arrFindMin {

    public static void main(String[] args){
        int[] arr = {1,1,2,3,4,5,2,3,4,5,123,4,1,5,51,23,3,14,15,7,5,15,1};
        System.out.println("The smallest number in my array is " + findMin(arr));
    }

    public static int findMin(int[] in){
        int minimum = in[0];
        for(int i=0; i<in.length; i++){
            if(in[i]<minimum){
                minimum = in[i];
            }
        }
        return minimum;
    }
}
