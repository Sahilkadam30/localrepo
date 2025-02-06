public class positivenumber{
    public static void main(String[] args) {
        int[] arr={1,-2,3,-4,5,6,-7};
        search(arr);

    }
    static void search(int[] arr){
        double sum=0;
        double count=0;

        for (int i : arr) {
            if(i > 0){
                sum=sum+i;
                count++;
            }
        }

        double result=sum/count;
        System.out.println(result);
    }
}