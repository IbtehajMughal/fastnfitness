package com.easyfitness.enums;

public enum WeightUnit {
    KG("Kg"),
    LBS("Lbs"),
    STONES("St");

    private String mDisplayName = "";

    //Constructeur
    WeightUnit(String displayName){
        this.mDisplayName = displayName;
    }

    public String toString(){
        return mDisplayName;
    }

    public static WeightUnit fromInteger(int x) {
        switch(x) {
            case 0:
                return KG;
            case 1:
                return LBS;
            case 2:
                return STONES;
        }
        return null;
    }

    public static WeightUnit fromString(String x) {
        if (x.equals(KG.mDisplayName)) return KG;
        else if (x.equals(LBS.mDisplayName)) return LBS;
        else if (x.equals(STONES.mDisplayName)) return STONES;
        return null;
    }
}
