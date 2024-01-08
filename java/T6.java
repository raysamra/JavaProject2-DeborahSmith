public class T6 {
    private static int countVowels(String str1){
        int count=0;
        for (int i = 0; i < str1.length(); i++) {
            char str2=str1.charAt(i);
            if(str2=='a'||str2=='e'||str2=='i'||str2=='o'||str2=='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String v="Hello snow!";
        int countVowels=countVowels(v);
        System.out.println("Number of vowels : "+countVowels);
    }
}
