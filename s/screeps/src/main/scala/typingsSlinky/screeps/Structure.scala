package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parent object for structure classes
  */
@js.native
trait Structure[T /* <: StructureConstant */] extends RoomObject {
  /**
    * The current amount of hit points of the structure.
    */
  var hits: Double = js.native
  /**
    * The total amount of hit points of the structure.
    */
  var hitsMax: Double = js.native
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  var id: Id[this.type] = js.native
  /**
    * If you can get an instance of a Structure, you can see it.
    * If you can see the Structure, you can see the room it's in.
    */
  @JSName("room")
  var room_Structure: Room = js.native
  /**
    * One of the STRUCTURE_* constants.
    */
  var structureType: T = js.native
  /**
    * Destroy this structure immediately.
    */
  def destroy(): ScreepsReturnCode = js.native
  /**
    * Check whether this structure can be used. If the room controller level is not enough, then this method will return false, and the structure will be highlighted with red in the game.
    */
  def isActive(): Boolean = js.native
  /**
    * Toggle auto notification when the structure is under attack. The notification will be sent to your account email. Turned on by default.
    * @param enabled Whether to enable notification or disable.
    */
  def notifyWhenAttacked(enabled: Boolean): ScreepsReturnCode = js.native
}

object Structure {
  @scala.inline
  def apply[T](
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[Structure[T]],
    isActive: () => Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    structureType: T
  ): Structure[T] = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Structure[T]]
  }
  @scala.inline
  implicit class StructureOps[Self[t] <: Structure[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDestroy(value: () => ScreepsReturnCode): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHits(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHitsMax(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitsMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Id[Structure[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyWhenAttacked(value: Boolean => ScreepsReturnCode): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyWhenAttacked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRoom(value: Room): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("room")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStructureType(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structureType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

