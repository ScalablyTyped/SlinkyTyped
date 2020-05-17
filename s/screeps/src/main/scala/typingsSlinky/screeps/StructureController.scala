package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Claim this structure to take control over the room. The controller structure
  * cannot be damaged or destroyed. It can be addressed by `Room.controller`
  * property.
  */
@js.native
trait StructureController
  extends OwnedStructure[STRUCTURE_CONTROLLER]
     with AnyOwnedStructure
     with ConcreteStructure[js.Any] {
  /**
    * Whether using power is enabled in this room.
    *
    * Use `PowerCreep.enableRoom()` to turn powers on.
    */
  var isPowerEnabled: Boolean = js.native
  /**
    * Current controller level, from 0 to 8.
    */
  var level: Double = js.native
  /**
    * The current progress of upgrading the controller to the next level.
    */
  var progress: Double = js.native
  /**
    * The progress needed to reach the next level.
    */
  var progressTotal: Double = js.native
  /**
    * An object with the controller reservation info if present: username, ticksToEnd
    */
  var reservation: js.UndefOr[ReservationDefinition] = js.native
  /**
    * How many ticks of safe mode are remaining, or undefined.
    */
  var safeMode: js.UndefOr[Double] = js.native
  /**
    * Safe mode activations available to use.
    */
  var safeModeAvailable: Double = js.native
  /**
    * During this period in ticks new safe mode activations will be blocked, undefined if cooldown is inactive.
    */
  var safeModeCooldown: js.UndefOr[Double] = js.native
  /**
    * An object with the controller sign info if present
    */
  var sign: js.UndefOr[SignDefinition] = js.native
  /**
    * The amount of game ticks when this controller will lose one level. This timer can be reset by using Creep.upgradeController.
    */
  var ticksToDowngrade: Double = js.native
  /**
    * The amount of game ticks while this controller cannot be upgraded due to attack.
    */
  var upgradeBlocked: Double = js.native
  /**
    * Activate safe mode if available.
    * @returns Result Code: OK, ERR_NOT_OWNER, ERR_BUSY, ERR_NOT_ENOUGH_RESOURCES, ERR_TIRED
    */
  def activateSafeMode(): ScreepsReturnCode = js.native
  /**
    * Make your claimed controller neutral again.
    */
  def unclaim(): ScreepsReturnCode = js.native
}

object StructureController {
  @scala.inline
  def apply(
    activateSafeMode: () => ScreepsReturnCode,
    destroy: () => ScreepsReturnCode,
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructureController],
    isActive: () => Boolean,
    isPowerEnabled: Boolean,
    level: Double,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    pos: RoomPosition,
    progress: Double,
    progressTotal: Double,
    room: Room,
    safeModeAvailable: Double,
    structureType: STRUCTURE_CONTROLLER,
    ticksToDowngrade: Double,
    unclaim: () => ScreepsReturnCode,
    upgradeBlocked: Double
  ): StructureController = {
    val __obj = js.Dynamic.literal(activateSafeMode = js.Any.fromFunction0(activateSafeMode), destroy = js.Any.fromFunction0(destroy), effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), isPowerEnabled = isPowerEnabled.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), pos = pos.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], progressTotal = progressTotal.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], safeModeAvailable = safeModeAvailable.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any], ticksToDowngrade = ticksToDowngrade.asInstanceOf[js.Any], unclaim = js.Any.fromFunction0(unclaim), upgradeBlocked = upgradeBlocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureController]
  }
  @scala.inline
  implicit class StructureControllerOps[Self <: StructureController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivateSafeMode(value: () => ScreepsReturnCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateSafeMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPowerEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPowerEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgressTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSafeModeAvailable(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeModeAvailable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTicksToDowngrade(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksToDowngrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnclaim(value: () => ScreepsReturnCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unclaim")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpgradeBlocked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgradeBlocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReservation(value: ReservationDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservation")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSafeModeCooldown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeModeCooldown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafeModeCooldown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeModeCooldown")(js.undefined)
        ret
    }
    @scala.inline
    def withSign(value: SignDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign")(js.undefined)
        ret
    }
  }
  
}

