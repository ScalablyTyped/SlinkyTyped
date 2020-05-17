package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base prototype for a structure that has an owner. Such structures can be
  * found using `FIND_MY_STRUCTURES` and `FIND_HOSTILE_STRUCTURES` constants.
  */
@js.native
trait OwnedStructure[T /* <: StructureConstant */] extends Structure[T] {
  /**
    * Whether this is your own structure. Walls and roads don't have this property as they are considered neutral structures.
    */
  var my: js.UndefOr[Boolean] = js.native
  /**
    * An object with the structure’s owner info (if present) containing the following properties: username
    */
  var owner: js.UndefOr[Owner] = js.native
}

object OwnedStructure {
  @scala.inline
  def apply[T](
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[OwnedStructure[T]],
    isActive: () => Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    structureType: T
  ): OwnedStructure[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OwnedStructure[T]]
  }
  @scala.inline
  implicit class OwnedStructureOps[Self[t] <: OwnedStructure[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withMy(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("my")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("my")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: Owner): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
  }
  
}

