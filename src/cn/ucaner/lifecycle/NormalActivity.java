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
package cn.ucaner.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import cn.ucaner.R;


/**
 * @Package：cn.ucaner
 * @ClassName：SmsActivity
 * @Description：   <p> NormalActivity </p>
 * @Author： - Jason
 * @CreatTime：2018年12月19日 
 * @Modify By：
 * @ModifyTime：  2018年12月19日
 * @Modify marker：
 * @version    V1.0
 */
public class NormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
    }
}
