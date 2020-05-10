package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExtConfigRes extends js.Object {
  /**
    * 调用结果
    */
  var errMsg: js.UndefOr[String] = js.native
  /**
    * 第三方平台自定义的数据
    */
  var extConfig: js.UndefOr[js.Any] = js.native
}

object GetExtConfigRes {
  @scala.inline
  def apply(): GetExtConfigRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExtConfigRes]
  }
  @scala.inline
  implicit class GetExtConfigResOps[Self <: GetExtConfigRes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(js.undefined)
        ret
    }
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

