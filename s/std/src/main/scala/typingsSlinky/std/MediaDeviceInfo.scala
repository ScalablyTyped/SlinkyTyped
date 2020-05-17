package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The MediaDevicesInfo interface contains information that describes a single media input or output device. */
@js.native
trait MediaDeviceInfo extends js.Object {
  val deviceId: java.lang.String = js.native
  val groupId: java.lang.String = js.native
  val kind: org.scalajs.dom.experimental.mediastream.MediaDeviceKind = js.native
  val label: java.lang.String = js.native
  def toJSON(): js.Any = js.native
}

object MediaDeviceInfo {
  @scala.inline
  def apply(
    deviceId: java.lang.String,
    groupId: java.lang.String,
    kind: org.scalajs.dom.experimental.mediastream.MediaDeviceKind,
    label: java.lang.String,
    toJSON: () => js.Any
  ): MediaDeviceInfo = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[MediaDeviceInfo]
  }
  @scala.inline
  implicit class MediaDeviceInfoOps[Self <: org.scalajs.dom.experimental.mediastream.MediaDeviceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: org.scalajs.dom.experimental.mediastream.MediaDeviceKind): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

