package typingsSlinky.winrtUwp.Windows.UI.Text.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents information about a SelectionRequested event. */
@js.native
trait CoreTextSelectionRequest extends js.Object {
  /** Gets a value that indicates whether the selection request operation is canceled. */
  var isCanceled: Boolean = js.native
  /** Gets or sets the selection range that the text input server is requesting. The application should set the current range of selection before returning from the event handler. */
  var selection: CoreTextRange = js.native
  /**
    * Requests that the selection request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral = js.native
}

object CoreTextSelectionRequest {
  @scala.inline
  def apply(getDeferral: () => Deferral, isCanceled: Boolean, selection: CoreTextRange): CoreTextSelectionRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextSelectionRequest]
  }
  @scala.inline
  implicit class CoreTextSelectionRequestOps[Self <: CoreTextSelectionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDeferral(value: () => Deferral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeferral")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCanceled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCanceled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelection(value: CoreTextRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

