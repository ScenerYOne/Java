public class Choice {
    public static void main(String[] args) {
        int[][] studentAnswer = {
            {1, 2, 1, 3, 3, 4, 5, 5, 1, 4},
            {4, 2, 1, 2, 3, 1, 5, 5, 1, 4},
            {5, 4, 4, 1, 3, 2, 5, 5, 1, 4},
            {3, 2, 1, 5, 4, 3, 5, 5, 1, 4},
            {1, 2, 4, 3, 3, 4, 5, 5, 1, 4},
            {2, 2, 5, 3, 3, 4, 5, 5, 1, 4},
            {2, 2, 1, 3, 3, 4, 5, 5, 1, 4},
            {5, 2, 5, 3, 3, 4, 5, 5, 1, 4}
        };

        int[] key = {4, 2, 4, 3, 3, 4, 1, 5, 1, 4};
        int[] v = new int[studentAnswer.length];

        for (int i = 0; i < studentAnswer.length; i++) {
            for (int j = 0; j < studentAnswer[i].length; j++) {
                if (studentAnswer[i][j] == key[j]) {
                    v[i] += 1;
                }
            }
            System.out.println("Student " + i + " Answers to the Question : " + v[i]);
        }
    }
}