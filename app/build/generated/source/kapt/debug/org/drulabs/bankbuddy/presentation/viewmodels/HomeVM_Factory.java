// Generated by Dagger (https://google.github.io/dagger).
package org.drulabs.bankbuddy.presentation.viewmodels;

import dagger.internal.Factory;
import javax.inject.Provider;
import org.drulabs.bankbuddy.domain.entities.UserInfoEntity;
import org.drulabs.bankbuddy.domain.usecases.GetUserInfoTask;
import org.drulabs.bankbuddy.presentation.mapper.Mapper;
import org.drulabs.bankbuddy.presentation.model.UserInfo;

public final class HomeVM_Factory implements Factory<HomeVM> {
  private final Provider<String> arg0Provider;

  private final Provider<Mapper<UserInfoEntity, UserInfo>> arg1Provider;

  private final Provider<GetUserInfoTask> arg2Provider;

  public HomeVM_Factory(
      Provider<String> arg0Provider,
      Provider<Mapper<UserInfoEntity, UserInfo>> arg1Provider,
      Provider<GetUserInfoTask> arg2Provider) {
    this.arg0Provider = arg0Provider;
    this.arg1Provider = arg1Provider;
    this.arg2Provider = arg2Provider;
  }

  @Override
  public HomeVM get() {
    return provideInstance(arg0Provider, arg1Provider, arg2Provider);
  }

  public static HomeVM provideInstance(
      Provider<String> arg0Provider,
      Provider<Mapper<UserInfoEntity, UserInfo>> arg1Provider,
      Provider<GetUserInfoTask> arg2Provider) {
    return new HomeVM(arg0Provider.get(), arg1Provider.get(), arg2Provider.get());
  }

  public static HomeVM_Factory create(
      Provider<String> arg0Provider,
      Provider<Mapper<UserInfoEntity, UserInfo>> arg1Provider,
      Provider<GetUserInfoTask> arg2Provider) {
    return new HomeVM_Factory(arg0Provider, arg1Provider, arg2Provider);
  }

  public static HomeVM newHomeVM(
      String arg0, Mapper<UserInfoEntity, UserInfo> arg1, GetUserInfoTask arg2) {
    return new HomeVM(arg0, arg1, arg2);
  }
}
