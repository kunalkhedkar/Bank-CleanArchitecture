package org.drulabs.bankbuddy.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\u0013\u001a\u00020\u0014H\'J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\'\u00a8\u0006\u0019"}, d2 = {"Lorg/drulabs/bankbuddy/di/PresentationModule;", "", "()V", "bindsHomeViewModel", "Landroidx/lifecycle/ViewModel;", "homeVM", "Lorg/drulabs/bankbuddy/presentation/viewmodels/HomeVM;", "bindsTransactionMapper", "Lorg/drulabs/bankbuddy/presentation/mapper/Mapper;", "Lorg/drulabs/bankbuddy/domain/entities/TransactionEntity;", "Lorg/drulabs/bankbuddy/presentation/model/Transaction;", "transactionEntityMapper", "Lorg/drulabs/bankbuddy/presentation/mapper/TransactionEntityMapper;", "bindsTransactionsViewModel", "transactionsVM", "Lorg/drulabs/bankbuddy/presentation/viewmodels/TransactionsVM;", "bindsUserInfoMapper", "Lorg/drulabs/bankbuddy/domain/entities/UserInfoEntity;", "Lorg/drulabs/bankbuddy/presentation/model/UserInfo;", "userInfoEntityMapper", "Lorg/drulabs/bankbuddy/presentation/mapper/UserInfoEntityMapper;", "bindsViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lorg/drulabs/bankbuddy/presentation/factory/ViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class PresentationModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindsViewModelFactory(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.presentation.factory.ViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = org.drulabs.bankbuddy.presentation.viewmodels.HomeVM.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindsHomeViewModel(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.presentation.viewmodels.HomeVM homeVM);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = org.drulabs.bankbuddy.presentation.viewmodels.TransactionsVM.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindsTransactionsViewModel(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.presentation.viewmodels.TransactionsVM transactionsVM);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.drulabs.bankbuddy.presentation.mapper.Mapper<org.drulabs.bankbuddy.domain.entities.UserInfoEntity, org.drulabs.bankbuddy.presentation.model.UserInfo> bindsUserInfoMapper(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.presentation.mapper.UserInfoEntityMapper userInfoEntityMapper);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.drulabs.bankbuddy.presentation.mapper.Mapper<org.drulabs.bankbuddy.domain.entities.TransactionEntity, org.drulabs.bankbuddy.presentation.model.Transaction> bindsTransactionMapper(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.presentation.mapper.TransactionEntityMapper transactionEntityMapper);
    
    public PresentationModule() {
        super();
    }
}