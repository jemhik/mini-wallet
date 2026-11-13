package com.kovtyka.wallet.service.impl;

import com.kovtyka.wallet.service.PaymentService;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void pay() {
        createPending();
    }

    @Override
    @Transactional
    public void createPending() {
        TransactionSynchronizationManager.isActualTransactionActive();
        TransactionSynchronizationManager.getCurrentTransactionName();
    }
}
