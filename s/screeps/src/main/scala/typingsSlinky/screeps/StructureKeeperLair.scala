package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Non-player structure. Spawns NPC Source Keepers that guards energy sources
  * and minerals in some rooms. This structure cannot be destroyed.
  */
@js.native
trait StructureKeeperLair
  extends OwnedStructure[STRUCTURE_KEEPER_LAIR]
     with AnyOwnedStructure
     with ConcreteStructure[js.Any] {
  /**
    * Time to spawning of the next Source Keeper.
    */
  var ticksToSpawn: js.UndefOr[Double] = js.native
}

object StructureKeeperLair {
  @scala.inline
  def apply(
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructureKeeperLair],
    isActive: () => Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_KEEPER_LAIR
  ): StructureKeeperLair = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureKeeperLair]
  }
  @scala.inline
  implicit class StructureKeeperLairOps[Self <: StructureKeeperLair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTicksToSpawn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksToSpawn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicksToSpawn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksToSpawn")(js.undefined)
        ret
    }
  }
  
}

