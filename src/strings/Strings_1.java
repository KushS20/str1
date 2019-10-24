package strings;

import java.util.Scanner;

public class Strings_1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String vs = S.nextLine();
        String gs = S.nextLine();
        int n = S.nextInt();
        S.close();
        int l;
        int w;
        int k;
        char g;
        String h;
        String s;
        String r, u;
        l = vs.length();
        w = vs.compareToIgnoreCase(gs);
        k = gs.indexOf("k");
        g = gs.charAt(n);
        h = vs.substring(4);
        s = vs.concat(gs);
        r = gs.replace("g", "y");
        u = vs.replace("hfg", "hfff");
        System.out.println(l);
        if (vs.equals("kushal")) {
            System.out.println(2);
        }
        System.out.println(w + "     compare_to_ig");
        System.out.println(k + "   indexof");
        System.out.println(g + "    char_at");
        System.out.println(h + "       sybstring");
        System.out.println(s + "      concat");
        System.out.println(u + "        replace");
        System.out.println(r + "         replace");


    }
}
