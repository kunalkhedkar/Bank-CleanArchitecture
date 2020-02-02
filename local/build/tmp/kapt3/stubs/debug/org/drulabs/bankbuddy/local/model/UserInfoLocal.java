package org.drulabs.bankbuddy.local.model;

import java.lang.System;

@androidx.room.Entity(tableName = "user_info")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00c6\u0003J\t\u0010 \u001a\u00020\nH\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\rH\u00c6\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\rH\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006("}, d2 = {"Lorg/drulabs/bankbuddy/local/model/UserInfoLocal;", "", "accountNumber", "", "displayName", "address", "displayableJoinDate", "premiumCustomer", "", "accountBalance", "", "accountType", "unbilledTransactionCount", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZDLjava/lang/String;I)V", "getAccountBalance", "()D", "getAccountNumber", "()Ljava/lang/String;", "getAccountType", "getAddress", "getDisplayName", "getDisplayableJoinDate", "getPremiumCustomer", "()Z", "getUnbilledTransactionCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "local_debug"})
public final class UserInfoLocal {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "account_id")
    @androidx.room.PrimaryKey()
    private final java.lang.String accountNumber = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "display_name")
    private final java.lang.String displayName = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "user_address")
    private final java.lang.String address = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "join_date")
    private final java.lang.String displayableJoinDate = null;
    @androidx.room.ColumnInfo(name = "is_premium_customer")
    private final boolean premiumCustomer = false;
    @androidx.room.ColumnInfo(name = "account_balance")
    private final double accountBalance = 0.0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "type")
    private final java.lang.String accountType = null;
    @androidx.room.ColumnInfo(name = "number_of_unbilled_transactions")
    private final int unbilledTransactionCount = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccountNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayableJoinDate() {
        return null;
    }
    
    public final boolean getPremiumCustomer() {
        return false;
    }
    
    public final double getAccountBalance() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAccountType() {
        return null;
    }
    
    public final int getUnbilledTransactionCount() {
        return 0;
    }
    
    public UserInfoLocal(@org.jetbrains.annotations.NotNull()
    java.lang.String accountNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String displayName, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String displayableJoinDate, boolean premiumCustomer, double accountBalance, @org.jetbrains.annotations.NotNull()
    java.lang.String accountType, int unbilledTransactionCount) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.drulabs.bankbuddy.local.model.UserInfoLocal copy(@org.jetbrains.annotations.NotNull()
    java.lang.String accountNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String displayName, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String displayableJoinDate, boolean premiumCustomer, double accountBalance, @org.jetbrains.annotations.NotNull()
    java.lang.String accountType, int unbilledTransactionCount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}