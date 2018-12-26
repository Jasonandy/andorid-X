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
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import cc.ibooker.zcountdownviewlib.SingleCountDownView;

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
	 * 启动创建
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//initViewPager();
		setContentView(R.layout.activity_sms);
		
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
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.sms, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}


}
