package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author samyakjain
 * @since 05/12/21
 */
public class Blockchain {
    private List<Block> blockchain;

    public List<Block> getBlockchain() {
        return blockchain;
    }

    public void initialiseBlockchain() {
        blockchain = new ArrayList<>();
        final Block block = new Block(0, Collections.singletonList(new Transaction("", "", 0.0, Currency.BTC)));
        blockchain.add(block);
    }

    private void checkForInitialise() {
        if (blockchain == null || blockchain.size() == 0) {
            initialiseBlockchain();
        }
    }

    public void addBlockToBlockchain(final Block block) {
        checkForInitialise();
        blockchain.add(block);
    }

    public void addBlockToBlockchain(final List<Transaction> transactions) {
        checkForInitialise();
        final Block block = new Block(blockchain.get(blockchain.size() - 1).getBlockHash(), transactions);
        blockchain.add(block);
    }

    @Override
    public String toString() {
        return "Blockchain{" + "blockchain=" + blockchain + '}';
    }
}
