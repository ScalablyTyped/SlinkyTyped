package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Non-player structure. Contains power resource which can be obtained by destroying the structure. Hits the attacker creep back on each attack.
  */
@js.native
trait StructurePowerBank
  extends OwnedStructure[STRUCTURE_POWER_BANK]
     with AnyOwnedStructure
     with ConcreteStructure[js.Any] {
  /**
    * The amount of power containing.
    */
  var power: Double = js.native
  /**
    * The amount of game ticks when this structure will disappear.
    */
  var ticksToDecay: Double = js.native
}

object StructurePowerBank {
  @scala.inline
  def apply(
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructurePowerBank],
    isActive: () => Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    power: Double,
    room: Room,
    structureType: STRUCTURE_POWER_BANK,
    ticksToDecay: Double
  ): StructurePowerBank = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any], ticksToDecay = ticksToDecay.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructurePowerBank]
  }
  @scala.inline
  implicit class StructurePowerBankOps[Self <: StructurePowerBank] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPower(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("power")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicksToDecay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksToDecay")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

