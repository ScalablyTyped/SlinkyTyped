package typingsSlinky.winrtUwp.Windows.UI.Text.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Deferral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SelectionUpdating event. */
@js.native
trait CoreTextSelectionUpdatingEventArgs extends js.Object {
  /** Gets a value that indicates whether the selection update operation is canceled. */
  var isCanceled: Boolean = js.native
  /** Gets or sets a value that indicates the result of handling the SelectionUpdating event. The default value is Succeeded but if you can't action the operation as the text input server expects then before returning from the event handler set the property to the appropriate value to indicate what has happened. */
  var result: CoreTextSelectionUpdatingResult = js.native
  /** Gets a value that indicates the range of text that the text input server indicates should be selected. The server populates this property before raising the event. */
  var selection: CoreTextRange = js.native
  /**
    * Requests that the selection update operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral = js.native
}

object CoreTextSelectionUpdatingEventArgs {
  @scala.inline
  def apply(
    getDeferral: () => Deferral,
    isCanceled: Boolean,
    result: CoreTextSelectionUpdatingResult,
    selection: CoreTextRange
  ): CoreTextSelectionUpdatingEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextSelectionUpdatingEventArgs]
  }
  @scala.inline
  implicit class CoreTextSelectionUpdatingEventArgsOps[Self <: CoreTextSelectionUpdatingEventArgs] (val x: Self) extends AnyVal {
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
    def withResult(value: CoreTextSelectionUpdatingResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
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

