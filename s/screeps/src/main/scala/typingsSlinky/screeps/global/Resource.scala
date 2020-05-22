package typingsSlinky.screeps.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.screeps.Id
import typingsSlinky.screeps.ResourceConstant
import typingsSlinky.screeps.ResourceConstructor
import typingsSlinky.screeps.RoomObjectEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Resource")
@js.native
class Resource protected ()
  extends typingsSlinky.screeps.Resource[ResourceConstant] {
  def this(id: Id[typingsSlinky.screeps.Resource[ResourceConstant]]) = this()
  /**
    * The amount of resource units containing.
    */
  /* CompleteClass */
  override var amount: Double = js.native
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  override var effects: js.Array[RoomObjectEffect] = js.native
  /**
    * A unique object identifier. You can use `Game.getObjectById` method to retrieve an object instance by its `id`.
    */
  /* CompleteClass */
  override var id: Id[this.type] = js.native
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  override var pos: typingsSlinky.screeps.RoomPosition = js.native
  /**
    * One of the `RESOURCE_*` constants.
    */
  /* CompleteClass */
  override var resourceType: ResourceConstant = js.native
}

@JSGlobal("Resource")
@js.native
object Resource extends TopLevel[ResourceConstructor]

