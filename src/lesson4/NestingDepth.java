package lesson4;

public class NestingDepth {

    static int depthNesting(String s) {
        int maxCurrent = 0;
        int maxOverall = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                maxCurrent++;

                if (maxCurrent > maxOverall) {
                    maxOverall = maxCurrent;
                }
            } else if (s.charAt(i) == ')') {
                if (maxCurrent > 0) {
                    maxCurrent--;
                } else {
                    return -1;
                }
            }
        }

        if (maxCurrent != 0) {
            return -1;
        }

        return maxOverall;
    }


    public static void main(String[] args) {

        String s = "1 + (((((2+3)))))";
        System.out.println(depthNesting(s));
    }
}