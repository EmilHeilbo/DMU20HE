package Week3;

public class StringStack extends StringCall {
    public String get() {
        if (count >= 0) {
            count--;
            return strings[count];
        } else
            return null;
    }
}
