package Oops;

interface Bank{
    float rateOfInterest();
}
class sbi implements Bank{
    public float rateOfInterest(){
        return 9.15f;
    }
//    class PNB implements Bank{
//        public float reteOfIONterset(){
//            return 9.7f;
//        
//    }
//}
    class BankInterface{
        public static void main(String[] args) {
          sbi s = new sbi();
          s.rateOfInterest();
        
            System.out.println("BOI" + s.rateOfInterest());
        }
    }
}
