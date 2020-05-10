package typingsSlinky.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A dropped piece of resource. It will decay after a while if not picked up. Dropped resource pile decays for ceil(amount/1000) units per tick.
  */
@js.native
trait Resource[T /* <: ResourceConstant */] extends RoomObject {
  /**
    * The amount of resource units containing.
    */
  var amount: Double = js.native
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  var id: Id[this.type] = js.native
  /**
    * One of the `RESOURCE_*` constants.
    */
  var resourceType: T = js.native
}

@JSGlobal("Resource")
@js.native
object Resource extends TopLevel[ResourceConstructor]

