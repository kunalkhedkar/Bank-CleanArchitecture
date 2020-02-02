package org.drulabs.bankbuddy.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lorg/drulabs/bankbuddy/di/RemoteModule;", "", "()V", "providesBankingService", "Lorg/drulabs/bankbuddy/remote/api/BankingService;", "retrofit", "Lretrofit2/Retrofit;", "providesRetrofit", "Binders", "app_debug"})
@dagger.Module(includes = {org.drulabs.bankbuddy.di.RemoteModule.Binders.class})
public final class RemoteModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final org.drulabs.bankbuddy.remote.api.BankingService providesBankingService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.Retrofit providesRetrofit() {
        return null;
    }
    
    public RemoteModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00032\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0011"}, d2 = {"Lorg/drulabs/bankbuddy/di/RemoteModule$Binders;", "", "bindTransactionMapper", "Lorg/drulabs/bankbuddy/remote/mapper/Mapper;", "Lorg/drulabs/bankbuddy/data/model/TransactionData;", "Lorg/drulabs/bankbuddy/remote/model/TransactionNetwork;", "transactionMapper", "Lorg/drulabs/bankbuddy/remote/mapper/TransactionDataNetworkMapper;", "bindUserInfoMapper", "Lorg/drulabs/bankbuddy/data/model/UserInfoData;", "Lorg/drulabs/bankbuddy/remote/model/UserInfoNetwork;", "userInfoMapper", "Lorg/drulabs/bankbuddy/remote/mapper/UserInfoDataNetworkMapper;", "bindsRemoteSource", "Lorg/drulabs/bankbuddy/data/repository/RemoteDataSource;", "remoteDataSourceImpl", "Lorg/drulabs/bankbuddy/remote/source/RemoteDataSourceImpl;", "app_debug"})
    @dagger.Module()
    public static abstract interface Binders {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract org.drulabs.bankbuddy.data.repository.RemoteDataSource bindsRemoteSource(@org.jetbrains.annotations.NotNull()
        org.drulabs.bankbuddy.remote.source.RemoteDataSourceImpl remoteDataSourceImpl);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract org.drulabs.bankbuddy.remote.mapper.Mapper<org.drulabs.bankbuddy.data.model.UserInfoData, org.drulabs.bankbuddy.remote.model.UserInfoNetwork> bindUserInfoMapper(@org.jetbrains.annotations.NotNull()
        org.drulabs.bankbuddy.remote.mapper.UserInfoDataNetworkMapper userInfoMapper);
        
        @org.jetbrains.annotations.NotNull()
        @dagger.Binds()
        public abstract org.drulabs.bankbuddy.remote.mapper.Mapper<org.drulabs.bankbuddy.data.model.TransactionData, org.drulabs.bankbuddy.remote.model.TransactionNetwork> bindTransactionMapper(@org.jetbrains.annotations.NotNull()
        org.drulabs.bankbuddy.remote.mapper.TransactionDataNetworkMapper transactionMapper);
    }
}