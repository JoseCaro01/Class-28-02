package exercise_interfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PaymentList implements TransactionList {


    // Transaction[] transactions = new Transaction[0];
    ArrayList<Transaction> transactionList = new ArrayList<>();

    public PaymentList(ArrayList<Transaction> transactionList) {

       setTransactionList(transactionList);
    }

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(ArrayList<Transaction> transactionList) {
        if (transactionList != null) {
            this.transactionList = transactionList;
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public Transaction getLastTransaction() {

        if (transactionList.size() > 1) {
            return transactionList.get(transactionList.size() - 1);
        } else {
            return null;
        }
    }


    @Override
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    @Override
    public Transaction getTrasactionByDate(LocalDate localDate) {
        for (Transaction hola : transactionList) {
            if (hola.getDate().isEqual(localDate)) {
                return hola;
            }
        }
        return null;

    }

    @Override
    public ArrayList<Transaction> getAllTransactions() {
        return transactionList;
    }
}
