package typingsSlinky.smartFoxServer.SFS2X

import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IROOM_FIND_RESULT extends js.Object {
  var rooms: js.Array[SFSRoom] = js.native
}

object IROOM_FIND_RESULT {
  @scala.inline
  def apply(rooms: js.Array[SFSRoom]): IROOM_FIND_RESULT = {
    val __obj = js.Dynamic.literal(rooms = rooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[IROOM_FIND_RESULT]
  }
  @scala.inline
  implicit class IROOM_FIND_RESULTOps[Self <: IROOM_FIND_RESULT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRooms(value: js.Array[SFSRoom]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rooms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

