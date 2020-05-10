package typingsSlinky.smartFoxServer.SFS2X

import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSBuddy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBUDDY_REMOVE extends js.Object {
  var buddy: SFSBuddy = js.native
}

object IBUDDY_REMOVE {
  @scala.inline
  def apply(buddy: SFSBuddy): IBUDDY_REMOVE = {
    val __obj = js.Dynamic.literal(buddy = buddy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBUDDY_REMOVE]
  }
  @scala.inline
  implicit class IBUDDY_REMOVEOps[Self <: IBUDDY_REMOVE] (val x: Self) extends AnyVal {
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
  }
  
}

