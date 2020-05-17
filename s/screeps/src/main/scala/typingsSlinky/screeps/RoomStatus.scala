package typingsSlinky.screeps

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
  implicit def apply(value: RoomStatusPermanent): RoomStatus = value.asInstanceOf[RoomStatus]
  @scala.inline
  implicit def apply(value: RoomStatusTemporary): RoomStatus = value.asInstanceOf[RoomStatus]
}

