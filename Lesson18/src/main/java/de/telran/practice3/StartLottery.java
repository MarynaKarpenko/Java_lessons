package de.telran.practice3;

import java.util.Arrays;

public class StartLottery {
    public static void main(String[] args) {
        // многомерный массив
//        int countUsers = 3;
//        int[][] userLotterys = new int[countUsers][Constants.COUNT_SET_SIZE];
//        for (int i = 0; i < countUsers; i++){
//            int[] userNumbers = Utils.getUserLotteryNumbers();
//            userLotterys[i] = userNumbers;
//        }
//        for (int i = 0; i < countUsers; i++)
//            for (int j = 0; j < Constants.COUNT_SET_SIZE; j++)
//                System.out.println(userLotterys[i][j]);
        // -------

        int[][] userNumbers = Utils.getUserLotteryNumbers();
        for (int i = 0; i < 3; i++) {
            System.out.println("Игрок " + (i + 1) + ": " + Arrays.toString(userNumbers[i]));
        }


        LotteryEngine lottery = new LotteryEngine();
        lottery.runLottery();
        int[] winnerNumbers = lottery.getLuckyNumbers();
        System.out.println("Выигрышные номера: " + Arrays.toString(winnerNumbers));

        for (int player = 0; player < 3; player++) {
            System.out.println("Игрок " + (player + 1) + " совпало: " + Utils.compareWinnerNumbers(winnerNumbers,
                    userNumbers[player]));
        }

    }
}
