package typingsSlinky.smartFoxServer.SFS2X

import typingsSlinky.smartFoxServer.SFS2X.Entities.SFSRoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUSER_COUNT_CHANGE extends js.Object {
  var room: SFSRoom = js.native
  var sCount: Double = js.native
  var uCount: Double = js.native
}

object IUSER_COUNT_CHANGE {
  @scala.inline
  def apply(room: SFSRoom, sCount: Double, uCount: Double): IUSER_COUNT_CHANGE = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], sCount = sCount.asInstanceOf[js.Any], uCount = uCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUSER_COUNT_CHANGE]
  }
  @scala.inline
  implicit class IUSER_COUNT_CHANGEOps[Self <: IUSER_COUNT_CHANGE] (val x: Self) extends AnyVal {
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
    def withSCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

