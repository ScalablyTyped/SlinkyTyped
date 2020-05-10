package typingsSlinky.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Launches a nuke to another room dealing huge damage to the landing area.
  * Each launch has a cooldown and requires energy and ghodium resources. Launching
  * creates a Nuke object at the target room position which is visible to any player
  * until it is landed. Incoming nuke cannot be moved or cancelled. Nukes cannot
  * be launched from or to novice rooms.
  */
@js.native
trait StructureNuker
  extends OwnedStructure[STRUCTURE_NUKER]
     with AnyOwnedStructure
     with AnyStoreStructure
     with ConcreteStructure[js.Any] {
  /**
    * The amount of game ticks the link has to wait until the next transfer is possible.
    */
  var cooldown: Double = js.native
  /**
    * The amount of energy contained in this structure.
    * @deprecated An alias for .store[RESOURCE_ENERGY].
    */
  var energy: Double = js.native
  /**
    * The total amount of energy this structure can contain.
    * @deprecated An alias for .store.getCapacity(RESOURCE_ENERGY).
    */
  var energyCapacity: Double = js.native
  /**
    * The amount of energy contained in this structure.
    * @deprecated An alias for .store[RESOURCE_GHODIUM].
    */
  var ghodium: Double = js.native
  /**
    * The total amount of energy this structure can contain.
    * @deprecated An alias for .store.getCapacity(RESOURCE_GHODIUM).
    */
  var ghodiumCapacity: Double = js.native
  /**
    * A Store object that contains cargo of this structure.
    */
  var store: StoreRESOURCEENERGYRESOURAlloy = js.native
  /**
    * Launch a nuke to the specified position.
    * @param pos The target room position.
    */
  def launchNuke(pos: RoomPosition): ScreepsReturnCode = js.native
}

@JSGlobal("StructureNuker")
@js.native
object StructureNuker extends TopLevel[StructureNukerConstructor]

