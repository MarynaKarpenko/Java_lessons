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

        int[] userNumbers = Utils.getUserLotteryNumbers();
        System.out.println(Arrays.toString(userNumbers));

        LotteryEngine lottery = new LotteryEngine();
        lottery.runLottery();
        int[] winnerNumbers = lottery.getLuckyNumbers();
        System.out.println(Arrays.toString(winnerNumbers));

        System.out.println("Совпало: " + Utils.compareWinnerNumbers(winnerNumbers, userNumbers));
    }
}
