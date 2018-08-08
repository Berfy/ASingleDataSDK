package cn.berfy.sdk.data.application.db.demo.view

import android.os.Bundle
import cn.berfy.sdk.data.R
import cn.berfy.sdk.data.application.db.demo.presenter.DemoDbPresenter

import cn.berfy.sdk.mvpbase.base.CommonActivity

class DemoDbActivity : CommonActivity<IDemoDbView, DemoDbPresenter>(), IDemoDbView {

    override fun getContentViewId(): Int {
        return R.layout.activity_demo_db
    }

    override fun initData(savedInstanceState: Bundle?) {

    }

    override fun initView() {
        showTitleBar()
        titleBar.setTitle("DbFlow数据库使用")
    }

    override fun initPresenter(): DemoDbPresenter {
        return DemoDbPresenter()
    }

    override fun hiddenLoadingView(msg: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showLoadingView(msg: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
