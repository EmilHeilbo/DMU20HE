package Week4;

public class QuickSort {
    public static void main(String[] args) {
        char[] chArr = {'a', 'c', 'm', 'b', 'q', 'o', 'x'};
        final int MIN = 0;
        final int MAX = chArr.length - 1;
        qs(chArr, MIN, MAX);

        System.out.println(chArr);
    }

    private static void qs(char[] items, int left, int right) {
        int i, j;
        char x, y;
        i = left;
        j = right;
        x = items[(left + right) / 2];
        do {
            while ((items[i] < x) && (i < right))
                i++;
            while ((x < items[j]) && (j > left))
                j--;
            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }
        } while (i <= j);
        if (left < j)
            qs(items, left, j);
        if (i < right)
            qs(items, i, right);
    }
}
