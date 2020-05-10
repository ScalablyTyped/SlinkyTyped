package typingsSlinky.socketIo.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The interface describing a room
	 */
@js.native
trait Room extends js.Object {
  var length: Double = js.native
  var sockets: StringDictionary[Boolean] = js.native
}

object Room {
  @scala.inline
  def apply(length: Double, sockets: StringDictionary[Boolean]): Room = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], sockets = sockets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Room]
  }
  @scala.inline
  implicit class RoomOps[Self <: Room] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSockets(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sockets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

