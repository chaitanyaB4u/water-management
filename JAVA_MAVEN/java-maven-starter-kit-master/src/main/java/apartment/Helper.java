package apartment;

public class Helper {
    private final int  noOfLiters;
    private final int corporationWater;
    private final int borewellWater;
    public Helper(int corporationWater, int borewellWater,int noOfLiters) {
        this.corporationWater = corporationWater;
        this.borewellWater = borewellWater;
        this.noOfLiters=noOfLiters;
    }
    public int ratio() {
        return noOfLiters / (corporationWater + borewellWater);
    }

    public int totalConsumeCorporateWater() {
        return ratio() * corporationWater;
    }

    public int totalConsumeBorewellWater() {
        return ratio() * borewellWater;
    }

    public int totalWaterConsume() {
        return totalConsumeBorewellWater() + totalConsumeCorporateWater();
    }

    public int totalBill() {

        return (int) (totalConsumeCorporateWater() + totalConsumeBorewellWater() * 1.5);
    }
}
