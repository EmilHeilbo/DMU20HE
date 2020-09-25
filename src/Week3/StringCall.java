package Week3;

public abstract class StringCall {
    protected String[] strings = new String[10];
    protected int count = 0;

    public void put(String s) {
        if (count == strings.length)
            expandArray();
        strings[count] = s;
        count++;
    }

    public abstract String get();

    public void expandArray() {
        String[] tmpArr = new String[count * 2];
        System.arraycopy(strings, 0, tmpArr, 0, strings.length);
        strings = tmpArr;
    }
}
