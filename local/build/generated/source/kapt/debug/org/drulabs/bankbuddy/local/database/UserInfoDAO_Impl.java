package org.drulabs.bankbuddy.local.database;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.Completable;
import io.reactivex.Observable;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.concurrent.Callable;
import org.drulabs.bankbuddy.local.model.UserInfoLocal;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserInfoDAO_Impl implements UserInfoDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUserInfoLocal;

  private final SharedSQLiteStatement __preparedStmtOfClearCachedUserInfo;

  public UserInfoDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserInfoLocal = new EntityInsertionAdapter<UserInfoLocal>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `user_info`(`account_id`,`display_name`,`user_address`,`join_date`,`is_premium_customer`,`account_balance`,`type`,`number_of_unbilled_transactions`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserInfoLocal value) {
        if (value.getAccountNumber() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getAccountNumber());
        }
        if (value.getDisplayName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDisplayName());
        }
        if (value.getAddress() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAddress());
        }
        if (value.getDisplayableJoinDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDisplayableJoinDate());
        }
        final int _tmp;
        _tmp = value.getPremiumCustomer() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        stmt.bindDouble(6, value.getAccountBalance());
        if (value.getAccountType() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getAccountType());
        }
        stmt.bindLong(8, value.getUnbilledTransactionCount());
      }
    };
    this.__preparedStmtOfClearCachedUserInfo = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM user_info";
        return _query;
      }
    };
  }

  @Override
  public void addUserInfo(final UserInfoLocal userInfo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUserInfoLocal.insert(userInfo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Completable clearCachedUserInfo() {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearCachedUserInfo.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearCachedUserInfo.release(_stmt);
        }
      }
    });
  }

  @Override
  public Observable<UserInfoLocal> getUserInfo(final String userIdentifier) {
    final String _sql = "SELECT * FROM user_info WHERE account_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userIdentifier == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userIdentifier);
    }
    return RxRoom.createObservable(__db, false, new String[]{"user_info"}, new Callable<UserInfoLocal>() {
      @Override
      public UserInfoLocal call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfAccountNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "account_id");
          final int _cursorIndexOfDisplayName = CursorUtil.getColumnIndexOrThrow(_cursor, "display_name");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "user_address");
          final int _cursorIndexOfDisplayableJoinDate = CursorUtil.getColumnIndexOrThrow(_cursor, "join_date");
          final int _cursorIndexOfPremiumCustomer = CursorUtil.getColumnIndexOrThrow(_cursor, "is_premium_customer");
          final int _cursorIndexOfAccountBalance = CursorUtil.getColumnIndexOrThrow(_cursor, "account_balance");
          final int _cursorIndexOfAccountType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfUnbilledTransactionCount = CursorUtil.getColumnIndexOrThrow(_cursor, "number_of_unbilled_transactions");
          final UserInfoLocal _result;
          if(_cursor.moveToFirst()) {
            final String _tmpAccountNumber;
            _tmpAccountNumber = _cursor.getString(_cursorIndexOfAccountNumber);
            final String _tmpDisplayName;
            _tmpDisplayName = _cursor.getString(_cursorIndexOfDisplayName);
            final String _tmpAddress;
            _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            final String _tmpDisplayableJoinDate;
            _tmpDisplayableJoinDate = _cursor.getString(_cursorIndexOfDisplayableJoinDate);
            final boolean _tmpPremiumCustomer;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfPremiumCustomer);
            _tmpPremiumCustomer = _tmp != 0;
            final double _tmpAccountBalance;
            _tmpAccountBalance = _cursor.getDouble(_cursorIndexOfAccountBalance);
            final String _tmpAccountType;
            _tmpAccountType = _cursor.getString(_cursorIndexOfAccountType);
            final int _tmpUnbilledTransactionCount;
            _tmpUnbilledTransactionCount = _cursor.getInt(_cursorIndexOfUnbilledTransactionCount);
            _result = new UserInfoLocal(_tmpAccountNumber,_tmpDisplayName,_tmpAddress,_tmpDisplayableJoinDate,_tmpPremiumCustomer,_tmpAccountBalance,_tmpAccountType,_tmpUnbilledTransactionCount);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
