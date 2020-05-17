package typingsSlinky.winrtUwp.Windows.Gaming.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an audio headset attached to a gamepad. */
@js.native
trait Headset extends js.Object {
  /** The XAudio endpoint ID for the headset's audio capture device. */
  var captureDeviceId: String = js.native
  /** The XAudio enpoint ID for the headset's audio render device. */
  var renderDeviceId: String = js.native
}

object Headset {
  @scala.inline
  def apply(captureDeviceId: String, renderDeviceId: String): Headset = {
    val __obj = js.Dynamic.literal(captureDeviceId = captureDeviceId.asInstanceOf[js.Any], renderDeviceId = renderDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headset]
  }
  @scala.inline
  implicit class HeadsetOps[Self <: Headset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptureDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureDeviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderDeviceId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

