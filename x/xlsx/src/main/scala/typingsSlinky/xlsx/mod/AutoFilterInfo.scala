package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoFilterInfo extends WSKeys {
  /** Range of the AutoFilter table */
  var ref: String = js.native
}

object AutoFilterInfo {
  @scala.inline
  def apply(ref: String): AutoFilterInfo = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFilterInfo]
  }
  @scala.inline
  implicit class AutoFilterInfoOps[Self <: AutoFilterInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

