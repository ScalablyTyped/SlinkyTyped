package typingsSlinky.semanticUiPopup

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-popup.SemanticUI.PopupSettings._Impl, 'addTouchEvents'> */
@js.native
trait PickImpladdTouchEvents extends js.Object {
  var addTouchEvents: Boolean = js.native
}

object PickImpladdTouchEvents {
  @scala.inline
  def apply(addTouchEvents: Boolean): PickImpladdTouchEvents = {
    val __obj = js.Dynamic.literal(addTouchEvents = addTouchEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpladdTouchEvents]
  }
  @scala.inline
  implicit class PickImpladdTouchEventsOps[Self <: PickImpladdTouchEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTouchEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTouchEvents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

