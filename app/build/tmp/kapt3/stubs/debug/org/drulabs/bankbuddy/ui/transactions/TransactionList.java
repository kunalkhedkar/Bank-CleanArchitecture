package org.drulabs.bankbuddy.ui.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010#\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006$"}, d2 = {"Lorg/drulabs/bankbuddy/ui/transactions/TransactionList;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/drulabs/bankbuddy/ui/transactions/TransactionsAdapter$TransactionClickListener;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "()V", "transactionListAdapter", "Lorg/drulabs/bankbuddy/ui/transactions/TransactionsAdapter;", "transactionsVM", "Lorg/drulabs/bankbuddy/presentation/viewmodels/TransactionsVM;", "viewModelFactory", "Lorg/drulabs/bankbuddy/presentation/factory/ViewModelFactory;", "getViewModelFactory", "()Lorg/drulabs/bankbuddy/presentation/factory/ViewModelFactory;", "setViewModelFactory", "(Lorg/drulabs/bankbuddy/presentation/factory/ViewModelFactory;)V", "hideLoader", "", "onCheckedChanged", "buttonView", "Landroid/widget/CompoundButton;", "isChecked", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onFlagToggled", "transaction", "Lorg/drulabs/bankbuddy/presentation/model/Transaction;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onTransactionTapped", "showLoader", "app_debug"})
public final class TransactionList extends androidx.appcompat.app.AppCompatActivity implements org.drulabs.bankbuddy.ui.transactions.TransactionsAdapter.TransactionClickListener, android.widget.CompoundButton.OnCheckedChangeListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public org.drulabs.bankbuddy.presentation.factory.ViewModelFactory viewModelFactory;
    private org.drulabs.bankbuddy.presentation.viewmodels.TransactionsVM transactionsVM;
    private final org.drulabs.bankbuddy.ui.transactions.TransactionsAdapter transactionListAdapter = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final org.drulabs.bankbuddy.presentation.factory.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.presentation.factory.ViewModelFactory p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onCheckedChanged(@org.jetbrains.annotations.Nullable()
    android.widget.CompoundButton buttonView, boolean isChecked) {
    }
    
    @java.lang.Override()
    public void onTransactionTapped(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.presentation.model.Transaction transaction) {
    }
    
    @java.lang.Override()
    public void onFlagToggled(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.presentation.model.Transaction transaction) {
    }
    
    private final void showLoader() {
    }
    
    private final void hideLoader() {
    }
    
    public TransactionList() {
        super();
    }
}