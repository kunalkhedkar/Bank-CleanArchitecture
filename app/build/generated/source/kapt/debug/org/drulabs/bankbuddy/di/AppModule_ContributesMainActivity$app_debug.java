package org.drulabs.bankbuddy.di;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import org.drulabs.bankbuddy.ui.home.HomeActivity;

@Module(subcomponents = AppModule_ContributesMainActivity$app_debug.HomeActivitySubcomponent.class)
public abstract class AppModule_ContributesMainActivity$app_debug {
  private AppModule_ContributesMainActivity$app_debug() {}

  @Binds
  @IntoMap
  @ActivityKey(HomeActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      HomeActivitySubcomponent.Builder builder);

  @Subcomponent
  public interface HomeActivitySubcomponent extends AndroidInjector<HomeActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<HomeActivity> {}
  }
}
