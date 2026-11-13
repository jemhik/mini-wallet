package com.kovtyka.wallet.config;

import jakarta.transaction.Transactional;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Component
public class PaymentTxService {

    @Transactional
    public void createPending() {
        TransactionSynchronizationManager.isActualTransactionActive();
        TransactionSynchronizationManager.getCurrentTransactionName();
    }
}
