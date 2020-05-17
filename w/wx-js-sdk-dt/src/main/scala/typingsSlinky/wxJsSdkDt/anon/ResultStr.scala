package typingsSlinky.wxJsSdkDt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultStr extends js.Object {
  var resultStr: String = js.native
}

object ResultStr {
  @scala.inline
  def apply(resultStr: String): ResultStr = {
    val __obj = js.Dynamic.literal(resultStr = resultStr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultStr]
  }
  @scala.inline
  implicit class ResultStrOps[Self <: ResultStr] (val x: Self) extends AnyVal {
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

