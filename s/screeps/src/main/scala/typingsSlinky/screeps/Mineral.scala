package typingsSlinky.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mineral deposit object. Can be harvested by creeps with a WORK body part using the extractor structure.
  * @see http://docs.screeps.com/api/#Mineral
  */
@js.native
trait Mineral[T /* <: MineralConstant */] extends RoomObject {
  /**
    * The density of this mineral deposit, one of the `DENSITY_*` constants.
    */
  var density: Double = js.native
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  var id: Id[this.type] = js.native
  /**
    * The remaining amount of resources.
    */
  var mineralAmount: Double = js.native
  /**
    * The resource type, one of the `RESOURCE_*` constants.
    */
  var mineralType: T = js.native
  /**
    * The remaining time after which the deposit will be refilled.
    */
  var ticksToRegeneration: Double = js.native
}

@JSGlobal("Mineral")
@js.native
object Mineral extends TopLevel[MineralConstructor]

