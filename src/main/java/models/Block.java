package models;

import java.util.Arrays;
import java.util.List;

/**
 * @author samyakjain
 * @since 05/12/21
 */
public class Block {
    private final int previousHash;

    private final int blockHash;

    private final List<Transaction> transactions;

    public Block(int previousHash, List<Transaction> transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;
        Object[] hashContent = { previousHash, Arrays.hashCode(transactions.toArray()) };
        this.blockHash = Arrays.hashCode(hashContent);
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }

    @Override
    public String toString() {
        return "\nBlock{" + "previousHash=" + previousHash + ", blockHash=" + blockHash + ", transactions=" + transactions + "}\n";
    }

}
