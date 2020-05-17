package typingsSlinky.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a default audio capture device change event. */
@js.native
trait DefaultAudioCaptureDeviceChangedEventArgs extends js.Object {
  /** Gets the ID of the newly selected audio capture device that caused the change event. */
  var id: String = js.native
  /** Gets the role of the newly selected audio capture device that caused the change event. */
  var role: AudioDeviceRole = js.native
}

object DefaultAudioCaptureDeviceChangedEventArgs {
  @scala.inline
  def apply(id: String, role: AudioDeviceRole): DefaultAudioCaptureDeviceChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultAudioCaptureDeviceChangedEventArgs]
  }
  @scala.inline
  implicit class DefaultAudioCaptureDeviceChangedEventArgsOps[Self <: DefaultAudioCaptureDeviceChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: AudioDeviceRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

