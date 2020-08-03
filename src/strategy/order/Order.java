package strategy.order;


import strategy.strategies.PayStrategy;

/**
 * Класс заказа. Ничего не знает о том каким способом (стратегий) будет
 * расчитываться клиент, а просто вызывает метод оплаты. Все остальное
 * делает стратегия
 */
public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
