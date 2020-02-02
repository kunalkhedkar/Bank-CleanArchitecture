package org.drulabs.bankbuddy.local.database;

import java.lang.System;

@androidx.room.Database(entities = {org.drulabs.bankbuddy.local.model.UserInfoLocal.class, org.drulabs.bankbuddy.local.model.TransactionLocal.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lorg/drulabs/bankbuddy/local/database/BankBuddyDB;", "Landroidx/room/RoomDatabase;", "()V", "getTransactionDao", "Lorg/drulabs/bankbuddy/local/database/TransactionDAO;", "getUserInfoDao", "Lorg/drulabs/bankbuddy/local/database/UserInfoDAO;", "Companion", "local_debug"})
public abstract class BankBuddyDB extends androidx.room.RoomDatabase {
    private static final java.lang.Object LOCK = null;
    private static final java.lang.String DATABASE_NAME = "bank_buddy.db";
    private static volatile org.drulabs.bankbuddy.local.database.BankBuddyDB INSTANCE;
    public static final org.drulabs.bankbuddy.local.database.BankBuddyDB.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.drulabs.bankbuddy.local.database.TransactionDAO getTransactionDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.drulabs.bankbuddy.local.database.UserInfoDAO getUserInfoDao();
    
    public BankBuddyDB() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/drulabs/bankbuddy/local/database/BankBuddyDB$Companion;", "", "()V", "DATABASE_NAME", "", "INSTANCE", "Lorg/drulabs/bankbuddy/local/database/BankBuddyDB;", "LOCK", "getInstance", "context", "Landroid/content/Context;", "local_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.drulabs.bankbuddy.local.database.BankBuddyDB getInstance(@org.jetbrains.annotations.NotNull()
        @androidx.annotation.NonNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}