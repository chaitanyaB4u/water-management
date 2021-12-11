package apartment;

public class ThreeBHK implements Apartment {
     private  int  noOfLiters;
    private  int corporationWater;
    private  int borewellWater;
    private final Helper helper;


    public ThreeBHK(int corporationWater, int borewellWater) {
        this.corporationWater = corporationWater;
        this.borewellWater = borewellWater;
        this.noOfLiters=1500;
        this.helper=new Helper(this.corporationWater,this.borewellWater,this.noOfLiters);
    }



    public int totalWaterConsume() {
        return helper.totalWaterConsume();
    }

    public int totalBill() {
        return helper.totalBill();
    }

}
