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
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

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
	 * 启动创建
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
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
