package org.drulabs.bankbuddy.presentation.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B=\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ/\u0010 \u001a\u00020!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010#\u00a2\u0006\u0002\u0010&J\b\u0010\'\u001a\u00020!H\u0014J\b\u0010(\u001a\u00020!H\u0002J\u0006\u0010)\u001a\u00020!J\u000e\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020\u0007R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000Rb\u0010\u0015\u001aV\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0018 \u0019*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0018\u0018\u00010\u00170\u0017 \u0019**\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0018 \u0019*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0018\u0018\u00010\u00170\u0017\u0018\u00010\u00160\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00180\u00170\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00180\u00170\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R4\u0010\u001f\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0018 \u0019*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0018\u0018\u00010\u00170\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lorg/drulabs/bankbuddy/presentation/viewmodels/TransactionsVM;", "Landroidx/lifecycle/ViewModel;", "userIdentifier", "", "transactionMapper", "Lorg/drulabs/bankbuddy/presentation/mapper/Mapper;", "Lorg/drulabs/bankbuddy/domain/entities/TransactionEntity;", "Lorg/drulabs/bankbuddy/presentation/model/Transaction;", "getUserTransactionsTask", "Lorg/drulabs/bankbuddy/domain/usecases/GetUserTransactionsTask;", "filterTransactionsTask", "Lorg/drulabs/bankbuddy/domain/usecases/FilterTransactionsTask;", "transactionStatusUpdaterTask", "Lorg/drulabs/bankbuddy/domain/usecases/TransactionStatusUpdaterTask;", "(Ljava/lang/String;Lorg/drulabs/bankbuddy/presentation/mapper/Mapper;Lorg/drulabs/bankbuddy/domain/usecases/GetUserTransactionsTask;Lorg/drulabs/bankbuddy/domain/usecases/FilterTransactionsTask;Lorg/drulabs/bankbuddy/domain/usecases/TransactionStatusUpdaterTask;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "filterRequest", "Lorg/drulabs/bankbuddy/domain/usecases/FilterTransactionsTask$Params;", "filterRequestLiveData", "Landroidx/lifecycle/MutableLiveData;", "filteredTransactions", "Landroidx/lifecycle/LiveData;", "Lorg/drulabs/bankbuddy/presentation/model/Resource;", "", "kotlin.jvm.PlatformType", "transactionListSource", "getTransactionListSource", "()Landroidx/lifecycle/LiveData;", "transactionMediator", "Landroidx/lifecycle/MediatorLiveData;", "transactionResource", "filterTransactions", "", "credit", "", "debit", "flagged", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "onCleared", "resetFilterOptions", "resetFilters", "toggleFlaggedStatus", "transaction", "presentation_debug"})
public final class TransactionsVM extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<org.drulabs.bankbuddy.domain.usecases.FilterTransactionsTask.Params> filterRequestLiveData = null;
    private org.drulabs.bankbuddy.domain.usecases.FilterTransactionsTask.Params filterRequest;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final androidx.lifecycle.MediatorLiveData<org.drulabs.bankbuddy.presentation.model.Resource<java.util.List<org.drulabs.bankbuddy.presentation.model.Transaction>>> transactionMediator = null;
    private final androidx.lifecycle.LiveData<org.drulabs.bankbuddy.presentation.model.Resource<java.util.List<org.drulabs.bankbuddy.presentation.model.Transaction>>> transactionResource = null;
    private final androidx.lifecycle.LiveData<org.drulabs.bankbuddy.presentation.model.Resource<java.util.List<org.drulabs.bankbuddy.presentation.model.Transaction>>> filteredTransactions = null;
    private final org.drulabs.bankbuddy.presentation.mapper.Mapper<org.drulabs.bankbuddy.domain.entities.TransactionEntity, org.drulabs.bankbuddy.presentation.model.Transaction> transactionMapper = null;
    private final org.drulabs.bankbuddy.domain.usecases.FilterTransactionsTask filterTransactionsTask = null;
    private final org.drulabs.bankbuddy.domain.usecases.TransactionStatusUpdaterTask transactionStatusUpdaterTask = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.drulabs.bankbuddy.presentation.model.Resource<java.util.List<org.drulabs.bankbuddy.presentation.model.Transaction>>> getTransactionListSource() {
        return null;
    }
    
    public final void filterTransactions(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean credit, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean debit, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean flagged) {
    }
    
    public final void toggleFlaggedStatus(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.presentation.model.Transaction transaction) {
    }
    
    public final void resetFilters() {
    }
    
    private final void resetFilterOptions() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public TransactionsVM(@org.jetbrains.annotations.NotNull()
    @org.drulabs.bankbuddy.presentation.qualifier.UserIdentity()
    java.lang.String userIdentifier, @org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.presentation.mapper.Mapper<org.drulabs.bankbuddy.domain.entities.TransactionEntity, org.drulabs.bankbuddy.presentation.model.Transaction> transactionMapper, @org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.domain.usecases.GetUserTransactionsTask getUserTransactionsTask, @org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.domain.usecases.FilterTransactionsTask filterTransactionsTask, @org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.domain.usecases.TransactionStatusUpdaterTask transactionStatusUpdaterTask) {
        super();
    }
}