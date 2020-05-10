package typingsSlinky.std

import typingsSlinky.std.stdStrings.push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushPermissionDescriptor extends PermissionDescriptor {
  @JSName("name")
  var name_PushPermissionDescriptor: push = js.native
  var userVisibleOnly: js.UndefOr[scala.Boolean] = js.native
}

object PushPermissionDescriptor {
  @scala.inline
  def apply(name: push): PushPermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushPermissionDescriptor]
  }
  @scala.inline
  implicit class PushPermissionDescriptorOps[Self <: PushPermissionDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: push): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserVisibleOnly(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVisibleOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserVisibleOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVisibleOnly")(js.undefined)
        ret
    }
  }
  
}

