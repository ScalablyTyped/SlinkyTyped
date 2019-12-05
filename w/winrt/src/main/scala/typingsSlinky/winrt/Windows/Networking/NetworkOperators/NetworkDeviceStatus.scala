package typingsSlinky.winrt.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NetworkDeviceStatus extends js.Object

@JSGlobal("Windows.Networking.NetworkOperators.NetworkDeviceStatus")
@js.native
object NetworkDeviceStatus extends js.Object {
  @js.native
  sealed trait accountNotActivated extends NetworkDeviceStatus
  
  @js.native
  sealed trait badSim extends NetworkDeviceStatus
  
  @js.native
  sealed trait deviceBlocked extends NetworkDeviceStatus
  
  @js.native
  sealed trait deviceHardwareFailure extends NetworkDeviceStatus
  
  @js.native
  sealed trait deviceLocked extends NetworkDeviceStatus
  
  @js.native
  sealed trait deviceNotReady extends NetworkDeviceStatus
  
  @js.native
  sealed trait deviceReady extends NetworkDeviceStatus
  
  @js.native
  sealed trait simNotInserted extends NetworkDeviceStatus
  
  /* 5 */ val accountNotActivated: typingsSlinky.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.accountNotActivated with Double = js.native
  /* 3 */ val badSim: typingsSlinky.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.badSim with Double = js.native
  /* 7 */ val deviceBlocked: typingsSlinky.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceBlocked with Double = js.native
  /* 4 */ val deviceHardwareFailure: typingsSlinky.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceHardwareFailure with Double = js.native
  /* 6 */ val deviceLocked: typingsSlinky.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceLocked with Double = js.native
  /* 0 */ val deviceNotReady: typingsSlinky.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceNotReady with Double = js.native
  /* 1 */ val deviceReady: typingsSlinky.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.deviceReady with Double = js.native
  /* 2 */ val simNotInserted: typingsSlinky.winrt.Windows.Networking.NetworkOperators.NetworkDeviceStatus.simNotInserted with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NetworkDeviceStatus with Double] = js.native
}

