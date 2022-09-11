package com.bridzelabz;

public class Repeattillwin {
    static final int No_Play = 0;
    static final int Ladder = 1;

    public static void main(String[] args) {
       System.out.println("Welcome to Snack and ladder programs ");
        int Player_Start_Position = 0;
        while (Player_Start_Position <= 100) {
            int number_After_Rolling = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("Number of rolling after dice the player "+number_After_Rolling);
            int checkOption = (int) Math.floor(Math.random() * 10) % 6 + 1;
            switch (checkOption) {
                case No_Play:
                    System.out.println("player is not playing at the same time");
                    break;
                case Ladder:
                    Player_Start_Position += number_After_Rolling;
                    System.out.println("player move the position :" + Player_Start_Position);
                    break;
                default:
                    Player_Start_Position -= number_After_Rolling;
                    if (Player_Start_Position < 0)
                        Player_Start_Position =0;

            }
        }
        System.out.println("Snack the player bihend the position " + Player_Start_Position);
    }
}
