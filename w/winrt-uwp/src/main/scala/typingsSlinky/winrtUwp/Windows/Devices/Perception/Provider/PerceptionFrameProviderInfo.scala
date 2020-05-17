package typingsSlinky.winrtUwp.Windows.Devices.Perception.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A specific set of properties describing a unique IPerceptionFrameProvider. */
@js.native
trait PerceptionFrameProviderInfo extends js.Object {
  /** Gets or sets the descriptor of the kind of FrameProvider categorically, for example, "com.contoso.depthcamera.x500". */
  var deviceKind: String = js.native
  /** Gets or sets the friendly name for the device, for example, "Contoso Depth Camera x500". */
  var displayName: String = js.native
  /** Gets or sets the type of frames the device creates. */
  var frameKind: String = js.native
  /** Gets or sets a value indicating whether the device enumerates via FindAllAsync or device-added events on source watchers. */
  var hidden: Boolean = js.native
  /** Gets or sets the unique identifier of the IPerceptionFrameProvider. */
  var id: String = js.native
}

object PerceptionFrameProviderInfo {
  @scala.inline
  def apply(deviceKind: String, displayName: String, frameKind: String, hidden: Boolean, id: String): PerceptionFrameProviderInfo = {
    val __obj = js.Dynamic.literal(deviceKind = deviceKind.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], frameKind = frameKind.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionFrameProviderInfo]
  }
  @scala.inline
  implicit class PerceptionFrameProviderInfoOps[Self <: PerceptionFrameProviderInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrameKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameKind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

