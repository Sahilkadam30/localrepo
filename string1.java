public class string1 {
    public static void main(String[] args) {
        String temp = "SA@HI!l";
        StringBuilder finalOutput = new StringBuilder();

        for (int i = 0; i < temp.length(); i++) {
            char ch = temp.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') ||
                (ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9')) 
            {
                finalOutput.append(ch);
            }
        }
        System.out.println(finalOutput);
    }
}

