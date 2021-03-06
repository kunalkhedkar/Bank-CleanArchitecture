// Generated by Dagger (https://google.github.io/dagger).
package org.drulabs.bankbuddy.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class IdentityModule_ProvidesUserIDFactory implements Factory<String> {
  private final IdentityModule module;

  public IdentityModule_ProvidesUserIDFactory(IdentityModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideInstance(module);
  }

  public static String provideInstance(IdentityModule module) {
    return proxyProvidesUserID(module);
  }

  public static IdentityModule_ProvidesUserIDFactory create(IdentityModule module) {
    return new IdentityModule_ProvidesUserIDFactory(module);
  }

  public static String proxyProvidesUserID(IdentityModule instance) {
    return Preconditions.checkNotNull(
        instance.providesUserID(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
