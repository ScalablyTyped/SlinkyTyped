package typingsSlinky.smartFoxServer.SFS2X

import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSBuddy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBUDDY_MESSAGE extends js.Object {
  var buddy: SFSBuddy = js.native
  var data: js.Object = js.native
  var isItMe: Boolean = js.native
  var message: String = js.native
}

object IBUDDY_MESSAGE {
  @scala.inline
  def apply(buddy: SFSBuddy, data: js.Object, isItMe: Boolean, message: String): IBUDDY_MESSAGE = {
    val __obj = js.Dynamic.literal(buddy = buddy.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isItMe = isItMe.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBUDDY_MESSAGE]
  }
  @scala.inline
  implicit class IBUDDY_MESSAGEOps[Self <: IBUDDY_MESSAGE] (val x: Self) extends AnyVal {
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
    def withData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsItMe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isItMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

