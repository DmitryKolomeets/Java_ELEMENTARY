package lesson4;

public class ArrayComparison {

    public boolean ifArraysEqual(String[] word1, String[] word2) {
        String rowSum1 = "";
        String rowSum2 = "";

        for (int i = 0; i < word1.length; i++)
            rowSum1 += word1[i];

        for (int i = 0; i < word2.length; i++)
            rowSum2 += word2[i];

        System.out.println();
        System.out.println("Are our arrays equal ? - " + rowSum1.equals(rowSum2));

        return rowSum1.equals(rowSum2);
    }


    public static void main(String[] args) {

        String word1[] = new String[]{"ab", "c"};
        String word2[] = new String[]{"a", "bc"};

        ArrayComparison comparison1 = new ArrayComparison();
        comparison1.ifArraysEqual(word1, word2);

        String word3[] = new String[]{"abgf", "c"};
        String word4[] = new String[]{"afg", "bc"};

        ArrayComparison comparison2 = new ArrayComparison();
        comparison2.ifArraysEqual(word3, word4);

    }
}


