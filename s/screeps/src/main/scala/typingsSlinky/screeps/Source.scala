package typingsSlinky.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An energy source object. Can be harvested by creeps with a WORK body part.
  */
@js.native
trait Source extends RoomObject {
  /**
    * The remaining amount of energy.
    */
  var energy: Double = js.native
  /**
    * The total amount of energy in the source. Equals to 3000 in most cases.
    */
  var energyCapacity: Double = js.native
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  var id: Id[this.type] = js.native
  /**
    * If you can get an instance of Source, you can see it.
    * If you can see a Source, you can see the room it's in.
    */
  @JSName("room")
  var room_Source: Room = js.native
  /**
    * The remaining time after which the source will be refilled.
    */
  var ticksToRegeneration: Double = js.native
}

@JSGlobal("Source")
@js.native
object Source extends TopLevel[SourceConstructor]

