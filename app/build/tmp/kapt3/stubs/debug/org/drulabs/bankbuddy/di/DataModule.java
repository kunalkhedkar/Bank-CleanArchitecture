package org.drulabs.bankbuddy.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\fH\'J\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u000b\u001a\u00020\u0010H\'\u00a8\u0006\u0011"}, d2 = {"Lorg/drulabs/bankbuddy/di/DataModule;", "", "()V", "bindsRepository", "Lorg/drulabs/bankbuddy/domain/repository/BankingRepository;", "repoImpl", "Lorg/drulabs/bankbuddy/data/repository/BankingRepositoryImpl;", "bindsTransactionMapper", "Lorg/drulabs/bankbuddy/data/mapper/Mapper;", "Lorg/drulabs/bankbuddy/domain/entities/TransactionEntity;", "Lorg/drulabs/bankbuddy/data/model/TransactionData;", "mapper", "Lorg/drulabs/bankbuddy/data/mapper/TransactionDomainDataMapper;", "bindsUserMapper", "Lorg/drulabs/bankbuddy/domain/entities/UserInfoEntity;", "Lorg/drulabs/bankbuddy/data/model/UserInfoData;", "Lorg/drulabs/bankbuddy/data/mapper/UserInfoDomainDataMapper;", "app_debug"})
@dagger.Module()
public abstract class DataModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.drulabs.bankbuddy.domain.repository.BankingRepository bindsRepository(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.data.repository.BankingRepositoryImpl repoImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.drulabs.bankbuddy.data.mapper.Mapper<org.drulabs.bankbuddy.domain.entities.UserInfoEntity, org.drulabs.bankbuddy.data.model.UserInfoData> bindsUserMapper(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.data.mapper.UserInfoDomainDataMapper mapper);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract org.drulabs.bankbuddy.data.mapper.Mapper<org.drulabs.bankbuddy.domain.entities.TransactionEntity, org.drulabs.bankbuddy.data.model.TransactionData> bindsTransactionMapper(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.data.mapper.TransactionDomainDataMapper mapper);
    
    public DataModule() {
        super();
    }
}