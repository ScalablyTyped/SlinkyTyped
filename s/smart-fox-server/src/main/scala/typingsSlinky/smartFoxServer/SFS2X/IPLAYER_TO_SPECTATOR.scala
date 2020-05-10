package typingsSlinky.smartFoxServer.SFS2X

import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSRoom
import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPLAYER_TO_SPECTATOR extends js.Object {
  var room: SFSRoom = js.native
  var user: SFSUser = js.native
}

object IPLAYER_TO_SPECTATOR {
  @scala.inline
  def apply(room: SFSRoom, user: SFSUser): IPLAYER_TO_SPECTATOR = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPLAYER_TO_SPECTATOR]
  }
  @scala.inline
  implicit class IPLAYER_TO_SPECTATOROps[Self <: IPLAYER_TO_SPECTATOR] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoom(value: SFSRoom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("room")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: SFSUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

