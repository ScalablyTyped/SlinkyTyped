package typingsSlinky.vueTelInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTelInputDowndownOption extends js.Object {
  var disabledDialCode: Boolean = js.native
}

object VueTelInputDowndownOption {
  @scala.inline
  def apply(disabledDialCode: Boolean): VueTelInputDowndownOption = {
    val __obj = js.Dynamic.literal(disabledDialCode = disabledDialCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueTelInputDowndownOption]
  }
  @scala.inline
  implicit class VueTelInputDowndownOptionOps[Self <: VueTelInputDowndownOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabledDialCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDialCode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

