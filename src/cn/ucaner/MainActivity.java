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
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

/**
* @Package：cn.ucaner   
* @ClassName：MainActivity   
* @Description：   <p> MainActivity </p>
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
	private Button viewButton = null;
	
	/**
	 * 退出按钮
	 */
    private Button exitButton = null;
    
    
    /**
     * 离线地图按钮
     */
    private Button offlineMap = null;
    
    /**
     * 文本
     */
    private Context mContext;
    
    /**
     * 清除缓存
     */
    private Button clearCache = null;
    
    /**
     * 网络设置
     */
    private Button netSetting = null;
    
    

	/**
	 * onCreate 
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/**
		 * 查看按钮的点击事件
		 */
      /*  viewButton.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                //生成一个Intent对象 
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,TestActivity.class);
                MainActivity.this.startActivity(intent); //启动Activity
            }
        });*/
	}
	

	/**
	 * onCreateOptionsMenu 
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
		}
		return super.onOptionsItemSelected(item);
	}
}
