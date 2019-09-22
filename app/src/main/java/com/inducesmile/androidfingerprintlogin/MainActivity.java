package com.inducesmile.androidfingerprintlogin;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
//    private NfcAdapter nfcAdapter;
//    private PendingIntent pendingIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ActionBar actionBar = getSupportActionBar();
        if(null != actionBar){
            actionBar.hide();
        }

//        this.nfcAdapter = NfcAdapter.getDefaultAdapter((Context)this);
//        if (nfcAdapter == null) {
//            Toast.makeText((Context)this, (CharSequence)"No NFC",Toast.LENGTH_SHORT).show();
//
//        }
//        else pendingIntent = PendingIntent.getActivity((Context)this, 0,new Intent(this,SignUpActivity.class).addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP),0);


        Button signInButton = (Button)findViewById(R.id.sign_in);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(loginIntent);
            }
        });

        Button signUpButton = (Button)findViewById(R.id.sign_up);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signInIntent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(signInIntent);
            }
        });
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        NfcAdapter nfcAdapterRefCopy = this.nfcAdapter;
//        if (nfcAdapterRefCopy != null) {
//            if (!nfcAdapterRefCopy.isEnabled()) {
//                Toast.makeText((Context)this, (CharSequence)"Please enable NFC on your Device",Toast.LENGTH_SHORT).show();
//                finish();
//                return;
//            }
//
//            nfcAdapterRefCopy.enableForegroundDispatch((Activity)this, this.pendingIntent, null, null);
//        }
//
//    }

//    @Override
//    protected  void onPause(){
//        super.onPause();
//        if(nfcAdapter!=null)
//        {
//            nfcAdapter.disableForegroundDispatch(this);
//        }
//    }



}
