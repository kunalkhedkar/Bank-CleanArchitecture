// Generated by Dagger (https://google.github.io/dagger).
package org.drulabs.bankbuddy.remote.source;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.drulabs.bankbuddy.data.model.TransactionData;
import org.drulabs.bankbuddy.data.model.UserInfoData;
import org.drulabs.bankbuddy.remote.api.BankingService;
import org.drulabs.bankbuddy.remote.mapper.Mapper;
import org.drulabs.bankbuddy.remote.model.TransactionNetwork;
import org.drulabs.bankbuddy.remote.model.UserInfoNetwork;

public final class RemoteDataSourceImpl_Factory implements Factory<RemoteDataSourceImpl> {
  private final Provider<Mapper<UserInfoData, UserInfoNetwork>> arg0Provider;

  private final Provider<Mapper<TransactionData, TransactionNetwork>> arg1Provider;

  private final Provider<BankingService> arg2Provider;

  public RemoteDataSourceImpl_Factory(
      Provider<Mapper<UserInfoData, UserInfoNetwork>> arg0Provider,
      Provider<Mapper<TransactionData, TransactionNetwork>> arg1Provider,
      Provider<BankingService> arg2Provider) {
    this.arg0Provider = arg0Provider;
    this.arg1Provider = arg1Provider;
    this.arg2Provider = arg2Provider;
  }

  @Override
  public RemoteDataSourceImpl get() {
    return provideInstance(arg0Provider, arg1Provider, arg2Provider);
  }

  public static RemoteDataSourceImpl provideInstance(
      Provider<Mapper<UserInfoData, UserInfoNetwork>> arg0Provider,
      Provider<Mapper<TransactionData, TransactionNetwork>> arg1Provider,
      Provider<BankingService> arg2Provider) {
    return new RemoteDataSourceImpl(arg0Provider.get(), arg1Provider.get(), arg2Provider.get());
  }

  public static RemoteDataSourceImpl_Factory create(
      Provider<Mapper<UserInfoData, UserInfoNetwork>> arg0Provider,
      Provider<Mapper<TransactionData, TransactionNetwork>> arg1Provider,
      Provider<BankingService> arg2Provider) {
    return new RemoteDataSourceImpl_Factory(arg0Provider, arg1Provider, arg2Provider);
  }

  public static RemoteDataSourceImpl newRemoteDataSourceImpl(
      Mapper<UserInfoData, UserInfoNetwork> arg0,
      Mapper<TransactionData, TransactionNetwork> arg1,
      BankingService arg2) {
    return new RemoteDataSourceImpl(arg0, arg1, arg2);
  }
}
