package org.drulabs.bankbuddy.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\r\u0010\u0007\u001a\u00020\bH!\u00a2\u0006\u0002\b\tJ\r\u0010\n\u001a\u00020\u000bH!\u00a2\u0006\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lorg/drulabs/bankbuddy/di/AppModule;", "", "()V", "bindContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "contributesMainActivity", "Lorg/drulabs/bankbuddy/ui/home/HomeActivity;", "contributesMainActivity$app_debug", "contributesTransactionList", "Lorg/drulabs/bankbuddy/ui/transactions/TransactionList;", "contributesTransactionList$app_debug", "app_debug"})
@dagger.Module()
public abstract class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract android.content.Context bindContext(@org.jetbrains.annotations.NotNull()
    android.app.Application application);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract org.drulabs.bankbuddy.ui.home.HomeActivity contributesMainActivity$app_debug();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract org.drulabs.bankbuddy.ui.transactions.TransactionList contributesTransactionList$app_debug();
    
    public AppModule() {
        super();
    }
}