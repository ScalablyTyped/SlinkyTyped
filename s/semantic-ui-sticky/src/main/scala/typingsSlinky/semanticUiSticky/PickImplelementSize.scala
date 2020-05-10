package typingsSlinky.semanticUiSticky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.Sticky.ErrorSettings._Impl, 'elementSize'> */
@js.native
trait PickImplelementSize extends js.Object {
  var elementSize: String = js.native
}

object PickImplelementSize {
  @scala.inline
  def apply(elementSize: String): PickImplelementSize = {
    val __obj = js.Dynamic.literal(elementSize = elementSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplelementSize]
  }
  @scala.inline
  implicit class PickImplelementSizeOps[Self <: PickImplelementSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

