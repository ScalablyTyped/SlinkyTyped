package typingsSlinky.semanticUiDropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.DelaySettings._Impl, 'touch'> */
@js.native
trait PickImpltouch extends js.Object {
  var touch: Double = js.native
}

object PickImpltouch {
  @scala.inline
  def apply(touch: Double): PickImpltouch = {
    val __obj = js.Dynamic.literal(touch = touch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltouch]
  }
  @scala.inline
  implicit class PickImpltouchOps[Self <: PickImpltouch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTouch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

