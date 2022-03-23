class ArrayOperations {
    public static void printTheThirdRow(int[][] twoDimArray) {
        final int rowIndex = 2;
        for (int i = 0; i < twoDimArray[rowIndex].length; i++) {
            System.out.print(twoDimArray[rowIndex][i] + " ");
        }

    }
}