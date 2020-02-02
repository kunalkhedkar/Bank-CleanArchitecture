package org.drulabs.bankbuddy.di;

import android.app.Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import org.drulabs.bankbuddy.ui.transactions.TransactionList;

@Module(
  subcomponents = AppModule_ContributesTransactionList$app_debug.TransactionListSubcomponent.class
)
public abstract class AppModule_ContributesTransactionList$app_debug {
  private AppModule_ContributesTransactionList$app_debug() {}

  @Binds
  @IntoMap
  @ActivityKey(TransactionList.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      TransactionListSubcomponent.Builder builder);

  @Subcomponent
  public interface TransactionListSubcomponent extends AndroidInjector<TransactionList> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<TransactionList> {}
  }
}
