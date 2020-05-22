package typingsSlinky.screeps

import typingsSlinky.screeps.screepsStrings.closed
import typingsSlinky.screeps.screepsStrings.normal
import typingsSlinky.screeps.screepsStrings.novice
import typingsSlinky.screeps.screepsStrings.respawn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.RoomStatusPermanent
  - typingsSlinky.screeps.RoomStatusTemporary
*/
trait RoomStatus extends js.Object

object RoomStatus {
  @scala.inline
  def RoomStatusPermanent(status: normal | closed, timestamp: Null): RoomStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomStatus]
  }
  @scala.inline
  def RoomStatusTemporary(status: novice | respawn, timestamp: Double): RoomStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoomStatus]
  }
}

