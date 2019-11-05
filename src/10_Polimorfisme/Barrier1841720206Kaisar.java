package Jobsheet10;

public class Barrier1841720206Kaisar implements Destroyable1841720206Kaisar{
    private int mStrength;

    public Barrier1841720206Kaisar(int strength) {
        this.mStrength = strength;
    }

    public void setStrengthKaisar(int strength) {
        this.mStrength = strength;
    }

    public int getStrengthKaisar() {
        return mStrength;
    }

    @Override
    public void destroyedKaisar() {
        this.mStrength -= (0.1 * this.mStrength);
    }
    
    public String getBarrierInfoKaisar() {
        return "Barrier Strength = " + this.mStrength;
    }   
}
