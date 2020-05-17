package typingsSlinky.screeps

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

object Mineral {
  @scala.inline
  def apply[T](
    density: Double,
    effects: js.Array[RoomObjectEffect],
    id: Id[Mineral[T]],
    mineralAmount: Double,
    mineralType: T,
    pos: RoomPosition,
    ticksToRegeneration: Double
  ): Mineral[T] = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mineralAmount = mineralAmount.asInstanceOf[js.Any], mineralType = mineralType.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], ticksToRegeneration = ticksToRegeneration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mineral[T]]
  }
  @scala.inline
  implicit class MineralOps[Self[t] <: Mineral[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDensity(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("density")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Id[Mineral[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMineralAmount(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mineralAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMineralType(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mineralType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicksToRegeneration(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksToRegeneration")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

