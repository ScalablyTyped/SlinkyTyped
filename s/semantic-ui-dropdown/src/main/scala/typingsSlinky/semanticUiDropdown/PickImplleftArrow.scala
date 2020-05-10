package typingsSlinky.semanticUiDropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'leftArrow'> */
@js.native
trait PickImplleftArrow extends js.Object {
  var leftArrow: Double = js.native
}

object PickImplleftArrow {
  @scala.inline
  def apply(leftArrow: Double): PickImplleftArrow = {
    val __obj = js.Dynamic.literal(leftArrow = leftArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplleftArrow]
  }
  @scala.inline
  implicit class PickImplleftArrowOps[Self <: PickImplleftArrow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftArrow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftArrow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

