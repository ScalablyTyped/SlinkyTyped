package typingsSlinky.semanticUiPopup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'distanceAway'> */
@js.native
trait PickImpldistanceAway extends js.Object {
  var distanceAway: Double = js.native
}

object PickImpldistanceAway {
  @scala.inline
  def apply(distanceAway: Double): PickImpldistanceAway = {
    val __obj = js.Dynamic.literal(distanceAway = distanceAway.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldistanceAway]
  }
  @scala.inline
  implicit class PickImpldistanceAwayOps[Self <: PickImpldistanceAway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistanceAway(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceAway")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

