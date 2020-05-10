package typingsSlinky.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Non-player structure. Contains power resource which can be obtained by destroying the structure. Hits the attacker creep back on each attack.
  */
@js.native
trait StructurePowerBank
  extends OwnedStructure[STRUCTURE_POWER_BANK]
     with AnyOwnedStructure
     with ConcreteStructure[js.Any] {
  /**
    * The amount of power containing.
    */
  var power: Double = js.native
  /**
    * The amount of game ticks when this structure will disappear.
    */
  var ticksToDecay: Double = js.native
}

@JSGlobal("StructurePowerBank")
@js.native
object StructurePowerBank extends TopLevel[StructurePowerBankConstructor]

