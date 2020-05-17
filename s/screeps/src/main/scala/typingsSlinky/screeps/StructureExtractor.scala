package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows to harvest mineral deposits.
  */
@js.native
trait StructureExtractor
  extends OwnedStructure[STRUCTURE_EXTRACTOR]
     with AnyOwnedStructure
     with ConcreteStructure[js.Any] {
  /**
    * The amount of game ticks until the next harvest action is possible.
    */
  var cooldown: Double = js.native
}

object StructureExtractor {
  @scala.inline
  def apply(
    cooldown: Double,
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructureExtractor],
    isActive: () => Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    structureType: STRUCTURE_EXTRACTOR
  ): StructureExtractor = {
    val __obj = js.Dynamic.literal(cooldown = cooldown.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureExtractor]
  }
  @scala.inline
  implicit class StructureExtractorOps[Self <: StructureExtractor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCooldown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cooldown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

