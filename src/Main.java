import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        playPuzzle();
    }

    public static void playPuzzle() {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int first = 0, second = 0;
        int[] puzzleArray = generatePuzzleArray(random);

        System.out.println("간단 숫자 퍼즐");
        int turn = 1;
        while (true) {
            System.out.println("Turn: " + turn);
            printPuzzleArray(puzzleArray);

            System.out.print("교환할 두 숫자를 입력> ");
            String userInput = input.nextLine();
            String[] inputs = userInput.split("\\s*,\\s*");
            first = Integer.parseInt(inputs[0]);
            second = Integer.parseInt(inputs[1]);

            System.out.printf("당신이 입력한 숫자: %d, %d%n", first, second);

            if (!isValidInput(puzzleArray, first, second)) {
                System.out.println("유효하지 않은 숫자를 입력하였습니다. 다시 입력해주세요.");
                continue;
            }

            swapNumbers(puzzleArray, first, second);

            if (isPuzzleSolved(puzzleArray)) {
                System.out.printf("축하합니다! %d턴만에 퍼즐을 완성하셨습니다!", turn);
                break;
            }
            turn++;
        }
    }

    public static int[] generatePuzzleArray(Random random) {
        int[] puzzleArray = new int[8];
        int i = 0, j = 0;

        for (i = 0; i <= 7; i++) {
            puzzleArray[i] = random.nextInt(8) + 1;
            for (j = 0; j < i; j++) {
                if (puzzleArray[i] == puzzleArray[j]) {
                    i--;
                    break;
                }
            }
        }

        return puzzleArray;
    }

    public static void printPuzzleArray(int[] puzzleArray) {
        System.out.print("[");
        System.out.print(puzzleArray[0]);
        for (int i = 1; i <= 7; i++) {
            System.out.print(", ");
            System.out.print(puzzleArray[i]);
        }
        System.out.println("]");
    }

    public static boolean isValidInput(int[] puzzleArray, int first, int second) {
        int check = 0;
        for (int i = 0; i <= 7; i++) {
            if (puzzleArray[i] == first) {
                check++;
            }
            if (puzzleArray[i] == second) {
                check++;
            }
        }
        return check == 2;
    }

    public static void swapNumbers(int[] puzzleArray, int first, int second) {
        int swap1 = -1, swap2 = -1;
        for (int i = 0; i < puzzleArray.length; i++) {
            if (puzzleArray[i] == first) {
                swap1 = i;
            }
            if (puzzleArray[i] == second) {
                swap2 = i;
            }
        }
        int temp = puzzleArray[swap1];
        puzzleArray[swap1] = puzzleArray[swap2];
        puzzleArray[swap2] = temp;
    }

    public static boolean isPuzzleSolved(int[] puzzleArray) {
        int[] answerArray = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < puzzleArray.length; i++) {
            if (puzzleArray[i] != answerArray[i]) {
                return false;
            }
        }
        return true;
    }
}
