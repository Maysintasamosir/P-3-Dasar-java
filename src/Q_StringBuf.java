public class Q_StringBuf {
    public static void main(String[] args) {
        //menggunakan kelas StringBuffer
        String str="java";
        StringBuffer buffer=new StringBuffer(str);
        if (str.equals(buffer)){
            System.out.println("Both are equal");
        }else {
            System.out.println("Both are not equal");
        }
    }
}
