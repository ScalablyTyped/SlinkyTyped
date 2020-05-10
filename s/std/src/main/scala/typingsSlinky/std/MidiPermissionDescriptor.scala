package typingsSlinky.std

import typingsSlinky.std.stdStrings.midi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MidiPermissionDescriptor extends PermissionDescriptor {
  @JSName("name")
  var name_MidiPermissionDescriptor: midi = js.native
  var sysex: js.UndefOr[scala.Boolean] = js.native
}

object MidiPermissionDescriptor {
  @scala.inline
  def apply(name: midi): MidiPermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MidiPermissionDescriptor]
  }
  @scala.inline
  implicit class MidiPermissionDescriptorOps[Self <: MidiPermissionDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: midi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSysex(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sysex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSysex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sysex")(js.undefined)
        ret
    }
  }
  
}

