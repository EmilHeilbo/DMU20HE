public class StringContainer {
    public String[] stringArray;
    
    public void put(String string) {
        for(int i = 0; i < stringArray.length; i++) {
            if(stringArray[i] == null) {
                stringArray[i] = string;
                break;
            }
        }
    }
    
    public String get(int i) {
        return (i < stringArray.length) ? stringArray[i] : null;  //Returns null if 'i' is out of scope.
    }
    
    public int length() {
        int counter = 0;
        for (String str : stringArray) {
            if (str != null)
                counter++;
            else
                break;
        }
        return counter;
    }
}
