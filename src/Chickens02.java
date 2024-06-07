public class Chickens02 {
    public static void main(String[] args) {
        //Put yout code here
        
        //Declarando usando o float
        float dailyAverage=0.0F;
        float monthlyAverage = 0.0F;
        float monthlyProfit = 0.0F;
        
        //total de ovos / dias
        
        dailyAverage= (100F + 121F + 117F)/3F;
        monthlyAverage = dailyAverage * 30;
        monthlyProfit = monthlyAverage * 0.18F;
        
        
        System.out.println("Valores usando o float" );
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit + "\n");
        
        //Declarando usando o double
        double ddailyAverage =0.0;
        double dmonthlyAverage = 0.0;
        double dmonthlyProfit = 0.0;
        
        //total de ovos / dias
        
        ddailyAverage= (100.0 + 121.0 + 117.0)/3.0;
        dmonthlyAverage = dailyAverage * 30.0;
        dmonthlyProfit = monthlyAverage * 0.18;
        
        System.out.println("Valores usando o double" );
        System.out.println("Daily Average:   " +ddailyAverage);
        System.out.println("Monthly Average: " +dmonthlyAverage);
        System.out.println("Monthly Profit:  $" +dmonthlyProfit);
        
    }
    
}
