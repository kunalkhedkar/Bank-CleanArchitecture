// Generated by Dagger (https://google.github.io/dagger).
package org.drulabs.bankbuddy.data.mapper;

import dagger.internal.Factory;

public final class TransactionDomainDataMapper_Factory
    implements Factory<TransactionDomainDataMapper> {
  private static final TransactionDomainDataMapper_Factory INSTANCE =
      new TransactionDomainDataMapper_Factory();

  @Override
  public TransactionDomainDataMapper get() {
    return provideInstance();
  }

  public static TransactionDomainDataMapper provideInstance() {
    return new TransactionDomainDataMapper();
  }

  public static TransactionDomainDataMapper_Factory create() {
    return INSTANCE;
  }

  public static TransactionDomainDataMapper newTransactionDomainDataMapper() {
    return new TransactionDomainDataMapper();
  }
}