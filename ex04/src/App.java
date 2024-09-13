public class App {
    public static void main(String[] args) throws Exception {
        
        // Sequência a
        int[] a = { 1, 3, 5, 7 };
        System.out.println("a) " + (a[a.length - 1] + 2));

        // Sequência b
        int[] b = { 2, 4, 8, 16, 32, 64 };
        System.out.println("b) " + (b[b.length - 1] * 2));

        // Sequência c
        int[] c = { 0, 1, 4, 9, 16, 25, 36 };
        System.out.println("c) " + (c[c.length - 1] + 2 * (c.length - 1) + 1));

        // Sequência d
        int[] d = { 4, 16, 36, 64 };
        System.out.println("d) " + (d[d.length - 1] + 36 / (d.length - 1)));

        // Sequência e
        int[] e = { 1, 1, 2, 3, 5, 8 };
        System.out.println("e) " + (e[e.length - 1] + e[e.length - 2]));

        // Sequência f
        int[] f = { 2, 10, 12, 16, 17, 18, 19 };
        System.out.println("f) " + (f[f.length - 1] + 1));
    }

}
