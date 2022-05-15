package com.company;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        for (int i = 0; i <= bigCount; i++) {
            int bigWeight = i * 5;
            if(bigWeight == goal) {
                return true;
            } else {
                for (int j = 0; j <= smallCount; j++) {
                    if (bigWeight + j == goal) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
