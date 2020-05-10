package typingsSlinky.std

import typingsSlinky.std.stdStrings.camera
import typingsSlinky.std.stdStrings.microphone
import typingsSlinky.std.stdStrings.speaker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicePermissionDescriptor extends PermissionDescriptor {
  var deviceId: js.UndefOr[java.lang.String] = js.native
  @JSName("name")
  var name_DevicePermissionDescriptor: camera | microphone | speaker = js.native
}

object DevicePermissionDescriptor {
  @scala.inline
  def apply(name: camera | microphone | speaker): DevicePermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePermissionDescriptor]
  }
  @scala.inline
  implicit class DevicePermissionDescriptorOps[Self <: DevicePermissionDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: camera | microphone | speaker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceId(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(js.undefined)
        ret
    }
  }
  
}

