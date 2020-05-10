package typingsSlinky.storybookUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFocussed extends js.Object {
  var focussed: Boolean = js.native
}

object AnonFocussed {
  @scala.inline
  def apply(focussed: Boolean): AnonFocussed = {
    val __obj = js.Dynamic.literal(focussed = focussed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFocussed]
  }
  @scala.inline
  implicit class AnonFocussedOps[Self <: AnonFocussed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocussed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focussed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

