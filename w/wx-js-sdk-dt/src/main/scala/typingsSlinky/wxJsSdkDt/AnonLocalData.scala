package typingsSlinky.wxJsSdkDt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLocalData extends js.Object {
  var localData: String = js.native
}

object AnonLocalData {
  @scala.inline
  def apply(localData: String): AnonLocalData = {
    val __obj = js.Dynamic.literal(localData = localData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocalData]
  }
  @scala.inline
  implicit class AnonLocalDataOps[Self <: AnonLocalData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

