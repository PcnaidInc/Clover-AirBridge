package com.clover.airbridge.relay;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.util.Log;

public class CloverAccount {
    private static final String TAG = "CloverAccount";

    public static Account getAccount(Context context) {
        AccountManager accountManager = AccountManager.get(context);
        Account[] accounts = accountManager.getAccountsByType("com.clover.account");

        if (accounts.length > 0) {
            Log.d(TAG, "Clover account found.");
            return accounts[0];
        } else {
            Log.e(TAG, "No Clover account found on this device.");
            return null;
        }
    }
}
