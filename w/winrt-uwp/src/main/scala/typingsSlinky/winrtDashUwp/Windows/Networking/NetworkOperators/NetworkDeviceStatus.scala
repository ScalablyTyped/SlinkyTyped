package typingsSlinky.winrtDashUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkDeviceStatus extends js.Object

/** Describes the readiness of a device to connect to a wireless network. */
@JSGlobal("Windows.Networking.NetworkOperators.NetworkDeviceStatus")
@js.native
object NetworkDeviceStatus extends js.Object {
  /** A subscription account for the mobile broadband device is not active. */
  @js.native
  sealed trait accountNotActivated extends NetworkDeviceStatus
  
  /** The SIM card is not valid. This can occur when PIN Unblock Key attempts have exceeded the limit. */
  @js.native
  sealed trait badSim extends NetworkDeviceStatus
  
  /** The mobile broadband device is blocked by a PIN or password preventing the device from initializing and registering with a wireless network. */
  @js.native
  sealed trait deviceBlocked extends NetworkDeviceStatus
  
  /** The mobile broadband device hardware is not responding. */
  @js.native
  sealed trait deviceHardwareFailure extends NetworkDeviceStatus
  
  /** The mobile broadband device is locked by a PIN or password preventing the device from initializing and registering with a wireless network. */
  @js.native
  sealed trait deviceLocked extends NetworkDeviceStatus
  
  /** The mobile broadband device is off. */
  @js.native
  sealed trait deviceNotReady extends NetworkDeviceStatus
  
  /** The device is powered on and ready for mobile broadband operations. */
  @js.native
  sealed trait deviceReady extends NetworkDeviceStatus
  
  /** The mobile broadband device does not have a SIM card. */
  @js.native
  sealed trait simNotInserted extends NetworkDeviceStatus
  
  /* 5 */ val accountNotActivated: typingsSlinky.winrtDashUwp.Windows.Networking.NetworkOperators.NetworkDeviceStatus.accountNotActivated with Double = js.native
  /* 3 */ val badSim: typingsSlinky.winrtDashUwp.Windows.Networking.NetworkOperators.NetworkDeviceStatus.badSim with Double = js.native
  /* 7 */ val deviceBlocked: typingsSlinky.winrtDashUwp.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceBlocked with Double = js.native
  /* 4 */ val deviceHardwareFailure: typingsSlinky.winrtDashUwp.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceHardwareFailure with Double = js.native
  /* 6 */ val deviceLocked: typingsSlinky.winrtDashUwp.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceLocked with Double = js.native
  /* 0 */ val deviceNotReady: typingsSlinky.winrtDashUwp.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceNotReady with Double = js.native
  /* 1 */ val deviceReady: typingsSlinky.winrtDashUwp.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceReady with Double = js.native
  /* 2 */ val simNotInserted: typingsSlinky.winrtDashUwp.Windows.Networking.NetworkOperators.NetworkDeviceStatus.simNotInserted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkDeviceStatus with Double] = js.native
}

