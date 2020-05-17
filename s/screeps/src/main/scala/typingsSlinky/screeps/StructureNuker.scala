package typingsSlinky.screeps

import typingsSlinky.screeps.anon.StoreRESOURCEENERGYRESOURAlloy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Launches a nuke to another room dealing huge damage to the landing area.
  * Each launch has a cooldown and requires energy and ghodium resources. Launching
  * creates a Nuke object at the target room position which is visible to any player
  * until it is landed. Incoming nuke cannot be moved or cancelled. Nukes cannot
  * be launched from or to novice rooms.
  */
@js.native
trait StructureNuker
  extends OwnedStructure[STRUCTURE_NUKER]
     with AnyOwnedStructure
     with AnyStoreStructure
     with ConcreteStructure[js.Any] {
  /**
    * The amount of game ticks the link has to wait until the next transfer is possible.
    */
  var cooldown: Double = js.native
  /**
    * The amount of energy contained in this structure.
    * @deprecated An alias for .store[RESOURCE_ENERGY].
    */
  var energy: Double = js.native
  /**
    * The total amount of energy this structure can contain.
    * @deprecated An alias for .store.getCapacity(RESOURCE_ENERGY).
    */
  var energyCapacity: Double = js.native
  /**
    * The amount of energy contained in this structure.
    * @deprecated An alias for .store[RESOURCE_GHODIUM].
    */
  var ghodium: Double = js.native
  /**
    * The total amount of energy this structure can contain.
    * @deprecated An alias for .store.getCapacity(RESOURCE_GHODIUM).
    */
  var ghodiumCapacity: Double = js.native
  /**
    * A Store object that contains cargo of this structure.
    */
  var store: StoreRESOURCEENERGYRESOURAlloy = js.native
  /**
    * Launch a nuke to the specified position.
    * @param pos The target room position.
    */
  def launchNuke(pos: RoomPosition): ScreepsReturnCode = js.native
}

object StructureNuker {
  @scala.inline
  def apply(
    cooldown: Double,
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    energy: Double,
    energyCapacity: Double,
    ghodium: Double,
    ghodiumCapacity: Double,
    hits: Double,
    hitsMax: Double,
    id: Id[StructureNuker],
    isActive: () => Boolean,
    launchNuke: RoomPosition => ScreepsReturnCode,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    room: Room,
    store: StoreRESOURCEENERGYRESOURAlloy,
    structureType: STRUCTURE_NUKER
  ): StructureNuker = {
    val __obj = js.Dynamic.literal(cooldown = cooldown.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], energyCapacity = energyCapacity.asInstanceOf[js.Any], ghodium = ghodium.asInstanceOf[js.Any], ghodiumCapacity = ghodiumCapacity.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), launchNuke = js.Any.fromFunction1(launchNuke), notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureNuker]
  }
  @scala.inline
  implicit class StructureNukerOps[Self <: StructureNuker] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withEnergy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("energy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnergyCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("energyCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhodium(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghodium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGhodiumCapacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghodiumCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunchNuke(value: RoomPosition => ScreepsReturnCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchNuke")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStore(value: StoreRESOURCEENERGYRESOURAlloy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

