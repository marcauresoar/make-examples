package services;

public class StockServiceImpl implements StockService {
    public double calcStockPrice(String stockID) {
        System.out.println("Calculating stocks for: " + stockID);
        return 56.10;
    }
}