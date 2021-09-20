interface Bank{
    float rateOfInterest();
}
class DBBL implements Bank{
    public float rateOfInterest(){
        return 5.5f;    }
}
class SBI implements Bank{
    public float rateOfInterest(){
        return 6.7f;
    }
}
class TestInterace {
    public static void main(String[] args){
        Bank B = new DBBL();
        Bank C = new SBI();
        System.out.println("DBBL interest rate: "+ B.rateOfInterest());
        System.out.println("SBI interest rate: "+ C.rateOfInterest());
        System.out.println();
    }
}
