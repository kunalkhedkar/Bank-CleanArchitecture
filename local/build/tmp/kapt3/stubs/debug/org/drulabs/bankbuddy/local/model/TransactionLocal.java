package org.drulabs.bankbuddy.local.model;

import java.lang.System;

@androidx.room.Entity(tableName = "transactions")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006$"}, d2 = {"Lorg/drulabs/bankbuddy/local/model/TransactionLocal;", "", "transactionId", "", "type", "amountInCents", "", "commaSeparatedTags", "timestamp", "flagged", "", "remarks", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JZLjava/lang/String;)V", "getAmountInCents", "()J", "getCommaSeparatedTags", "()Ljava/lang/String;", "getFlagged", "()Z", "getRemarks", "getTimestamp", "getTransactionId", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "local_debug"})
public final class TransactionLocal {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "transaction_id")
    @androidx.room.PrimaryKey()
    private final java.lang.String transactionId = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "transaction_type")
    private final java.lang.String type = null;
    @androidx.room.ColumnInfo(name = "amount_in_cents")
    private final long amountInCents = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "comma_separated_tags")
    private final java.lang.String commaSeparatedTags = null;
    @androidx.room.ColumnInfo(name = "transaction_timestamp")
    private final long timestamp = 0L;
    @androidx.room.ColumnInfo(name = "is_flagged")
    private final boolean flagged = false;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "transaction_remarks")
    private final java.lang.String remarks = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransactionId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    public final long getAmountInCents() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCommaSeparatedTags() {
        return null;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    public final boolean getFlagged() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRemarks() {
        return null;
    }
    
    public TransactionLocal(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
    java.lang.String type, long amountInCents, @org.jetbrains.annotations.NotNull()
    java.lang.String commaSeparatedTags, long timestamp, boolean flagged, @org.jetbrains.annotations.NotNull()
    java.lang.String remarks) {
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
    
    public final long component3() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.drulabs.bankbuddy.local.model.TransactionLocal copy(@org.jetbrains.annotations.NotNull()
    java.lang.String transactionId, @org.jetbrains.annotations.NotNull()
    java.lang.String type, long amountInCents, @org.jetbrains.annotations.NotNull()
    java.lang.String commaSeparatedTags, long timestamp, boolean flagged, @org.jetbrains.annotations.NotNull()
    java.lang.String remarks) {
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