import java.lang.*;
class Main{
    public static void main(String[] args){
        StringBuffer a= new StringBuffer("Joshua Immanuel");
        System.out.println(a.charAt(5));
        a.setCharAt(5,'z');
        System.out.println(a.charAt(5));
    }
}