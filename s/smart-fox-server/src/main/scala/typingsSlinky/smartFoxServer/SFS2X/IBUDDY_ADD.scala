package typingsSlinky.smartFoxServer.SFS2X

import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSBuddy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBUDDY_ADD extends js.Object {
  var buddy: SFSBuddy = js.native
}

object IBUDDY_ADD {
  @scala.inline
  def apply(buddy: SFSBuddy): IBUDDY_ADD = {
    val __obj = js.Dynamic.literal(buddy = buddy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBUDDY_ADD]
  }
  @scala.inline
  implicit class IBUDDY_ADDOps[Self <: IBUDDY_ADD] (val x: Self) extends AnyVal {
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

