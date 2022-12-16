/* Remove characters from string */

public class Stream {
    public static void main(String[] args) {
        skipCh("", "baccdah");
    }

    static void skipCh(String p, String up) { // p --> Processed & up --> Unprocessed
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skipCh(p, up.substring(1));
        } else {
            skipCh(p + ch, up.substring(1));
        }
    }
}
