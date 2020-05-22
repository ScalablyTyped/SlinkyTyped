package typingsSlinky.screeps

import typingsSlinky.screeps.screepsStrings.closed
import typingsSlinky.screeps.screepsStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomStatusPermanent extends RoomStatus {
  var status: normal | closed
  var timestamp: Null
}

object RoomStatusPermanent {
  @scala.inline
  def apply(status: normal | closed, timestamp: Null): RoomStatusPermanent = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomStatusPermanent]
  }
}

