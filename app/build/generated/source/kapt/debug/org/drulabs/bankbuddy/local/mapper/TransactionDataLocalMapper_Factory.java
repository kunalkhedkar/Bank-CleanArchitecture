// Generated by Dagger (https://google.github.io/dagger).
package org.drulabs.bankbuddy.local.mapper;

import dagger.internal.Factory;

public final class TransactionDataLocalMapper_Factory
    implements Factory<TransactionDataLocalMapper> {
  private static final TransactionDataLocalMapper_Factory INSTANCE =
      new TransactionDataLocalMapper_Factory();

  @Override
  public TransactionDataLocalMapper get() {
    return provideInstance();
  }

  public static TransactionDataLocalMapper provideInstance() {
    return new TransactionDataLocalMapper();
  }

  public static TransactionDataLocalMapper_Factory create() {
    return INSTANCE;
  }

  public static TransactionDataLocalMapper newTransactionDataLocalMapper() {
    return new TransactionDataLocalMapper();
  }
}
