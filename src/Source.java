public class Source {
    public static void main(String[] args) {
    String str = "eloquent";
        System.out.println(remove(str).equals("loquen"));
    }
    public static String remove(String str) {
        return str.substring(1,str.length()-1);
    }
}
