package typingsSlinky.soap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSubcode extends js.Object {
  var Subcode: js.UndefOr[AnonValue] = js.native
  var Value: String = js.native
}

object AnonSubcode {
  @scala.inline
  def apply(Value: String): AnonSubcode = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubcode]
  }
  @scala.inline
  implicit class AnonSubcodeOps[Self <: AnonSubcode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubcode(value: AnonValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subcode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubcode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subcode")(js.undefined)
        ret
    }
  }
  
}

