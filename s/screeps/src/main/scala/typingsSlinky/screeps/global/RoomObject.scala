package typingsSlinky.screeps.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.screeps.RoomObjectConstructor
import typingsSlinky.screeps.RoomObjectEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("RoomObject")
@js.native
class RoomObject protected ()
  extends typingsSlinky.screeps.RoomObject {
  def this(x: Double, y: Double, roomName: String) = this()
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  override var effects: js.Array[RoomObjectEffect] = js.native
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: typingsSlinky.screeps.RoomPosition = js.native
}

@JSGlobal("RoomObject")
@js.native
object RoomObject extends TopLevel[RoomObjectConstructor]

