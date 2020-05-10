package typingsSlinky.screeps

import org.scalablytyped.runtime.TopLevel
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

@JSGlobal("StructureController")
@js.native
object StructureController extends TopLevel[StructureControllerConstructor]

