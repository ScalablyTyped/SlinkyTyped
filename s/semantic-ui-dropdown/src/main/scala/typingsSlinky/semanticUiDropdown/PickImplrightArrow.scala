package typingsSlinky.semanticUiDropdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.KeySettings._Impl, 'rightArrow'> */
@js.native
trait PickImplrightArrow extends js.Object {
  var rightArrow: Double = js.native
}

object PickImplrightArrow {
  @scala.inline
  def apply(rightArrow: Double): PickImplrightArrow = {
    val __obj = js.Dynamic.literal(rightArrow = rightArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrightArrow]
  }
  @scala.inline
  implicit class PickImplrightArrowOps[Self <: PickImplrightArrow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRightArrow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightArrow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

