package typingsSlinky.screeps

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

object Resource {
  @scala.inline
  def apply[T](
    amount: Double,
    effects: js.Array[RoomObjectEffect],
    id: Id[Resource[T]],
    pos: RoomPosition,
    resourceType: T
  ): Resource[T] = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource[T]]
  }
  @scala.inline
  implicit class ResourceOps[Self[t] <: Resource[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAmount(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Id[Resource[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

