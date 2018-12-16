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
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
* @Package：cn.ucaner   
* @ClassName：TestActivity   
* @Description：   <p> TestActivity </p>
* @Author： - Jason   
* @CreatTime：2018年12月15日 下午8:29:55   
* @Modify By：   
* @ModifyTime：  2018年12月15日
* @Modify marker：   
* @version    V1.0
 */
public class TestActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
		TextView textView = (TextView)findViewById(R.id.test_my_view);
		
		textView.setText("\r\n" + 
				"	        项目简介：一个佛系的高中物理老师的App\\n\r\n" + 
				"	        项目地址：https://github.com/Jasonandy \\n\r\n" + 
				"	        作       者：佛系小吴\\n"
		);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.test, menu);
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
