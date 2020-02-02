package org.drulabs.bankbuddy.ui.transactions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0016\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/drulabs/bankbuddy/ui/transactions/TransactionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/drulabs/bankbuddy/ui/transactions/TransactionsAdapter$TransactionVH;", "listener", "Lorg/drulabs/bankbuddy/ui/transactions/TransactionsAdapter$TransactionClickListener;", "(Lorg/drulabs/bankbuddy/ui/transactions/TransactionsAdapter$TransactionClickListener;)V", "transactionList", "", "Lorg/drulabs/bankbuddy/presentation/model/Transaction;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "populate", "transactions", "", "TransactionClickListener", "TransactionVH", "app_debug"})
public final class TransactionsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.drulabs.bankbuddy.ui.transactions.TransactionsAdapter.TransactionVH> {
    private final java.util.List<org.drulabs.bankbuddy.presentation.model.Transaction> transactionList = null;
    private final org.drulabs.bankbuddy.ui.transactions.TransactionsAdapter.TransactionClickListener listener = null;
    
    public final void populate(@org.jetbrains.annotations.NotNull()
    java.util.List<org.drulabs.bankbuddy.presentation.model.Transaction> transactions) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.drulabs.bankbuddy.ui.transactions.TransactionsAdapter.TransactionVH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.ui.transactions.TransactionsAdapter.TransactionVH holder, int position) {
    }
    
    public TransactionsAdapter(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.ui.transactions.TransactionsAdapter.TransactionClickListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lorg/drulabs/bankbuddy/ui/transactions/TransactionsAdapter$TransactionVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lorg/drulabs/bankbuddy/ui/transactions/TransactionsAdapter;Landroid/view/View;)V", "bind", "", "transaction", "Lorg/drulabs/bankbuddy/presentation/model/Transaction;", "app_debug"})
    public final class TransactionVH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        org.drulabs.bankbuddy.presentation.model.Transaction transaction) {
        }
        
        public TransactionVH(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lorg/drulabs/bankbuddy/ui/transactions/TransactionsAdapter$TransactionClickListener;", "", "onFlagToggled", "", "transaction", "Lorg/drulabs/bankbuddy/presentation/model/Transaction;", "onTransactionTapped", "app_debug"})
    public static abstract interface TransactionClickListener {
        
        public abstract void onTransactionTapped(@org.jetbrains.annotations.NotNull()
        org.drulabs.bankbuddy.presentation.model.Transaction transaction);
        
        public abstract void onFlagToggled(@org.jetbrains.annotations.NotNull()
        org.drulabs.bankbuddy.presentation.model.Transaction transaction);
    }
}