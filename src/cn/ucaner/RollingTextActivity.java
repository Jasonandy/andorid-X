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

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.app.Activity;
import android.view.animation.AccelerateDecelerateInterpolator;

import com.yy.mobile.rollingtextview.CharOrder;
import com.yy.mobile.rollingtextview.RollingTextView;
import com.yy.mobile.rollingtextview.strategy.Strategy;

/**
 * @Package：cn.ucaner
 * @ClassName：SmsActivity
 * @Description：   <p> RollingTextActivity  </p>
 * @Author： - Jason
 * @CreatTime：2018年12月19日 下午3:09:13
 * @Modify By：
 * @ModifyTime：  2018年12月19日
 * @Modify marker：
 * @version    V1.0
 */
public class RollingTextActivity extends Activity {


    /**
     * onCreate
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rolling_text);
        final RollingTextView rollingTextView = findViewById(R.id.alphaBetView);
        rollingTextView.setAnimationDuration(20000L);
        //rollingTextView.setCharStrategy(Strategy.CarryBitAnimation);
        rollingTextView.addCharOrder(CharOrder.Alphabet);
        rollingTextView.setAnimationInterpolator(new AccelerateDecelerateInterpolator());
        rollingTextView.addAnimatorListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {

            }
        });
        rollingTextView.setText("I'M JASON");
    }

}
