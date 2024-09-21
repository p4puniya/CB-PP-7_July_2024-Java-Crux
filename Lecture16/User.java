package Lecture16;

class User {
    public static class Inner{
        public Inner(){};
        public static void main(String[] args) {
            // SBI sbi= new SBI();
            // Pnb pnb= new Pnb();
    
            // sbi.interestRate();
            // pnb.interestRate();
            User user= new User();
            Inner user2= new Inner();
            Inner.SecondInnerClass user3= new Inner.SecondInnerClass();
        }
        public static class SecondInnerClass{
            public SecondInnerClass(){};
        }
    }
    
    
    
}