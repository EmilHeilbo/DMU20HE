package Week3;

public class StringContainer {
    protected String[] strings;
    private int count = 0;

    public void put(String s) {
        if (count >= strings.length)
            expandArray();
        strings[count] = s;
        count++;
    }

    public String get(int i) {
        return (i < strings.length && i >= 0) ? strings[i] : null;  //Returns null if 'i' is out of scope.
    }

    public int length() {
        return count;
    }

    public void expandArray() {
        String[] tmpArr = new String[strings.length * 2];
        System.arraycopy(strings, 0, tmpArr, 0, strings.length);
        strings = tmpArr;
    }
}
