package org.drulabs.bankbuddy.local.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0007H\'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\n\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Lorg/drulabs/bankbuddy/local/database/UserInfoDAO;", "", "addUserInfo", "", "userInfo", "Lorg/drulabs/bankbuddy/local/model/UserInfoLocal;", "clearCachedUserInfo", "Lio/reactivex/Completable;", "getUserInfo", "Lio/reactivex/Observable;", "userIdentifier", "", "local_debug"})
public abstract interface UserInfoDAO {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void addUserInfo(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.local.model.UserInfoLocal userInfo);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM user_info WHERE account_id = :userIdentifier")
    public abstract io.reactivex.Observable<org.drulabs.bankbuddy.local.model.UserInfoLocal> getUserInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String userIdentifier);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "DELETE FROM user_info")
    public abstract io.reactivex.Completable clearCachedUserInfo();
}