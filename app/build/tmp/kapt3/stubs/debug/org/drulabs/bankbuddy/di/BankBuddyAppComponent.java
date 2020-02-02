package org.drulabs.bankbuddy.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H&\u00a8\u0006\u0007"}, d2 = {"Lorg/drulabs/bankbuddy/di/BankBuddyAppComponent;", "Ldagger/android/AndroidInjector;", "Lorg/drulabs/bankbuddy/application/BankBuddyApp;", "inject", "", "app", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, org.drulabs.bankbuddy.di.DomainModule.class, org.drulabs.bankbuddy.di.DataModule.class, org.drulabs.bankbuddy.di.LocalPersistenceModule.class, org.drulabs.bankbuddy.di.RemoteModule.class, org.drulabs.bankbuddy.di.IdentityModule.class, org.drulabs.bankbuddy.di.PresentationModule.class, org.drulabs.bankbuddy.di.AppModule.class})
@javax.inject.Singleton()
public abstract interface BankBuddyAppComponent extends dagger.android.AndroidInjector<org.drulabs.bankbuddy.application.BankBuddyApp> {
    
    @java.lang.Override()
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.application.BankBuddyApp app);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lorg/drulabs/bankbuddy/di/BankBuddyAppComponent$Builder;", "", "application", "app", "Landroid/app/Application;", "build", "Lorg/drulabs/bankbuddy/di/BankBuddyAppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract org.drulabs.bankbuddy.di.BankBuddyAppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application app);
        
        @org.jetbrains.annotations.NotNull()
        public abstract org.drulabs.bankbuddy.di.BankBuddyAppComponent build();
    }
}