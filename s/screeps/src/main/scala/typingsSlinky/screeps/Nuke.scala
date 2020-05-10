package typingsSlinky.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A nuke landing position. This object cannot be removed or modified. You can find incoming nukes in the room using the FIND_NUKES constant.
  */
@js.native
trait Nuke extends RoomObject {
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  var id: Id[this.type] = js.native
  /**
    * The name of the room where this nuke has been launched from.
    */
  var launchRoomName: String = js.native
  /**
    * The remaining landing time.
    */
  var timeToLand: Double = js.native
}

@JSGlobal("Nuke")
@js.native
object Nuke extends TopLevel[NukeConstructor]

