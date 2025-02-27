public class Main {
    public static void main(String[] args) {
        // Unit Test for Cash class

        // Test setup
        Exchange exchange = new FakeExchange();  
        Cash dollar = new Cash(exchange, 10000);  
        System.out.println("Dollar: " + dollar.toString());

        // Test 'in' method of Cash (Convert to Euros)
        Cash euro = dollar.in("Euro");
        System.out.println("Dollar to Euro: " + euro.toString());
    }
}

// Fake Exchange class that provides a fixed exchange rate
class FakeExchange implements Exchange {
    @Override
    public float rate(String origin, String target) {
        return 1.2f;
    }
}
