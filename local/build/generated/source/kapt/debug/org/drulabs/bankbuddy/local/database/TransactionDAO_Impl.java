package org.drulabs.bankbuddy.local.database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
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
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.drulabs.bankbuddy.local.model.TransactionLocal;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TransactionDAO_Impl implements TransactionDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfTransactionLocal;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfTransactionLocal;

  private final SharedSQLiteStatement __preparedStmtOfClearCachedTransactions;

  public TransactionDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTransactionLocal = new EntityInsertionAdapter<TransactionLocal>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `transactions`(`transaction_id`,`transaction_type`,`amount_in_cents`,`comma_separated_tags`,`transaction_timestamp`,`is_flagged`,`transaction_remarks`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TransactionLocal value) {
        if (value.getTransactionId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTransactionId());
        }
        if (value.getType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getType());
        }
        stmt.bindLong(3, value.getAmountInCents());
        if (value.getCommaSeparatedTags() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCommaSeparatedTags());
        }
        stmt.bindLong(5, value.getTimestamp());
        final int _tmp;
        _tmp = value.getFlagged() ? 1 : 0;
        stmt.bindLong(6, _tmp);
        if (value.getRemarks() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getRemarks());
        }
      }
    };
    this.__updateAdapterOfTransactionLocal = new EntityDeletionOrUpdateAdapter<TransactionLocal>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `transactions` SET `transaction_id` = ?,`transaction_type` = ?,`amount_in_cents` = ?,`comma_separated_tags` = ?,`transaction_timestamp` = ?,`is_flagged` = ?,`transaction_remarks` = ? WHERE `transaction_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TransactionLocal value) {
        if (value.getTransactionId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTransactionId());
        }
        if (value.getType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getType());
        }
        stmt.bindLong(3, value.getAmountInCents());
        if (value.getCommaSeparatedTags() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCommaSeparatedTags());
        }
        stmt.bindLong(5, value.getTimestamp());
        final int _tmp;
        _tmp = value.getFlagged() ? 1 : 0;
        stmt.bindLong(6, _tmp);
        if (value.getRemarks() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getRemarks());
        }
        if (value.getTransactionId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getTransactionId());
        }
      }
    };
    this.__preparedStmtOfClearCachedTransactions = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM transactions";
        return _query;
      }
    };
  }

  @Override
  public void addTransactions(final List<TransactionLocal> transactions) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTransactionLocal.insert(transactions);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Completable updateTransaction(final TransactionLocal transaction) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfTransactionLocal.handle(transaction);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable clearCachedTransactions() {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearCachedTransactions.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearCachedTransactions.release(_stmt);
        }
      }
    });
  }

  @Override
  public Observable<List<TransactionLocal>> getUserTransactions(final int limit) {
    final String _sql = "SELECT * FROM transactions ORDER BY transaction_timestamp DESC LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    return RxRoom.createObservable(__db, false, new String[]{"transactions"}, new Callable<List<TransactionLocal>>() {
      @Override
      public List<TransactionLocal> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfTransactionId = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_type");
          final int _cursorIndexOfAmountInCents = CursorUtil.getColumnIndexOrThrow(_cursor, "amount_in_cents");
          final int _cursorIndexOfCommaSeparatedTags = CursorUtil.getColumnIndexOrThrow(_cursor, "comma_separated_tags");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_timestamp");
          final int _cursorIndexOfFlagged = CursorUtil.getColumnIndexOrThrow(_cursor, "is_flagged");
          final int _cursorIndexOfRemarks = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_remarks");
          final List<TransactionLocal> _result = new ArrayList<TransactionLocal>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TransactionLocal _item;
            final String _tmpTransactionId;
            _tmpTransactionId = _cursor.getString(_cursorIndexOfTransactionId);
            final String _tmpType;
            _tmpType = _cursor.getString(_cursorIndexOfType);
            final long _tmpAmountInCents;
            _tmpAmountInCents = _cursor.getLong(_cursorIndexOfAmountInCents);
            final String _tmpCommaSeparatedTags;
            _tmpCommaSeparatedTags = _cursor.getString(_cursorIndexOfCommaSeparatedTags);
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final boolean _tmpFlagged;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfFlagged);
            _tmpFlagged = _tmp != 0;
            final String _tmpRemarks;
            _tmpRemarks = _cursor.getString(_cursorIndexOfRemarks);
            _item = new TransactionLocal(_tmpTransactionId,_tmpType,_tmpAmountInCents,_tmpCommaSeparatedTags,_tmpTimestamp,_tmpFlagged,_tmpRemarks);
            _result.add(_item);
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

  @Override
  public Observable<TransactionLocal> getTransactionById(final String transactionId) {
    final String _sql = "SELECT * FROM transactions WHERE transaction_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (transactionId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, transactionId);
    }
    return RxRoom.createObservable(__db, false, new String[]{"transactions"}, new Callable<TransactionLocal>() {
      @Override
      public TransactionLocal call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfTransactionId = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_id");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_type");
          final int _cursorIndexOfAmountInCents = CursorUtil.getColumnIndexOrThrow(_cursor, "amount_in_cents");
          final int _cursorIndexOfCommaSeparatedTags = CursorUtil.getColumnIndexOrThrow(_cursor, "comma_separated_tags");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_timestamp");
          final int _cursorIndexOfFlagged = CursorUtil.getColumnIndexOrThrow(_cursor, "is_flagged");
          final int _cursorIndexOfRemarks = CursorUtil.getColumnIndexOrThrow(_cursor, "transaction_remarks");
          final TransactionLocal _result;
          if(_cursor.moveToFirst()) {
            final String _tmpTransactionId;
            _tmpTransactionId = _cursor.getString(_cursorIndexOfTransactionId);
            final String _tmpType;
            _tmpType = _cursor.getString(_cursorIndexOfType);
            final long _tmpAmountInCents;
            _tmpAmountInCents = _cursor.getLong(_cursorIndexOfAmountInCents);
            final String _tmpCommaSeparatedTags;
            _tmpCommaSeparatedTags = _cursor.getString(_cursorIndexOfCommaSeparatedTags);
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final boolean _tmpFlagged;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfFlagged);
            _tmpFlagged = _tmp != 0;
            final String _tmpRemarks;
            _tmpRemarks = _cursor.getString(_cursorIndexOfRemarks);
            _result = new TransactionLocal(_tmpTransactionId,_tmpType,_tmpAmountInCents,_tmpCommaSeparatedTags,_tmpTimestamp,_tmpFlagged,_tmpRemarks);
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
