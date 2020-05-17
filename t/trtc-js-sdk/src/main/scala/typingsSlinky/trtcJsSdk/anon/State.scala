package typingsSlinky.trtcJsSdk.anon

import typingsSlinky.trtcJsSdk.trtcJsSdkStrings.PAUSED
import typingsSlinky.trtcJsSdk.trtcJsSdkStrings.PLAYING
import typingsSlinky.trtcJsSdk.trtcJsSdkStrings.STOPPED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var state: PLAYING | PAUSED | STOPPED = js.native
  var `type`: String = js.native
}

object State {
  @scala.inline
  def apply(state: PLAYING | PAUSED | STOPPED, `type`: String): State = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withState(value: PLAYING | PAUSED | STOPPED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

