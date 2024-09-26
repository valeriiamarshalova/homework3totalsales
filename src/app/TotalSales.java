package app;

public class TotalSales {

    static double numPrice;
    static int numQuantity;
    static double res1;

    public static void main(String[] args){

        String finishSymbol = ".";
        String product = "Product No ";
        int productNum = 1;
        String productName = ": smartphone,";
        String totalSales = "total sales for ";
        String daysIs = " days is EUR ";
        int salesNum = 5;
        String sales = "sales by day is EUR ";

        numPrice = 690.99;
        numQuantity = 17;
        res1 = numPrice * numQuantity;

        System.out.println(product + productNum + productName + "\n" +
                totalSales + salesNum + daysIs + res1 + finishSymbol + "\n" +
                sales);
    }
}
