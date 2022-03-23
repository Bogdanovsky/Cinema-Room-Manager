class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        int firstRowLength = twoDimArray[0].length;
        int rows = twoDimArray.length;
        int lastRowlength = twoDimArray[rows - 1].length;

        System.out.print(twoDimArray[0][0] + " ");
        System.out.println(twoDimArray[0][firstRowLength - 1]);
        System.out.print(twoDimArray[rows - 1][0] + " ");
        System.out.print(twoDimArray[rows - 1][lastRowlength - 1]);

    }
}