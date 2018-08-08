package cn.berfy.sdk.data

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import cn.berfy.sdk.data.application.db.demo.tab.User
import cn.berfy.sdk.data.application.db.demo.view.DemoDbActivity
import cn.berfy.sdk.mvpbase.base.CommonActivity
import cn.berfy.sdk.mvpbase.iview.IBaseView
import cn.berfy.sdk.mvpbase.prensenter.BasePresenter
import com.raizlabs.android.dbflow.config.FlowManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : CommonActivity<IBaseView, BasePresenter<IBaseView>>(), View.OnClickListener {

    override fun getContentViewId(): Int {
        return R.layout.activity_main
    }

    override fun initData(savedInstanceState: Bundle?) {
    }

    override fun initView() {
        showTitleBar()
        titleBar.setTitle("ASingleData")
        FlowManager.init(applicationContext);
        var user: User = User()
        user.age = 1;
        user.birthDay = System.currentTimeMillis();
        user.createTime = System.currentTimeMillis();
        user.name = "A同学"
//        user.save()
        btn_db.setOnClickListener(this)
    }

    override fun initPresenter(): BasePresenter<IBaseView>? {
        return null
    }

    override fun onClick(v: View?) {
        when (v) {
            btn_db -> {
                startActivity(Intent(mContext, DemoDbActivity::class.java))
            }
        }
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }
}
