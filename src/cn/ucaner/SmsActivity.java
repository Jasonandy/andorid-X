/**
 * <html>
 * <body>
 *  <P> Copyright 1994 JsonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 19941115</p>
 *  <p> Created by Jason  From  https://github.com/Jasonandy/patterns </p>
 *  </body>
 * </html>
 */
package cn.ucaner;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import cc.ibooker.zcountdownviewlib.SingleCountDownView;
import cn.ucaner.lifecycle.DialogActivity;
import cn.ucaner.lifecycle.NormalActivity;

/**
* @Package：cn.ucaner   
* @ClassName：SmsActivity   
* @Description：   <p> SmsActivity - 调用手机发短信的activity </p>
* @Author： - Jason   
* @CreatTime：2018年12月19日 下午3:09:13   
* @Modify By：   
* @ModifyTime：  2018年12月19日
* @Modify marker：   
* @version    V1.0
 */
public class SmsActivity extends Activity {

	public static final String TAG = "SMS_ACTIVITY_TAG";

	/**
	 *发送按钮
	 */
	private Button sendSmsBtn = null;

	/**
	 * CoolActivity
	 */
	private Button coolActivityBtn = null;

    /**
     * rollingTextActivityBtn
     */
    private Button rollingTextActivityBtn = null;

	/**
	 * destoryActivityBtn
	 */
	private Button destoryActivityBtn = null;

    /**
     * browserBtn
     */
    private Button browserBtn = null;


	/**
	 * startNormalBtn
	 */
	private Button startNormalBtn = null;

	/**
	 * startDialogBtn
	 */
	private Button startDialogBtn = null;
	
	/**
	 * 启动创建
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//initViewPager();
		setContentView(R.layout.activity_sms);
		Log.d(TAG,"onCreate");
		
		/**
		 * 发送短信的按钮
		 */
		sendSmsBtn = findViewById(R.id.sendSmsBtn);
		sendSmsBtn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View view) {
				Uri uri = Uri.parse("smsto:1008601");
				Intent intent = new Intent(Intent.ACTION_SENDTO,uri);
				intent.putExtra("sms_body", "I'm Jason! WHAT'S U NAME?");
				startActivity(intent);
			}
		});

		/**
		 * 单个倒计时使用
		 */
		SingleCountDownView singleCountDownView = findViewById(R.id.singleCountDownView);
		// 单个倒计时点击事件监听
		singleCountDownView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				singleCountDownView.setTextColor(Color.parseColor("#FF7198"));
				//singleCountDownView.setBackgroundResource(R.mipmap.code_border_highlight);
				// 开启倒计时
				singleCountDownView.setTime(90)
						.setTimeColorHex("#FF7198")
						.setTimePrefixText("倒计时")
						.setTimeSuffixText("秒(S)")
						.startCountDown();
			}
		});

        // 单个倒计时结束事件监听
        singleCountDownView.setSingleCountDownEndListener(new SingleCountDownView.SingleCountDownEndListener() {
            @Override
            public void onSingleCountDownEnd() {
                Toast.makeText(SmsActivity.this, "倒计时结束", Toast.LENGTH_SHORT).show();
                // 倒计时结束
                singleCountDownView.setText("获取验证码");
                singleCountDownView.setTextColor(Color.parseColor("#BBBBBB"));
                //singleCountDownView.setBackgroundResource(R.mipmap.code_border_normal);
            }
        });

        /**
         * toRollTextBtn
         */
		coolActivityBtn = findViewById(R.id.toCoolBtn);
		coolActivityBtn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View view) {
				//生成一个Intent对象
				Intent intent = new Intent();
				intent.setClass(SmsActivity.this,CoolViewActivity.class); //ComponentName 内部其实就是传递到Component了 MainActivity--->TestActivity
				startActivity(intent); //启动Activity
			}
		});


		//toRollTextBtn
        rollingTextActivityBtn = findViewById(R.id.toRollTextBtn);
        rollingTextActivityBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                //生成一个Intent对象
                Intent intent = new Intent();
                intent.setClass(SmsActivity.this,RollingTextActivity.class); //ComponentName 内部其实就是传递到Component了 MainActivity--->TestActivity
                startActivity(intent); //启动Activity
            }
        });

        //destoryActivityBtn
		destoryActivityBtn = findViewById(R.id.destoryActivityBtn);
		destoryActivityBtn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View view) {
				finish();
			}
		});

		//browserBtn
        browserBtn = findViewById(R.id.browserBtn);
        browserBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.baidu.com"));
                startActivity(intent);
            }
        });

        //start_dialog_btn

		startNormalBtn = findViewById(R.id.start_normal_btn);
		startNormalBtn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent();
				intent.setClass(SmsActivity.this,NormalActivity.class);
				startActivity(intent);

			}
		});


		startDialogBtn = findViewById(R.id.start_dialog_btn);
		startDialogBtn.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent();
				intent.setClass(SmsActivity.this,DialogActivity.class);
				startActivity(intent);
			}
		});
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.sms, menu);
		return true;
	}

	/**
	 * 设置
	 * @param item
	 * @return
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()){
			case R.id.action_settings:
				Toast.makeText(this,"Setting",Toast.LENGTH_SHORT).show();
			case R.id.item_sms_b:
				Toast.makeText(this,"This is App Name.",Toast.LENGTH_SHORT).show();
			break;
			default:
		}
		return true;
	}

	/**
	 * onPause
	 */
	@Override
	protected void onPause() {
		super.onPause();
		Log.d(TAG,"onPause");
	}

	/**
	 * onStart
	 */
	@Override
	protected void onStart() {
		super.onStart();
		Log.d(TAG,"onStart");
	}

	/**
	 * onRestart
	 */
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(TAG,"onRestart");
	}

	/**
	 * onResume
	 */
	@Override
	protected void onResume() {
		super.onResume();
		Log.d(TAG,"onResume");
	}

	/**
	 * onStop
	 */
	@Override
	protected void onStop() {
		super.onStop();
		Log.d(TAG,"onStop");
	}

	/**
	 * onDestroy
	 */
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(TAG,"onDestroy");
	}
}
