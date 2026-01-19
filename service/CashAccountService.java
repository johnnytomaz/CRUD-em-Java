package service;


import pojo.CashAccount;
import pojo.TradeAccount;
import repository.TradeAccountRepository;

import java.math.BigDecimal;

public class CashAccountService implements TradeAccountService {

    private TradeAccountRepository tradeAccountRepository;

    public CashAccountService(TradeAccountRepository tradeAccountRepository) {
        this.tradeAccountRepository = tradeAccountRepository;
    }

    public void createTradeAccount(CashAccount cashAccount) {

        this.tradeAccountRepository.createTradeAccount(cashAccount);
    }

    public CashAccount retrieveTradeAccount(String id) {

        return (CashAccount) this.tradeAccountRepository.retrieveTradeAccount(id);
    }

    public void updateTradeAccount(CashAccount cashAccount){
        this.tradeAccountRepository.updateTradeAccount(cashAccount);
    }

    public void deleteTradeAccount(String id){
        this.tradeAccountRepository.deleteTradeAccount(id);
    }

    @Override
    public void deposit(String id, BigDecimal amount) {
        CashAccount account = retrieveTradeAccount(id);
        account.setCashBalance(account.getCashBalance().add(amount));
        updateTradeAccount(account);
    }

    @Override
    public void withdraw(String id, BigDecimal amount) {
        CashAccount account = retrieveTradeAccount(id);
        account.setCashBalance(account.getCashBalance().subtract(amount));
        updateTradeAccount(account);
    }
}
