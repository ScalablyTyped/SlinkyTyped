package typingsSlinky.weixinApp.wx

import typingsSlinky.weixinApp.AnonEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 云开发
// 文档：https://developers.weixin.qq.com/miniprogram/dev/wxcloud/basis/getting-started.html
@js.native
trait Cloud extends js.Object {
  /**
  		 * 接受一个 name 参数，指定需引用的集合名称
  		 */
  def collection(name: String): js.Object = js.native
  /**
  		 * 接受一个可选对象参数 env：环境 ID，获取数据库的引用
  		 */
  def database(options: AnonEnv): js.Object = js.native
  /**
  		 * 初始化方法（全局只需一次）
  		 */
  def init(options: InitCloudOptions): Unit = js.native
}

object Cloud {
  @scala.inline
  def apply(collection: String => js.Object, database: AnonEnv => js.Object, init: InitCloudOptions => Unit): Cloud = {
    val __obj = js.Dynamic.literal(collection = js.Any.fromFunction1(collection), database = js.Any.fromFunction1(database), init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[Cloud]
  }
  @scala.inline
  implicit class CloudOps[Self <: Cloud] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDatabase(value: AnonEnv => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInit(value: InitCloudOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

