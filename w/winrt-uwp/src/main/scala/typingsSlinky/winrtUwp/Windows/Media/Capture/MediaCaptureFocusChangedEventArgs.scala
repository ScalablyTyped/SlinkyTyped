package typingsSlinky.winrtUwp.Windows.Media.Capture

import typingsSlinky.winrtUwp.Windows.Media.Devices.MediaCaptureFocusState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the FocusChanged event. */
@js.native
trait MediaCaptureFocusChangedEventArgs extends js.Object {
  /** Gets the current focus state of the capture device. */
  var focusState: MediaCaptureFocusState = js.native
}

object MediaCaptureFocusChangedEventArgs {
  @scala.inline
  def apply(focusState: MediaCaptureFocusState): MediaCaptureFocusChangedEventArgs = {
    val __obj = js.Dynamic.literal(focusState = focusState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCaptureFocusChangedEventArgs]
  }
  @scala.inline
  implicit class MediaCaptureFocusChangedEventArgsOps[Self <: MediaCaptureFocusChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocusState(value: MediaCaptureFocusState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

