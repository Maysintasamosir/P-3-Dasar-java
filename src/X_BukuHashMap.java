import java.util.HashMap;
import java.util.Map;
public class X_BukuHashMap {
    public static void main(String[] args) {
        //membuat objek hashmap<>();
        HashMap<String,X_Buku>books=new HashMap<>();

        //membuat objek buku
        X_Buku bukuJava=new X_Buku("tutorial java","petani kode");
        X_Buku bukuKotlin=new X_Buku("pemrograman kotlin","petani kode");
        X_Buku bukuAndroid=new X_Buku("pemrograman Android","petani kode");

        //mengisi objek hashmap dengan objek buku
        books.put("java",bukuJava);
        books.put("kotlin",bukuKotlin);
        books.put("android",bukuAndroid);

        //print keys
        System.out.println("\nDaftar key:");
        for (String i: books.keySet()){
            System.out.println(i);
        }

        //print values
        System.out.println("\nDaftar values:");
        for (X_Buku aBook: books.values()){
            System.out.println("Title:"+aBook.getTitle()+",Author:"+aBook.getTitle());
        }

    }}



