package typingsSlinky.semanticUiPopup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl, 'invalidPosition'> */
@js.native
trait PickImplinvalidPosition extends js.Object {
  var invalidPosition: String = js.native
}

object PickImplinvalidPosition {
  @scala.inline
  def apply(invalidPosition: String): PickImplinvalidPosition = {
    val __obj = js.Dynamic.literal(invalidPosition = invalidPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinvalidPosition]
  }
  @scala.inline
  implicit class PickImplinvalidPositionOps[Self <: PickImplinvalidPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvalidPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidPosition")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

