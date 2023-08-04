package de.telran.practice3;

import java.util.Scanner;

public class Utils {
    public static int[][] getUserLotteryNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[][] userNumbers = new int [3][Constants.COUNT_SET_SIZE];
        for (int player = 0; player < 3; player++) {
            for (int i = 0; i < Constants.COUNT_SET_SIZE; i++){
                do {
                    System.out.print("Игрок " + (player + 1) + "; введите " + (i + 1) + " номер: ");
                    userNumbers[player][i] = scanner.nextInt();
                } while (userNumbers [player][i] <= 0 || userNumbers[player][i] > 50);
            }
        }
        return userNumbers;
    }
    public static int compareWinnerNumbers(int[] lotteryNumbers, int[] userNumbers) {
        int count = 0;
        for (int valUser : userNumbers) {
            for (int valLottery : lotteryNumbers) {
                if (valUser == valLottery) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}

