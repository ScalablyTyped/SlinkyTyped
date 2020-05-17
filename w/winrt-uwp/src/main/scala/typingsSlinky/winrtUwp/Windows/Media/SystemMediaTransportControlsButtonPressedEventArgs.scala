package typingsSlinky.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the SystemMediaTransportControls.ButtonPressed event. */
@js.native
trait SystemMediaTransportControlsButtonPressedEventArgs extends js.Object {
  /** Gets the button on the SystemMediaTransportControls that was pressed. */
  var button: SystemMediaTransportControlsButton = js.native
}

object SystemMediaTransportControlsButtonPressedEventArgs {
  @scala.inline
  def apply(button: SystemMediaTransportControlsButton): SystemMediaTransportControlsButtonPressedEventArgs = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMediaTransportControlsButtonPressedEventArgs]
  }
  @scala.inline
  implicit class SystemMediaTransportControlsButtonPressedEventArgsOps[Self <: SystemMediaTransportControlsButtonPressedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: SystemMediaTransportControlsButton): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

