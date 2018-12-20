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
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
* @Package：cn.ucaner   
* @ClassName：CaculatorActivity   
* @Description：   <p> 计算器控件学习 </p>
* @Author： - Jason   
* @CreatTime：2018年12月20日 上午8:30:10   
* @Modify By：   
* @ModifyTime：  2018年12月20日
* @Modify marker：   
* @version    V1.0
 */
public class CaculatorActivity extends Activity {

	/**
	 * android常见的控件
	 * 
	 *   1.TextView的使用方法
	 * 
	 * 
	 *   2.EditText的使用方法
	 * 
	 * 
	 *   3.Button的使用方法
	 * 
	 * 
	 *   4.Menu的使用方法
	 * 
	 */
	
	/**
	 * 乘数
	 */
	private EditText factoryOne;
	
	/**
	 * 被乘数
	 */
	private EditText factoryTwo;
	
	/**
	 * 运算符
	 */
	private TextView sysmblo;
	
	/**
	 * 计算
	 */
	private Button  cacuBtn;
	
	/**
	 * step1.申明4个控件
	 * step2.为其中两个控件设置对应的初始值
	 * step3.创建一个监听器类 -- 监听按钮按下的动作
	 * step4.将监听器类对象 绑定在按钮上
	 * 
	 */
	
	/**
	 * 启动的时候初始化
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_caculator);//对应的布局文件
		
		factoryOne = findViewById(R.id.factorOne);
		
		factoryTwo = findViewById(R.id.factorTwo);
		
		sysmblo = findViewById(R.id.symblo);
		
		cacuBtn = findViewById(R.id.cacuBtn);
		
		//symblo cacuBtn 设置值
		//这里有问题  -- 不能语言上的配置  -- string.xml 解决
		sysmblo.setText(R.string.sysmblo);
		cacuBtn.setText("计算");
		
		//将监听器绑定到按钮对象上面
		cacuBtn.setOnClickListener(new CaculatorListener());
		
	}
	

	
	/**
	* @Package：cn.ucaner   
	* @ClassName：CaculatorListener   
	* @Description：   <p> 监听器的内部类  可以绑定到 按钮上面 </p>
	* @Author： - Jason   
	* @CreatTime：2018年12月20日 上午8:53:47   
	* @Modify By：   
	* @ModifyTime：  2018年12月20日
	* @Modify marker：   
	* @version    V1.0
	 */
	class CaculatorListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			//1.取得两个EditText控件的值
			String factorOneStr = factoryOne.getText().toString();
			String factorTwoStr = factoryTwo.getText().toString();
			
			//2.将这两个值放到intent对象里面
			Intent intent = new Intent();
			intent.putExtra("one", factorOneStr);
			intent.putExtra("two", factorTwoStr);
			
			//3.使用这个intent对象启动ReslutActivity
			intent.setClass(CaculatorActivity.this, CacResutActivity.class);
			startActivity(intent);
			
			
		}
		
		
	}
	/**
	 * 启动的时候创建选项菜单 
	 * 
	 * 当用户点击MENU按钮的时候  调用此时的方法
	 * 
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, 1, 1, R.string.exit);
		menu.add(0, 2, 2, R.string.about_me);
		//getMenuInflater().inflate(R.menu.caculator, menu);
		return super.onCreateOptionsMenu(menu);
	}

	/**
	 * 设置操作按钮的属性值  -- 根据点击来作出相应的处理
	 * 
	 * 点击菜单的某一个选项时 会调用该方法 
	 * 
	 * 根据判断来做出相应的操作
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();//menu 对应的id
		if (id == R.id.action_settings) {
			return true;
		}else if (id == 1) {
			finish();//结束应用程序
		}
		return super.onOptionsItemSelected(item);
	}

	
	/**
	 * 生命周期学习
	 * 
	 * 
	 * 
	 */
	/**
	 * 启动进入的时候加载
	 */
	@Override
	protected void onStart() {
		//System.out.println("onStart");
		super.onStart();
	}

	@Override
	protected void onRestart() {
		//System.out.println("onRestart");
		super.onRestart();
	}

	/**
	 * 可以获得用户的焦点的时候调用OnResume
	 */
	@Override
	protected void onResume() {
		//System.out.println("onResume");
		super.onResume();
	}
	
	
	@Override
	protected void onStop() {
		//System.out.println("onStop");
		super.onStop();
	}

	/**
	 * 第二个的时候  先onPause 
	 */
	@Override 
	protected void onPause() {
		super.onPause();
	}
	
	
	
}
