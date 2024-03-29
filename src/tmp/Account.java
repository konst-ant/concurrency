package tmp;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by kantipin on 28.05.2016.
 */
public class Account {
    AtomicLong balance;

    public Account() {
        balance = new AtomicLong();
    }

    public long getBalance() {
        return balance.get();
    }

    public void setBalance(long balance) {
        this.balance.set(balance);
    }

    public void addAmount(long amount) {
        balance.addAndGet(amount);
    }

    public void subtractAmount(long amount) {
        balance.addAndGet(-amount);
    }
}
