package org.drulabs.bankbuddy.presentation.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lorg/drulabs/bankbuddy/presentation/viewmodels/HomeVM;", "Landroidx/lifecycle/ViewModel;", "userIdentifier", "", "userInfoMapper", "Lorg/drulabs/bankbuddy/presentation/mapper/Mapper;", "Lorg/drulabs/bankbuddy/domain/entities/UserInfoEntity;", "Lorg/drulabs/bankbuddy/presentation/model/UserInfo;", "getUserInfoTask", "Lorg/drulabs/bankbuddy/domain/usecases/GetUserInfoTask;", "(Ljava/lang/String;Lorg/drulabs/bankbuddy/presentation/mapper/Mapper;Lorg/drulabs/bankbuddy/domain/usecases/GetUserInfoTask;)V", "userInfoResource", "Landroidx/lifecycle/LiveData;", "Lorg/drulabs/bankbuddy/presentation/model/Resource;", "getUserInfoResource", "()Landroidx/lifecycle/LiveData;", "presentation_debug"})
public final class HomeVM extends androidx.lifecycle.ViewModel {
    private final java.lang.String userIdentifier = null;
    private final org.drulabs.bankbuddy.presentation.mapper.Mapper<org.drulabs.bankbuddy.domain.entities.UserInfoEntity, org.drulabs.bankbuddy.presentation.model.UserInfo> userInfoMapper = null;
    private final org.drulabs.bankbuddy.domain.usecases.GetUserInfoTask getUserInfoTask = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<org.drulabs.bankbuddy.presentation.model.Resource<org.drulabs.bankbuddy.presentation.model.UserInfo>> getUserInfoResource() {
        return null;
    }
    
    @javax.inject.Inject()
    public HomeVM(@org.jetbrains.annotations.NotNull()
    @org.drulabs.bankbuddy.presentation.qualifier.UserIdentity()
    java.lang.String userIdentifier, @org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.presentation.mapper.Mapper<org.drulabs.bankbuddy.domain.entities.UserInfoEntity, org.drulabs.bankbuddy.presentation.model.UserInfo> userInfoMapper, @org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.domain.usecases.GetUserInfoTask getUserInfoTask) {
        super();
    }
}