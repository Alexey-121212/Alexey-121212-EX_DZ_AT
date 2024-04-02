package DZ2;

public class Answer {
    public int[] subArrays(int[] a, int[] b) {
        if (a.length != b.length)
            return new int[]{};
        else {
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; a++)
                c[i] = a[i] - b[i];
            return c;
        }
    }

}
