package JavaCA.service;

import java.util.List;

import JavaCA.model.Transaction;
import JavaCA.model.TransactionDetail;

public interface TransactionInterface 
{
	List<Transaction> listAllTransactions();
	List<Transaction> listAllCarTransactions();
	List<TransactionDetail> listAllProductTransactions(int id);
	Transaction findTransactionById(long id);
	void saveTransaction(Transaction transaction);
	void deleteTransaction(Transaction transaction);
}
