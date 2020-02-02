// Generated by Dagger (https://google.github.io/dagger).
package org.drulabs.bankbuddy.presentation.viewmodels;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.drulabs.bankbuddy.domain.entities.TransactionEntity;
import org.drulabs.bankbuddy.domain.usecases.FilterTransactionsTask;
import org.drulabs.bankbuddy.domain.usecases.GetUserTransactionsTask;
import org.drulabs.bankbuddy.domain.usecases.TransactionStatusUpdaterTask;
import org.drulabs.bankbuddy.presentation.mapper.Mapper;
import org.drulabs.bankbuddy.presentation.model.Transaction;

public final class TransactionsVM_Factory implements Factory<TransactionsVM> {
  private final Provider<String> arg0Provider;

  private final Provider<Mapper<TransactionEntity, Transaction>> arg1Provider;

  private final Provider<GetUserTransactionsTask> arg2Provider;

  private final Provider<FilterTransactionsTask> arg3Provider;

  private final Provider<TransactionStatusUpdaterTask> arg4Provider;

  public TransactionsVM_Factory(
      Provider<String> arg0Provider,
      Provider<Mapper<TransactionEntity, Transaction>> arg1Provider,
      Provider<GetUserTransactionsTask> arg2Provider,
      Provider<FilterTransactionsTask> arg3Provider,
      Provider<TransactionStatusUpdaterTask> arg4Provider) {
    this.arg0Provider = arg0Provider;
    this.arg1Provider = arg1Provider;
    this.arg2Provider = arg2Provider;
    this.arg3Provider = arg3Provider;
    this.arg4Provider = arg4Provider;
  }

  @Override
  public TransactionsVM get() {
    return provideInstance(arg0Provider, arg1Provider, arg2Provider, arg3Provider, arg4Provider);
  }

  public static TransactionsVM provideInstance(
      Provider<String> arg0Provider,
      Provider<Mapper<TransactionEntity, Transaction>> arg1Provider,
      Provider<GetUserTransactionsTask> arg2Provider,
      Provider<FilterTransactionsTask> arg3Provider,
      Provider<TransactionStatusUpdaterTask> arg4Provider) {
    return new TransactionsVM(
        arg0Provider.get(),
        arg1Provider.get(),
        arg2Provider.get(),
        arg3Provider.get(),
        arg4Provider.get());
  }

  public static TransactionsVM_Factory create(
      Provider<String> arg0Provider,
      Provider<Mapper<TransactionEntity, Transaction>> arg1Provider,
      Provider<GetUserTransactionsTask> arg2Provider,
      Provider<FilterTransactionsTask> arg3Provider,
      Provider<TransactionStatusUpdaterTask> arg4Provider) {
    return new TransactionsVM_Factory(
        arg0Provider, arg1Provider, arg2Provider, arg3Provider, arg4Provider);
  }

  public static TransactionsVM newTransactionsVM(
      String arg0,
      Mapper<TransactionEntity, Transaction> arg1,
      GetUserTransactionsTask arg2,
      FilterTransactionsTask arg3,
      TransactionStatusUpdaterTask arg4) {
    return new TransactionsVM(arg0, arg1, arg2, arg3, arg4);
  }
}