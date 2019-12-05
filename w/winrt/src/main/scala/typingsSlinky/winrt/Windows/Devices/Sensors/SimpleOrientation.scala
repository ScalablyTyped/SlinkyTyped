package typingsSlinky.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SimpleOrientation extends js.Object

@JSGlobal("Windows.Devices.Sensors.SimpleOrientation")
@js.native
object SimpleOrientation extends js.Object {
  @js.native
  sealed trait facedown extends SimpleOrientation
  
  @js.native
  sealed trait faceup extends SimpleOrientation
  
  @js.native
  sealed trait notRotated extends SimpleOrientation
  
  @js.native
  sealed trait rotated180DegreesCounterclockwise extends SimpleOrientation
  
  @js.native
  sealed trait rotated270DegreesCounterclockwise extends SimpleOrientation
  
  @js.native
  sealed trait rotated90DegreesCounterclockwise extends SimpleOrientation
  
  /* 5 */ val facedown: typingsSlinky.winrt.Windows.Devices.Sensors.SimpleOrientation.facedown with Double = js.native
  /* 4 */ val faceup: typingsSlinky.winrt.Windows.Devices.Sensors.SimpleOrientation.faceup with Double = js.native
  /* 0 */ val notRotated: typingsSlinky.winrt.Windows.Devices.Sensors.SimpleOrientation.notRotated with Double = js.native
  /* 2 */ val rotated180DegreesCounterclockwise: typingsSlinky.winrt.Windows.Devices.Sensors.SimpleOrientation.rotated180DegreesCounterclockwise with Double = js.native
  /* 3 */ val rotated270DegreesCounterclockwise: typingsSlinky.winrt.Windows.Devices.Sensors.SimpleOrientation.rotated270DegreesCounterclockwise with Double = js.native
  /* 1 */ val rotated90DegreesCounterclockwise: typingsSlinky.winrt.Windows.Devices.Sensors.SimpleOrientation.rotated90DegreesCounterclockwise with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SimpleOrientation with Double] = js.native
}

