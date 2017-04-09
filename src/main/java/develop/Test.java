package develop;

public class Test {

    public static void main(String[] args) {

        String str = "1//3";
        String tokens[] = str.split("/");
        for (String s : tokens)
            if (!s.isEmpty())
                System.out.println(Integer.parseInt(s));
    }

}
