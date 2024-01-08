public class T2 {
    public static void main(String[] args) {
        String str1="Today is snowing";
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            char str2=str1.charAt(i);
            if(Character.isLetter(str2)){
                count++;
            }
        }
        System.out.println(count);
    }
}
