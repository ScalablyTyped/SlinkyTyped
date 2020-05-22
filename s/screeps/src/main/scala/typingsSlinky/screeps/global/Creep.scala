package typingsSlinky.screeps.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.screeps.CreepConstructor
import typingsSlinky.screeps.Id
import typingsSlinky.screeps.RoomObjectEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Creep")
@js.native
class Creep protected ()
  extends typingsSlinky.screeps.Creep {
  def this(id: Id[typingsSlinky.screeps.Creep]) = this()
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

@JSGlobal("Creep")
@js.native
object Creep extends TopLevel[CreepConstructor]

