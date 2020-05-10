package typingsSlinky.semanticUiPopup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.Popup.ErrorSettings._Impl, 'cannotPlace'> */
@js.native
trait PickImplcannotPlace extends js.Object {
  var cannotPlace: String = js.native
}

object PickImplcannotPlace {
  @scala.inline
  def apply(cannotPlace: String): PickImplcannotPlace = {
    val __obj = js.Dynamic.literal(cannotPlace = cannotPlace.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcannotPlace]
  }
  @scala.inline
  implicit class PickImplcannotPlaceOps[Self <: PickImplcannotPlace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCannotPlace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cannotPlace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

