package typingsSlinky.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Any object with a position in a room. Almost all game objects prototypes
  * are derived from RoomObject.
  */
@js.native
trait RoomObject extends js.Object {
  /**
    * Applied effects, an array of objects with the following properties:
    */
  var effects: js.Array[RoomObjectEffect] = js.native
  /**
    * An object representing the position of this object in the room.
    */
  var pos: RoomPosition = js.native
  /**
    * The link to the Room object. May be undefined in case if an object is a
    * flag or a construction site and is placed in a room that is not visible
    * to you.
    */
  var room: js.UndefOr[Room] = js.native
}

@JSGlobal("RoomObject")
@js.native
object RoomObject extends TopLevel[RoomObjectConstructor]

