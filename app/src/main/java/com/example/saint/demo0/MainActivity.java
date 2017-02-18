package com.example.saint.demo0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static Toast mToast = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //既然每个按钮都触发一个相同的方法，就优化下把它们用switch合并起来。
    //activitymaitn 那的button 改用  android:OnClick="btnClick";
    public void btnClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                showToast(R.string.btn_msg1);
                break;
            case R.id.button2:
                showToast(R.string.btn_msg2);
                break;
            case R.id.button3:
                showToast(R.string.btn_msg3);
                break;
            case R.id.button4:
                showToast(R.string.btn_msg4);
                break;
            case R.id.button5:
                showToast(R.string.btn_msg5);
                break;
        }
    }

    //toast具体方法
    private void showToast(int resId) {
        if (mToast == null) {
            mToast = Toast.makeText(this, resId, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(resId);
        }
        mToast.show();
    }


}
