package com.marakana.android.yamba;

import android.os.Bundle;
import android.view.MenuItem;


public class StatusActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
   }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemStatus:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
