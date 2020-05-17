package typingsSlinky.winrtUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the MuteChangeRequested event. */
@js.native
trait MuteChangeRequestedEventArgs extends js.Object {
  /** Gets a value that indicates whether mute or unmute was requested. */
  var mute: Boolean = js.native
}

object MuteChangeRequestedEventArgs {
  @scala.inline
  def apply(mute: Boolean): MuteChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(mute = mute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuteChangeRequestedEventArgs]
  }
  @scala.inline
  implicit class MuteChangeRequestedEventArgsOps[Self <: MuteChangeRequestedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mute")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

