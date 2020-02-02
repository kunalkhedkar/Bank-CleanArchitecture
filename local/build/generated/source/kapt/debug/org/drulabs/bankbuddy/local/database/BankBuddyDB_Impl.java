package org.drulabs.bankbuddy.local.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BankBuddyDB_Impl extends BankBuddyDB {
  private volatile TransactionDAO _transactionDAO;

  private volatile UserInfoDAO _userInfoDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `user_info` (`account_id` TEXT NOT NULL, `display_name` TEXT NOT NULL, `user_address` TEXT NOT NULL, `join_date` TEXT NOT NULL, `is_premium_customer` INTEGER NOT NULL, `account_balance` REAL NOT NULL, `type` TEXT NOT NULL, `number_of_unbilled_transactions` INTEGER NOT NULL, PRIMARY KEY(`account_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `transactions` (`transaction_id` TEXT NOT NULL, `transaction_type` TEXT NOT NULL, `amount_in_cents` INTEGER NOT NULL, `comma_separated_tags` TEXT NOT NULL, `transaction_timestamp` INTEGER NOT NULL, `is_flagged` INTEGER NOT NULL, `transaction_remarks` TEXT NOT NULL, PRIMARY KEY(`transaction_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ce142af91e7ea51cec2f143675fbfd83')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `user_info`");
        _db.execSQL("DROP TABLE IF EXISTS `transactions`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUserInfo = new HashMap<String, TableInfo.Column>(8);
        _columnsUserInfo.put("account_id", new TableInfo.Column("account_id", "TEXT", true, 1));
        _columnsUserInfo.put("display_name", new TableInfo.Column("display_name", "TEXT", true, 0));
        _columnsUserInfo.put("user_address", new TableInfo.Column("user_address", "TEXT", true, 0));
        _columnsUserInfo.put("join_date", new TableInfo.Column("join_date", "TEXT", true, 0));
        _columnsUserInfo.put("is_premium_customer", new TableInfo.Column("is_premium_customer", "INTEGER", true, 0));
        _columnsUserInfo.put("account_balance", new TableInfo.Column("account_balance", "REAL", true, 0));
        _columnsUserInfo.put("type", new TableInfo.Column("type", "TEXT", true, 0));
        _columnsUserInfo.put("number_of_unbilled_transactions", new TableInfo.Column("number_of_unbilled_transactions", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserInfo = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserInfo = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserInfo = new TableInfo("user_info", _columnsUserInfo, _foreignKeysUserInfo, _indicesUserInfo);
        final TableInfo _existingUserInfo = TableInfo.read(_db, "user_info");
        if (! _infoUserInfo.equals(_existingUserInfo)) {
          throw new IllegalStateException("Migration didn't properly handle user_info(org.drulabs.bankbuddy.local.model.UserInfoLocal).\n"
                  + " Expected:\n" + _infoUserInfo + "\n"
                  + " Found:\n" + _existingUserInfo);
        }
        final HashMap<String, TableInfo.Column> _columnsTransactions = new HashMap<String, TableInfo.Column>(7);
        _columnsTransactions.put("transaction_id", new TableInfo.Column("transaction_id", "TEXT", true, 1));
        _columnsTransactions.put("transaction_type", new TableInfo.Column("transaction_type", "TEXT", true, 0));
        _columnsTransactions.put("amount_in_cents", new TableInfo.Column("amount_in_cents", "INTEGER", true, 0));
        _columnsTransactions.put("comma_separated_tags", new TableInfo.Column("comma_separated_tags", "TEXT", true, 0));
        _columnsTransactions.put("transaction_timestamp", new TableInfo.Column("transaction_timestamp", "INTEGER", true, 0));
        _columnsTransactions.put("is_flagged", new TableInfo.Column("is_flagged", "INTEGER", true, 0));
        _columnsTransactions.put("transaction_remarks", new TableInfo.Column("transaction_remarks", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTransactions = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTransactions = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTransactions = new TableInfo("transactions", _columnsTransactions, _foreignKeysTransactions, _indicesTransactions);
        final TableInfo _existingTransactions = TableInfo.read(_db, "transactions");
        if (! _infoTransactions.equals(_existingTransactions)) {
          throw new IllegalStateException("Migration didn't properly handle transactions(org.drulabs.bankbuddy.local.model.TransactionLocal).\n"
                  + " Expected:\n" + _infoTransactions + "\n"
                  + " Found:\n" + _existingTransactions);
        }
      }
    }, "ce142af91e7ea51cec2f143675fbfd83", "de3e2c2d7055c0f1d87f92246fc0fb0d");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "user_info","transactions");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `user_info`");
      _db.execSQL("DELETE FROM `transactions`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public TransactionDAO getTransactionDao() {
    if (_transactionDAO != null) {
      return _transactionDAO;
    } else {
      synchronized(this) {
        if(_transactionDAO == null) {
          _transactionDAO = new TransactionDAO_Impl(this);
        }
        return _transactionDAO;
      }
    }
  }

  @Override
  public UserInfoDAO getUserInfoDao() {
    if (_userInfoDAO != null) {
      return _userInfoDAO;
    } else {
      synchronized(this) {
        if(_userInfoDAO == null) {
          _userInfoDAO = new UserInfoDAO_Impl(this);
        }
        return _userInfoDAO;
      }
    }
  }
}
