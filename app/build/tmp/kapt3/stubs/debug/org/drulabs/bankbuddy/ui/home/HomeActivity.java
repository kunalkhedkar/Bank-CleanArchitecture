package org.drulabs.bankbuddy.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u001a\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lorg/drulabs/bankbuddy/ui/home/HomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "dateFormat", "Ljava/text/SimpleDateFormat;", "homeVM", "Lorg/drulabs/bankbuddy/presentation/viewmodels/HomeVM;", "userInfo", "Lorg/drulabs/bankbuddy/presentation/model/UserInfo;", "viewModelFactory", "Lorg/drulabs/bankbuddy/presentation/factory/ViewModelFactory;", "getViewModelFactory", "()Lorg/drulabs/bankbuddy/presentation/factory/ViewModelFactory;", "setViewModelFactory", "(Lorg/drulabs/bankbuddy/presentation/factory/ViewModelFactory;)V", "displayBankOperationsClosedMessage", "", "hideLoader", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setClickListeners", "showAlertDialog", "title", "", "contentId", "", "showLoader", "app_debug"})
public final class HomeActivity extends androidx.appcompat.app.AppCompatActivity {
    private final java.text.SimpleDateFormat dateFormat = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public org.drulabs.bankbuddy.presentation.factory.ViewModelFactory viewModelFactory;
    private org.drulabs.bankbuddy.presentation.viewmodels.HomeVM homeVM;
    private org.drulabs.bankbuddy.presentation.model.UserInfo userInfo;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final org.drulabs.bankbuddy.presentation.factory.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    org.drulabs.bankbuddy.presentation.factory.ViewModelFactory p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setClickListeners() {
    }
    
    /**
     * SHows loading indicator and blurs other views
     */
    private final void showLoader() {
    }
    
    /**
     * Hides loading indicator
     */
    private final void hideLoader() {
    }
    
    /**
     * Displays dummy Message, shows (current date + 3) days as bank closed day
     */
    private final void displayBankOperationsClosedMessage() {
    }
    
    /**
     * Displays an alert dialog
     * @param title Title of the alert dialog
     * @param contentId string resource id of the content
     */
    private final void showAlertDialog(java.lang.CharSequence title, @androidx.annotation.StringRes()
    int contentId) {
    }
    
    public HomeActivity() {
        super();
    }
}