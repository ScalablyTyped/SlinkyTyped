package typingsSlinky.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MobileBroadbandPinLockState extends js.Object
/** Describes the possible PIN lock states of a mobile broadband PIN. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandPinLockState")
@js.native
object MobileBroadbandPinLockState extends js.Object {
  
  /** A PIN input is required. The MobileBroadbandPinType will contain more information on which PIN is needed. */
  @js.native
  sealed trait pinRequired extends MobileBroadbandPinLockState
  
  /** An invalid PIN has been entered too often and a PIN Unblock Key (PUK) is needed to proceed. */
  @js.native
  sealed trait pinUnblockKeyRequired extends MobileBroadbandPinLockState
  
  /** The PIN lock state is unknown. */
  @js.native
  sealed trait unknown extends MobileBroadbandPinLockState
  
  /** The PIN lock state is unlocked. */
  @js.native
  sealed trait unlocked extends MobileBroadbandPinLockState
}
