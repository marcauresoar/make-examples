import services.StockService;
import services.StockServiceImpl;

class Program {
    public static void main(String[] args) {
        System.out.println("Inicializing program...");

        String stockID = "Amazon";

        StockService stockService = new StockServiceImpl();
        double price = stockService.calcStockPrice(stockID);
        System.out.println("Stock price for " + stockID + " is: " + price);
    }
}