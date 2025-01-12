package Logic;

public class Logic {

    private static boolean[][] valueX = new boolean[3][3];
    private static boolean[][] value0 = new boolean[3][3];
    private static boolean flag;       // false - X; true - 0;

    public static String writeToField(int i, int j) {
        if (checkingYourWinnings()) {
            return null;
        }
        if ((!value0[i][j]) && (!valueX[i][j])) {
            if (flag) {
                value0[i][j] = true;
                flag = false;
                return "0";
            } else {
                valueX[i][j] = true;
                flag = true;
                return "X";
            }
        } else if (value0[i][j]) {
            return "0";
        } else {
            return "X";
        }

    }

    public static Boolean checkingYourWinnings() {
        if ((checkingYourWinning(value0)) || (checkingYourWinning(valueX))) {
            return true;
        }
        return false;
    }

    public static Boolean checkFullField() {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (valueX[i][j]) {
                    count++;
                }
            }
        }
        if (count == 5) {
            return true;
        }
        return false;
    }

    public static Boolean checkingYourWinning(boolean[][] value) {
        for (int i = 0; i < 3; i++) {
            if (((value[i][0] == value[i][1]) && (value[i][0] == value[i][2]) && (value[i][0]))
                    || ((value[0][i] == value[1][i]) && (value[0][i] == value[2][i]) && (value[0][i]))
                    || ((value[0][0] == value[1][1]) && (value[0][0] == value[2][2]) && (value[0][0]))
                    || ((value[0][2] == value[1][1]) && (value[0][2] == value[2][0]) && (value[0][2]))) {
                return true;
            }
        }
        return false;
    }

    public static void deleteField() {
        flag = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                value0[i][j] = false;
                valueX[i][j] = false;
            }
        }
    }

    public static boolean isFlag() {
        return flag;
    }
}
