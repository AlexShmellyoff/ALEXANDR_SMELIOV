package homework_nr_12;


public enum FuelTypes {
    GASOLINE(true),
    DIESEL(true),
    LPG(false);

    boolean isLiquid;

    FuelTypes(boolean isLiquid) {
        this.isLiquid = isLiquid;
    }

    public boolean isLiquidFuel() {
        return isLiquid;
    }
}