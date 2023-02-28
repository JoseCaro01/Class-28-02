package exercise_interfaces;

import java.time.LocalDate;
import java.util.ArrayList;

public interface TransactionList {

    Transaction getLastTransaction();

    void addTransaction(Transaction transaction);

    Transaction getTrasactionByDate(LocalDate localDate);

    ArrayList<Transaction> getAllTransactions();
}
