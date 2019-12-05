package typingsSlinky.winrt.Windows.Devices.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointerDeviceType extends js.Object

@JSGlobal("Windows.Devices.Input.PointerDeviceType")
@js.native
object PointerDeviceType extends js.Object {
  @js.native
  sealed trait mouse extends PointerDeviceType
  
  @js.native
  sealed trait pen extends PointerDeviceType
  
  @js.native
  sealed trait touch extends PointerDeviceType
  
  /* 2 */ val mouse: typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceType.mouse with Double = js.native
  /* 1 */ val pen: typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceType.pen with Double = js.native
  /* 0 */ val touch: typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceType.touch with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointerDeviceType with Double] = js.native
}

