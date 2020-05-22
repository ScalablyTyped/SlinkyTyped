package typingsSlinky.winrtUwp.global.Windows.UI.Input

import typingsSlinky.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typingsSlinky.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the RightTapped event. */
@JSGlobal("Windows.UI.Input.RightTappedEventArgs")
@js.native
abstract class RightTappedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.UI.Input.RightTappedEventArgs {
  /** Gets the device type of the input source. */
  /* CompleteClass */
  override var pointerDeviceType: PointerDeviceType = js.native
  /** Gets the location of the touch, mouse, or pen/stylus contact. */
  /* CompleteClass */
  override var position: Point = js.native
}

