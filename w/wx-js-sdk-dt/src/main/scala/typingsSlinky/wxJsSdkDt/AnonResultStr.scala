package typingsSlinky.wxJsSdkDt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResultStr extends js.Object {
  var resultStr: String = js.native
}

object AnonResultStr {
  @scala.inline
  def apply(resultStr: String): AnonResultStr = {
    val __obj = js.Dynamic.literal(resultStr = resultStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResultStr]
  }
  @scala.inline
  implicit class AnonResultStrOps[Self <: AnonResultStr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResultStr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultStr")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

