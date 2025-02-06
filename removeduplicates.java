public class removeduplicates {
    public static void main(String[] args) {
        String str= "xxyyxcx";

        StringBuilder ab= new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch= str.charAt(i);
            int index= str.indexOf(ch, i+1);
            if (index == -1) {
                ab.append(ch);
            }
        }
        System.out.println("String after removing duplicates: " + ab);
    }
}
