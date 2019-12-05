package typingsSlinky.winrtDashUwp.Windows.Devices.Radios

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RadioKind extends js.Object

/** Enumeration that represents the kinds of radio devices. */
@JSGlobal("Windows.Devices.Radios.RadioKind")
@js.native
object RadioKind extends js.Object {
  /** A Bluetooth radio. */
  @js.native
  sealed trait bluetooth extends RadioKind
  
  /** An FM radio. */
  @js.native
  sealed trait fm extends RadioKind
  
  /** A mobile broadband radio. */
  @js.native
  sealed trait mobileBroadband extends RadioKind
  
  /** An unspecified kind of radio device. */
  @js.native
  sealed trait other extends RadioKind
  
  /** A Wi-Fi radio. */
  @js.native
  sealed trait wiFi extends RadioKind
  
  /* 3 */ val bluetooth: typingsSlinky.winrtDashUwp.Windows.Devices.Radios.RadioKind.bluetooth with Double = js.native
  /* 4 */ val fm: typingsSlinky.winrtDashUwp.Windows.Devices.Radios.RadioKind.fm with Double = js.native
  /* 2 */ val mobileBroadband: typingsSlinky.winrtDashUwp.Windows.Devices.Radios.RadioKind.mobileBroadband with Double = js.native
  /* 0 */ val other: typingsSlinky.winrtDashUwp.Windows.Devices.Radios.RadioKind.other with Double = js.native
  /* 1 */ val wiFi: typingsSlinky.winrtDashUwp.Windows.Devices.Radios.RadioKind.wiFi with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RadioKind with Double] = js.native
}

