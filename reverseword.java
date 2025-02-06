public class reverseword{
    public static void main(String[] args) {
        String string="my name is sahil";
        String splitArray[]=string.split(" ");

        for(int i=splitArray.length-1;i>=0;i++){
            System.out.println(splitArray[i]);
        }
    }
}
