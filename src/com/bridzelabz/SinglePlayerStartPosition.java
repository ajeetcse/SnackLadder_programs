package com.bridzelabz;

public class SinglePlayerStartPosition {
    public static void main(String[] args) {
        System.out.println("Snack And Ladder");
        int PlayerPosition = 0;
        int AfterRolling = (int)Math.floor(Math.random() * 10) % 6+1;
        System.out.println(AfterRolling);
    }
}
