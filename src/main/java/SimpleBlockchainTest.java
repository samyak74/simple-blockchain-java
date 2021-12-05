import java.util.Collections;
import models.Blockchain;
import models.Currency;
import models.Transaction;

/**
 * @author samyakjain
 * @since 05/12/21
 */
public class SimpleBlockchainTest {
    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain();
        blockchain.initialiseBlockchain();
        blockchain.addBlockToBlockchain(Collections.singletonList(new Transaction("Samyak", "Uday", 2.1, Currency.BTC)));
        blockchain.addBlockToBlockchain(Collections.singletonList(new Transaction("Uday", "Chaitu", 2.0, Currency.USDT)));
        blockchain.addBlockToBlockchain(Collections.singletonList(new Transaction("Chaitu", "Siddhant", 6.3, Currency.ETH)));
        System.out.println(blockchain);
    }
}
