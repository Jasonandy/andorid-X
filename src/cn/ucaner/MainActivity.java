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
import android.widget.Button;
import android.widget.Toast;

/**
* @Package：cn.ucaner   
* @ClassName：MainActivity   
* @Description：   <p> MainActivity 
* 创建activity的要点
* 	1.一个就是一个类 
* 	2.需要继承Activity
* 	3.需要复习oncreate() 第一次运行时会调用方法
* 	4.Activity是个组件 所以需要注册到 manifest清单
* 	5.需要给这个添加一下 "控件" 
* </p>
* @Author： - Jason   
* @CreatTime：2018年12月14日 下午4:14:44   
* @Modify By：   
* @ModifyTime：  2018年12月14日
* @Modify marker：   
* @version    V1.0
 */
public class MainActivity extends Activity {
	
	/**
	 * 显示按钮
	 */
	//private Button viewButton = null;
	
	/**
	 * 退出按钮
	 */
    //private Button exitButton = null;
    
    
    /**
     * 离线地图按钮
     */
    //private Button offlineMap = null;
    
    /**
     * 文本
     */
    //private Context mContext;
    
    /**
     * 清除缓存
     */
    //private Button clearCache = null;
    
    /**
     * 网络设置
     */
    //private Button netSetting = null;
    
	/**
	 * 测试按钮
	 */
	//private Button myBtn = null;
	
	
	/**
	 * 发送sms按钮
	 */
	private Button toSendBtn = null;
	
	/**
	 * 显示提示按钮
	 */
	private Button showMeBtn = null;
	
	
	/**
	 * 计算按钮
	 */
	private Button cacuTipBtn = null;
    

	/**
	 * onCreate 
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main); //activity_main 设置布局文件
		 
		//得到一个“控件”
//		TextView myTextView = (TextView)findViewById(R.id.mytextView);
//		myBtn = findViewById(R.id.myBtn);
//		
//		myTextView.setText("You are what you want to be .");
		//myBtn.setText("Click");
		
		
		/**
		 * 点击btn作出相应的处理 - setOnClickListener
		 */
//		myBtn.setOnClickListener(new Button.OnClickListener(){
//            public void onClick(View view){
//                //生成一个Intent对象 
//                Intent intent = new Intent();
                /**
                 * http://www.cnblogs.com/engine1984/p/4146621.html
                 * 
                 * Android中提供了Intent机制来协助应用间的交互与通讯，或者采用更准确的说法是，Intent不仅可用于应用程序之间，
                 * 		也可用于应用程序内部的activity, service和broadcast receiver之间的交互。Intent这个英语单词的本意是“目的、意向、意图”
                 * 
                 * Intent是一种运行时绑定（runtime binding)机制，它能在程序运行的过程中连接两个不同的组件。
                 * 		通过Intent，你的程序可以向Android表达某种请求或者意愿，Android会根据意愿的内容选择适当的组件来响应。
                 * 
                 * activity、service和broadcast receiver之间是通过Intent进行通信的，而另外一个组件Content Provider本身就是一种通信机制，不需要通过Intent.
                 * 
                 * 		如果Activity1需要和Activity2进行联系，二者不需要直接联系，而是通过Intent作为桥梁。通俗来讲，Intnet类似于中介、媒婆的角色。
                 * -------------------------------------------------------------------------------------------------------------------------
                 * 1.使用Context.startActivity() 或 Activity.startActivityForResult()，传入一个intent来启动一个activity
                 * 		使用 Activity.setResult()，传入一个intent来从activity中返回结果。
                 * 2.将intent对象传给Context.startService()来启动一个service或者传消息给一个运行的service。
                 * 		将intent对象传给 Context.bindService()来绑定一个service。
                 * 3.将intent对象传给 Context.sendBroadcast()，Context.sendOrderedBroadcast()
                 * 		或者Context.sendStickyBroadcast()等广播方法，则它们被传给 broadcast receiver
                 * --------------------------------------------------------------------------------------------------------------------------
                 * Intent由以下各个组成部分：
				 * component(组件)：目的组件
				 * action（动作）：用来表现意图的行动
				 * category（类别）：用来表现动作的类别
				 * data（数据）：表示与动作要操纵的数据
				 * type（数据类型）：对于data范例的描写
				 * extras（扩展信息）：扩展信息
				 * Flags（标志位）：期望这个意图的运行模式
                 * 
                 * 
                 */
                
                /**
                 * 1.setClass函数的第一个参数是一个Context对象
                 * 2.Context是一个类，Activity是Context类的子类，也就是说，所有的Activity对象，都可以向上转型为Context对象
                 * setClass函数的第二个参数是一个Class对象，在当前场景下，应该传入需要被启动的Activity类的class对象
                 */
//                intent.putExtra("username", "root");
//                
//                intent.setClass(MainActivity.this,TestActivity.class); //ComponentName 内部其实就是传递到Component了 MainActivity--->TestActivity
//                startActivity(intent); //启动Activity
//            }
//        });
		
		/**
		 * 发送短信
		 */
		toSendBtn = findViewById(R.id.toSend);
		toSendBtn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                //生成一个Intent对象 
                Intent intent = new Intent();
                intent.putExtra("to", "18612344321");
                intent.putExtra("send_body", "Hi I'm Jason!");
                intent.setClass(MainActivity.this,SmsActivity.class); //ComponentName 内部其实就是传递到Component了 MainActivity--->TestActivity
                startActivity(intent); //启动Activity
            }
        });
		
		/**
		 * 显示按钮
		 */
		showMeBtn = findViewById(R.id.showTip);
		showMeBtn.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast toast=Toast.makeText(getApplicationContext(), "I'M JASON!", Toast.LENGTH_SHORT); 
				//第一个参数：设置toast在屏幕中显示的位置。我现在的设置是居中靠顶 
				//第二个参数：相对于第一个参数设置toast位置的横向X轴的偏移量，正数向右偏移，负数向左偏移 
				//第三个参数：同的第二个参数道理一样 
				//如果你设置的偏移量超过了屏幕的范围，toast将在屏幕内靠近超出的那个边界显示 
				//toast.setGravity(Gravity.TOP|Gravity.CENTER, -50, 100); 
				//屏幕居中显示 X轴和Y轴偏移量都是0 
				//toast.setGravity(Gravity.CENTER, 0, 0); 
				toast.show();
			}
			
		});
		
		//cacuTipBtn
		cacuTipBtn = findViewById(R.id.cacu_tip);
		cacuTipBtn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                //生成一个Intent对象 
                Intent intent = new Intent();
                intent.putExtra("to", "18612344321");
                intent.putExtra("send_body", "Hi I'm Jason!");
                intent.setClass(MainActivity.this,CaculatorActivity.class); //ComponentName 内部其实就是传递到Component了 MainActivity--->TestActivity
                startActivity(intent); //启动Activity
            }
        });
		
	}
	

	/**
	 * onCreateOptionsMenu   -- 初始化设置菜单
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	/**
	 * onOptionsItemSelected 
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}else if (id == R.id.action_settings_aa) {
//			toSendBtn = findViewById(id);
//			toSendBtn.setOnClickListener(new Button.OnClickListener() {
//				@Override
//				public void onClick(View v) {
//					Intent intent = new Intent();
//	                intent.putExtra("to", "18612344321");
//	                intent.putExtra("send_body", "Hi I'm Jason!");
//	                intent.setClass(MainActivity.this,ProfileActivity.class); //ComponentName 内部其实就是传递到Component了 MainActivity--->TestActivity
//	                startActivity(intent); //启动Activity
//				}
//			});
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
