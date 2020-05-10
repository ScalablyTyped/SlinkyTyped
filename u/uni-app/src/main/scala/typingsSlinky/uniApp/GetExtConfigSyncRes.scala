package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExtConfigSyncRes extends js.Object {
  /**
    * 第三方平台自定义的数据
    */
  var extConfig: js.UndefOr[js.Any] = js.native
}

object GetExtConfigSyncRes {
  @scala.inline
  def apply(): GetExtConfigSyncRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExtConfigSyncRes]
  }
  @scala.inline
  implicit class GetExtConfigSyncResOps[Self <: GetExtConfigSyncRes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extConfig")(js.undefined)
        ret
    }
  }
  
}

