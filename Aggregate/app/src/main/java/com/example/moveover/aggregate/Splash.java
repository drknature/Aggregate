package com.example.moveover.aggregate;
import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.Window;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle Hi) {
        super.onCreate(Hi);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.splash);
        Thread timer = new Thread() {
            public void run(){
                try{
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(Splash.this,FullscreenActivity.class);
                    startActivity(intent);
                }
            }
        };
        timer.start();
    }
}