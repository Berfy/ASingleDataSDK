package cn.berfy.sdk.data.application.db.demo.tab

import cn.berfy.sdk.data.application.db.demo.AppDatabase
import com.raizlabs.android.dbflow.annotation.Column
import com.raizlabs.android.dbflow.annotation.PrimaryKey
import com.raizlabs.android.dbflow.annotation.Table
import com.raizlabs.android.dbflow.structure.BaseModel

import java.io.Serializable

@Table(database = AppDatabase::class)
class User : BaseModel(), Serializable {
    @Column
    lateinit var name: String
    @Column
    var age: Int = 0
    @Column
    var birthDay: Long = 0
    @Column
    var createTime: Long = 0

    @PrimaryKey(autoincrement = true)//ID自增
    var id: Long = 0
}