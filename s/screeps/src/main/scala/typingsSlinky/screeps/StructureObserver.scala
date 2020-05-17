package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides visibility into a distant room from your script.
  */
@js.native
trait StructureObserver
  extends OwnedStructure[STRUCTURE_OBSERVER]
     with AnyOwnedStructure
     with ConcreteStructure[js.Any] {
  /**
    * Provide visibility into a distant room from your script. The target room object will be available on the next tick. The maximum range is 5 rooms.
    * @param roomName The room to observe.
    */
  def observeRoom(roomName: String): ScreepsReturnCode = js.native
}

object StructureObserver {
  @scala.inline
  def apply(
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructureObserver],
    isActive: () => Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    observeRoom: String => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_OBSERVER
  ): StructureObserver = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), observeRoom = js.Any.fromFunction1(observeRoom), pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureObserver]
  }
  @scala.inline
  implicit class StructureObserverOps[Self <: StructureObserver] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObserveRoom(value: String => ScreepsReturnCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeRoom")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

