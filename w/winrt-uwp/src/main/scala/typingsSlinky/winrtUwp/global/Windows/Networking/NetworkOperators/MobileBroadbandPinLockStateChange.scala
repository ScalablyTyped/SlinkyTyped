package typingsSlinky.winrtUwp.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details of a PIN lock state change notification. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinLockStateChange")
@js.native
abstract class MobileBroadbandPinLockStateChange ()
  extends typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinLockStateChange {
  /** Gets the device identifier associated with a PIN lock state change. */
  /* CompleteClass */
  override var deviceId: String = js.native
  /** Gets a value representing the new PIN lock state after a PIN lock state change. */
  /* CompleteClass */
  override var pinLockState: typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinLockState = js.native
  /** Gets a value representing the type of PIN involved in a PIN lock state change. */
  /* CompleteClass */
  override var pinType: typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandPinType = js.native
}

