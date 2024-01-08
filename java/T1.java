public class T1 {
    public static void main(String[] args) {

        String str1="Howdy";
        String str2="Class";

        System.out.println("Before: "+str1+" "+str2);

        str1=str1+str2;
        str2=str1.substring(0, str1.length()-str2.length());
        str1=str1.substring(str2.length());

        System.out.println("After: "+str1+" "+str2);
    }
}
