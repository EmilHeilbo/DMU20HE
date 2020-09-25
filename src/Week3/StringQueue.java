package Week3;

public class StringQueue extends StringCall {

    public String get() {
        String returnString = strings[0];
        if (strings[0] != null)
            System.arraycopy(strings, 1, strings, 0, strings.length);
        return returnString;
    }
}
