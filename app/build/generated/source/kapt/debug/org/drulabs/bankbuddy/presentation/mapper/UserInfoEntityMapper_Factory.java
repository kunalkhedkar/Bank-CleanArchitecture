// Generated by Dagger (https://google.github.io/dagger).
package org.drulabs.bankbuddy.presentation.mapper;

import dagger.internal.Factory;

public final class UserInfoEntityMapper_Factory implements Factory<UserInfoEntityMapper> {
  private static final UserInfoEntityMapper_Factory INSTANCE = new UserInfoEntityMapper_Factory();

  @Override
  public UserInfoEntityMapper get() {
    return provideInstance();
  }

  public static UserInfoEntityMapper provideInstance() {
    return new UserInfoEntityMapper();
  }

  public static UserInfoEntityMapper_Factory create() {
    return INSTANCE;
  }

  public static UserInfoEntityMapper newUserInfoEntityMapper() {
    return new UserInfoEntityMapper();
  }
}
