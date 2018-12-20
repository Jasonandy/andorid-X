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
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
* @Package：cn.ucaner   
* @ClassName：CacResutActivity   
* @Description：   <p> CacResutActivity 计算结果 </p>
* @Author： - Jason   
* @CreatTime：2018年12月20日 上午8:36:28   
* @Modify By：   
* @ModifyTime：  2018年12月20日
* @Modify marker：   
* @version    V1.0
 */
public class CacResutActivity extends Activity {

	/**
	 * 显示结果
	 */
	private TextView cacResult;
	
	/**
	 * 将计算结果返回出来
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cac_resut);
		//1.首先接受从caculator里面传递过来的两个数据
		cacResult = findViewById(R.id.cacResult);
		//得到intent对象
		Intent intent = getIntent();
		String factoryOne = intent.getStringExtra("one");
		String factoryTwo = intent.getStringExtra("two");
		//2.计算两个值的乘积
		Integer one = Integer.parseInt(factoryOne);
		Integer two = Integer.parseInt(factoryTwo);
		Integer reslutNum = one*two;
		//3.将计算后的结果显示出来
		cacResult.setText(reslutNum+"");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.cac_resut, menu);
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
