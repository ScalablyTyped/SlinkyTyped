package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSocketOpenCallbackResult extends js.Object {
  /**
    * 连接成功的 HTTP 响应 Header
    */
  var header: js.UndefOr[js.Any] = js.native
}

object OnSocketOpenCallbackResult {
  @scala.inline
  def apply(): OnSocketOpenCallbackResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnSocketOpenCallbackResult]
  }
  @scala.inline
  implicit class OnSocketOpenCallbackResultOps[Self <: OnSocketOpenCallbackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
  }
  
}

