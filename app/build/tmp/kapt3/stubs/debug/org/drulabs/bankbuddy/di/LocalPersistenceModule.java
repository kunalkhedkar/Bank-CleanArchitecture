package org.drulabs.bankbuddy.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\r"}, d2 = {"Lorg/drulabs/bankbuddy/di/LocalPersistenceModule;", "", "()V", "providesDatabase", "Lorg/drulabs/bankbuddy/local/database/BankBuddyDB;", "application", "Landroid/app/Application;", "providesTransactionDAO", "Lorg/drulabs/bankbuddy/local/database/TransactionDAO;", "bankBuddyDB", "providesUserInfoDAO", "Lorg/drulabs/bankbuddy/local/database/UserInfoDAO;", "Binders", "app_debug"})
@dagger.Module(includes = {org.drulabs.bankbuddy.di.LocalPersistenceModule.Binders.class})
public final class LocalPersistenceModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final org.drulabs.bankbuddy.local.database.BankBuddyDB providesDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final org.drulabs.bankbuddy.local.database.UserInfoDAO providesUserInfoDAO(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.local.database.BankBuddyDB bankBuddyDB) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final org.drulabs.bankbuddy.local.database.TransactionDAO providesTransactionDAO(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.local.database.BankBuddyDB bankBuddyDB) {
        return null;
    }
    
    public LocalPersistenceModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0011"}, d2 = {"Lorg/drulabs/bankbuddy/di/LocalPersistenceModule$Binders;", "", "bindTransactionMapper", "Lorg/drulabs/bankbuddy/local/mapper/Mapper;", "Lorg/drulabs/bankbuddy/data/model/TransactionData;", "Lorg/drulabs/bankbuddy/local/model/TransactionLocal;", "transactionMapper", "Lorg/drulabs/bankbuddy/local/mapper/TransactionDataLocalMapper;", "bindUserInfoMapper", "Lorg/drulabs/bankbuddy/data/model/UserInfoData;", "Lorg/drulabs/bankbuddy/local/model/UserInfoLocal;", "userInfoMapper", "Lorg/drulabs/bankbuddy/local/mapper/UserInfoDataLocalMapper;", "bindsLocalDataSource", "Lorg/drulabs/bankbuddy/data/repository/LocalDataSource;", "localDataSourceImpl", "Lorg/drulabs/bankbuddy/local/source/LocalDataSourceImpl;", "app_debug"})
    @dagger.Module()
    public static abstract interface Binders {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract org.drulabs.bankbuddy.data.repository.LocalDataSource bindsLocalDataSource(@org.jetbrains.annotations.NotNull()
        org.drulabs.bankbuddy.local.source.LocalDataSourceImpl localDataSourceImpl);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract org.drulabs.bankbuddy.local.mapper.Mapper<org.drulabs.bankbuddy.data.model.UserInfoData, org.drulabs.bankbuddy.local.model.UserInfoLocal> bindUserInfoMapper(@org.jetbrains.annotations.NotNull()
        org.drulabs.bankbuddy.local.mapper.UserInfoDataLocalMapper userInfoMapper);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract org.drulabs.bankbuddy.local.mapper.Mapper<org.drulabs.bankbuddy.data.model.TransactionData, org.drulabs.bankbuddy.local.model.TransactionLocal> bindTransactionMapper(@org.jetbrains.annotations.NotNull()
        org.drulabs.bankbuddy.local.mapper.TransactionDataLocalMapper transactionMapper);
    }
}