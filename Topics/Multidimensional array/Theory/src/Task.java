// You can experiment here, it won’t be checked

import java.util.Arrays;

public class Task {
  public static void main(String[] args) {
    int[][][] cubeArray = new int[2][2][2];
    for (int i = 0; i < cubeArray.length; i++) {
      for (int j = 0; j < cubeArray[i].length; j++) {
        for (int k = 0; k < cubeArray[i][j].length; k++) {
          cubeArray[i][j][k] = i + j + k;
          System.out.println(cubeArray[i][j][k]);
        }
        System.out.println(Arrays.toString(cubeArray[i][j]));
      }
      System.out.println(Arrays.toString(cubeArray[i]));
    }
    System.out.println(Arrays.toString(cubeArray));
  }
}
