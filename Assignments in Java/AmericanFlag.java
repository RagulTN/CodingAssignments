public class AmericanFlag {
    public static void main(String[] args) {
        for(int i = 0 ; i<6 ; i++){
            for(int j=0 ; j<30 ; j++){
                if(j<6){
                    System.out.print("*");
                }
                else{
                    System.out.print("=");
                }
            }
            System.out.println();

        }
        for (int i = 0; i < 6 ; i++) {
            for (int j = 0; j < 30 ; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
