/**
 * <html>
 * <body>
 *  <P> Copyright JasonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 2018年12月19日 下午8:39:32</p>
 *  <p> Created by Jason </p>
 *  </body>
 * </html>
 */
package cn.ucaner.fun;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import cn.ucaner.R;

/**     
* @Package：cn.ucaner.fun   
* @ClassName：ProfileActivity   
* @Description：   <p> ProfileActivity- 信息展示页面</p>
* @Author： - Jason   
* @CreatTime：2018年12月19日 下午8:39:32   
* @Modify By：   
* @ModifyTime：  2018年12月19日
* @Modify marker：   
* @version    V1.0
*/
public class ProfileActivity extends Activity{

	/**
	 * 启动常见和样式的配置
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile);
	}
	

	
	/**
	 * 设置菜单的配置
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.profile, menu);
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
