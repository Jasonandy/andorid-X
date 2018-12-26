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

import android.os.Bundle;
import android.app.Activity;
import com.huanhailiuxin.coolviewpager.CoolViewPager;

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
public class CoolViewActivity extends Activity {

    /**
     * CoolViewPager
     */
    private CoolViewPager vp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cool_view);
       // initViewPager();
    }

    /**
     * initViewPager
     */
    private void initViewPager(){
        vp = findViewById(R.id.coolViewId);
        vp.setScrollMode(CoolViewPager.ScrollMode.VERTICAL);
        vp.setAutoScroll(true,1000);
        vp.setAutoScrollDirection(CoolViewPager.AutoScrollDirection.BACKWARD);
        vp.setInfiniteLoop(true);
        vp.setScrollDuration(true,600);
        vp.setDrawEdgeEffect(true);
        vp.setEdgeEffectColor(getResources().getColor(R.color.colorPrimary));
    }

}
