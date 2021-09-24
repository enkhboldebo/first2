public class arrFindIncome {
    public static void main(String[] args){
        int[] monthlyBill = {1, 1, -9, 8, -10, 100, -200};
        int totalIncome=0;

        for(int i=0; i<monthlyBill.length; i++){
            if(monthlyBill[i]>0){
                totalIncome = totalIncome + monthlyBill[i];
            }
        }
        System.out.println("you have been earned " + totalIncome + "$ in this month");
    }
}
