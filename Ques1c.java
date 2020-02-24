//3. Concatination of 2 string Parameter (String , String ) Return (String)
interface Concat {
    String concat(String s1, String s2);
}

public class Ques1c {
    public static void main(String[] args) {
        Concat c = ((s1, s2) -> {
            return s1 + s2;
        });
        System.out.println(c.concat("Hello ", "World"));
    }
}
