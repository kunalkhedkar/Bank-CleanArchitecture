// Generated by Dagger (https://google.github.io/dagger).
package org.drulabs.bankbuddy.local.mapper;

import dagger.internal.Factory;

public final class UserInfoDataLocalMapper_Factory implements Factory<UserInfoDataLocalMapper> {
  private static final UserInfoDataLocalMapper_Factory INSTANCE =
      new UserInfoDataLocalMapper_Factory();

  @Override
  public UserInfoDataLocalMapper get() {
    return provideInstance();
  }

  public static UserInfoDataLocalMapper provideInstance() {
    return new UserInfoDataLocalMapper();
  }

  public static UserInfoDataLocalMapper_Factory create() {
    return INSTANCE;
  }

  public static UserInfoDataLocalMapper newUserInfoDataLocalMapper() {
    return new UserInfoDataLocalMapper();
  }
}
