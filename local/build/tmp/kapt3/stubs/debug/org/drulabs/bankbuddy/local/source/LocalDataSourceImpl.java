package org.drulabs.bankbuddy.local.source;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0001&B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ?\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0016\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J$\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019H\u0016J\u001e\u0010!\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lorg/drulabs/bankbuddy/local/source/LocalDataSourceImpl;", "Lorg/drulabs/bankbuddy/data/repository/LocalDataSource;", "userInfoMapper", "Lorg/drulabs/bankbuddy/local/mapper/UserInfoDataLocalMapper;", "transactionMapper", "Lorg/drulabs/bankbuddy/local/mapper/TransactionDataLocalMapper;", "userInfoDAO", "Lorg/drulabs/bankbuddy/local/database/UserInfoDAO;", "transactionDAO", "Lorg/drulabs/bankbuddy/local/database/TransactionDAO;", "(Lorg/drulabs/bankbuddy/local/mapper/UserInfoDataLocalMapper;Lorg/drulabs/bankbuddy/local/mapper/TransactionDataLocalMapper;Lorg/drulabs/bankbuddy/local/database/UserInfoDAO;Lorg/drulabs/bankbuddy/local/database/TransactionDAO;)V", "getFilteredTransactions", "Lio/reactivex/Observable;", "", "Lorg/drulabs/bankbuddy/data/model/TransactionData;", "userIdentifier", "", "credit", "", "debit", "flagged", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lio/reactivex/Observable;", "getTransaction", "transactionId", "getUserInfo", "Lorg/drulabs/bankbuddy/data/model/UserInfoData;", "identifier", "getUserTransactions", "limit", "", "saveUserInfo", "", "userInfoData", "saveUserTransactions", "transactions", "updateTransaction", "Lio/reactivex/Completable;", "transaction", "Companion", "local_debug"})
public final class LocalDataSourceImpl implements org.drulabs.bankbuddy.data.repository.LocalDataSource {
    private final org.drulabs.bankbuddy.local.mapper.UserInfoDataLocalMapper userInfoMapper = null;
    private final org.drulabs.bankbuddy.local.mapper.TransactionDataLocalMapper transactionMapper = null;
    private final org.drulabs.bankbuddy.local.database.UserInfoDAO userInfoDAO = null;
    private final org.drulabs.bankbuddy.local.database.TransactionDAO transactionDAO = null;
    private static final int DEFAULT_LIMIT = 40;
    private static final java.lang.String TYPE_CREDIT = "credit";
    private static final java.lang.String TYPE_DEBIT = "debit";
    public static final org.drulabs.bankbuddy.local.source.LocalDataSourceImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<org.drulabs.bankbuddy.data.model.UserInfoData> getUserInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier) {
        return null;
    }
    
    @java.lang.Override()
    public void saveUserInfo(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.data.model.UserInfoData userInfoData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<org.drulabs.bankbuddy.data.model.TransactionData>> getUserTransactions(@org.jetbrains.annotations.NotNull()
    java.lang.String userIdentifier, int limit) {
        return null;
    }
    
    @java.lang.Override()
    public void saveUserTransactions(@org.jetbrains.annotations.NotNull()
    java.lang.String userIdentifier, @org.jetbrains.annotations.NotNull()
    java.util.List<org.drulabs.bankbuddy.data.model.TransactionData> transactions) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<org.drulabs.bankbuddy.data.model.TransactionData> getTransaction(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<org.drulabs.bankbuddy.data.model.TransactionData>> getFilteredTransactions(@org.jetbrains.annotations.NotNull()
    java.lang.String userIdentifier, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean credit, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean debit, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean flagged) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable updateTransaction(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.data.model.TransactionData transaction) {
        return null;
    }
    
    @javax.inject.Inject()
    public LocalDataSourceImpl(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.local.mapper.UserInfoDataLocalMapper userInfoMapper, @org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.local.mapper.TransactionDataLocalMapper transactionMapper, @org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.local.database.UserInfoDAO userInfoDAO, @org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.local.database.TransactionDAO transactionDAO) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/drulabs/bankbuddy/local/source/LocalDataSourceImpl$Companion;", "", "()V", "DEFAULT_LIMIT", "", "TYPE_CREDIT", "", "TYPE_DEBIT", "local_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}