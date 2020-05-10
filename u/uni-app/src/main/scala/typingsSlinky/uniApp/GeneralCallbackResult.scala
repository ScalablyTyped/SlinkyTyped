package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneralCallbackResult extends js.Object {
  /**
    * 错误信息
    */
  var errMsg: js.UndefOr[String] = js.native
}

object GeneralCallbackResult {
  @scala.inline
  def apply(): GeneralCallbackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneralCallbackResult]
  }
  @scala.inline
  implicit class GeneralCallbackResultOps[Self <: GeneralCallbackResult] (val x: Self) extends AnyVal {
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
  }
  
}

