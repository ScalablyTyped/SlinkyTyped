package typingsSlinky.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Non-player structure. Contains power resource which can be obtained by
  * destroying the structure. Hits the attacker creep back on each attack.
  */
@js.native
trait StructurePowerSpawn
  extends OwnedStructure[STRUCTURE_POWER_SPAWN]
     with AnyOwnedStructure
     with AnyStoreStructure
     with ConcreteStructure[js.Any] {
  /**
    * The amount of energy containing in this structure.
    * @deprecated An alias for .store[RESOURCE_ENERGY].
    */
  var energy: Double = js.native
  /**
    * The total amount of energy this structure can contain.
    * @deprecated An alias for .store.getCapacity(RESOURCE_ENERGY).
    */
  var energyCapacity: Double = js.native
  /**
    * The amount of power containing in this structure.
    * @deprecated An alias for .store[RESOURCE_POWER].
    */
  var power: Double = js.native
  /**
    * The total amount of power this structure can contain.
    * @deprecated An alias for .store.getCapacity(RESOURCE_POWER).
    */
  var powerCapacity: Double = js.native
  /**
    *
    */
  var store: StoreRESOURCEENERGYRESOUR = js.native
  /**
    * Register power resource units into your account. Registered power allows to develop power creeps skills. Consumes 1 power resource unit and 50 energy resource units.
    */
  def processPower(): ScreepsReturnCode = js.native
}

@JSGlobal("StructurePowerSpawn")
@js.native
object StructurePowerSpawn extends TopLevel[StructurePowerSpawnConstructor]

