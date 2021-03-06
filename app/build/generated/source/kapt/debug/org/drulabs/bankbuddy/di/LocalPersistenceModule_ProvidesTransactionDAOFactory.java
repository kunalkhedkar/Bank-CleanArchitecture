// Generated by Dagger (https://google.github.io/dagger).
package org.drulabs.bankbuddy.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.drulabs.bankbuddy.local.database.BankBuddyDB;
import org.drulabs.bankbuddy.local.database.TransactionDAO;

public final class LocalPersistenceModule_ProvidesTransactionDAOFactory
    implements Factory<TransactionDAO> {
  private final LocalPersistenceModule module;

  private final Provider<BankBuddyDB> bankBuddyDBProvider;

  public LocalPersistenceModule_ProvidesTransactionDAOFactory(
      LocalPersistenceModule module, Provider<BankBuddyDB> bankBuddyDBProvider) {
    this.module = module;
    this.bankBuddyDBProvider = bankBuddyDBProvider;
  }

  @Override
  public TransactionDAO get() {
    return provideInstance(module, bankBuddyDBProvider);
  }

  public static TransactionDAO provideInstance(
      LocalPersistenceModule module, Provider<BankBuddyDB> bankBuddyDBProvider) {
    return proxyProvidesTransactionDAO(module, bankBuddyDBProvider.get());
  }

  public static LocalPersistenceModule_ProvidesTransactionDAOFactory create(
      LocalPersistenceModule module, Provider<BankBuddyDB> bankBuddyDBProvider) {
    return new LocalPersistenceModule_ProvidesTransactionDAOFactory(module, bankBuddyDBProvider);
  }

  public static TransactionDAO proxyProvidesTransactionDAO(
      LocalPersistenceModule instance, BankBuddyDB bankBuddyDB) {
    return Preconditions.checkNotNull(
        instance.providesTransactionDAO(bankBuddyDB),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
