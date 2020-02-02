package org.drulabs.bankbuddy.local.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\b\u0010\u0007\u001a\u00020\bH\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u000b\u001a\u00020\fH\'J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\n2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0006H\'\u00a8\u0006\u0012"}, d2 = {"Lorg/drulabs/bankbuddy/local/database/TransactionDAO;", "", "addTransactions", "", "transactions", "", "Lorg/drulabs/bankbuddy/local/model/TransactionLocal;", "clearCachedTransactions", "Lio/reactivex/Completable;", "getTransactionById", "Lio/reactivex/Observable;", "transactionId", "", "getUserTransactions", "limit", "", "updateTransaction", "transaction", "local_debug"})
public abstract interface TransactionDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM transactions ORDER BY transaction_timestamp DESC LIMIT :limit")
    public abstract io.reactivex.Observable<java.util.List<org.drulabs.bankbuddy.local.model.TransactionLocal>> getUserTransactions(int limit);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Update()
    public abstract io.reactivex.Completable updateTransaction(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.local.model.TransactionLocal transaction);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void addTransactions(@org.jetbrains.annotations.NotNull()
    java.util.List<org.drulabs.bankbuddy.local.model.TransactionLocal> transactions);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM transactions WHERE transaction_id = :transactionId")
    public abstract io.reactivex.Observable<org.drulabs.bankbuddy.local.model.TransactionLocal> getTransactionById(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "DELETE FROM transactions")
    public abstract io.reactivex.Completable clearCachedTransactions();
}