public class M_StingCompare {
    public static void main(String[] args) {
      //membandingkam 2 buah string
        String str1 = "POLBENG";
        String str2 = "polbeng";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        String s1="Java";
        String s2="Java";
        String s3="Java";

        if(s1==s2){
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }
        if (s1==s3){
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }
    }

}
