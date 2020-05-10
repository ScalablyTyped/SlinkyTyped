package typingsSlinky.smartFoxServer.SFS2X

import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSBuddy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBUDDY_ONLINE_STATE_CHANGE extends js.Object {
  var buddy: SFSBuddy = js.native
  var isItMe: Boolean = js.native
}

object IBUDDY_ONLINE_STATE_CHANGE {
  @scala.inline
  def apply(buddy: SFSBuddy, isItMe: Boolean): IBUDDY_ONLINE_STATE_CHANGE = {
    val __obj = js.Dynamic.literal(buddy = buddy.asInstanceOf[js.Any], isItMe = isItMe.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBUDDY_ONLINE_STATE_CHANGE]
  }
  @scala.inline
  implicit class IBUDDY_ONLINE_STATE_CHANGEOps[Self <: IBUDDY_ONLINE_STATE_CHANGE] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuddy(value: SFSBuddy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buddy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsItMe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isItMe")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

