package typingsSlinky.winrtUwp.global.Windows.UI.Input

import typingsSlinky.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typingsSlinky.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the Tapped event. */
@JSGlobal("Windows.UI.Input.TappedEventArgs")
@js.native
abstract class TappedEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.UI.Input.TappedEventArgs {
  /** Gets the device type of the input source. */
  /* CompleteClass */
  override var pointerDeviceType: PointerDeviceType = js.native
  /** Gets the location of the touch, mouse, or pen/stylus contact. */
  /* CompleteClass */
  override var position: Point = js.native
  /** Gets the number of times the tap interaction was detected. */
  /* CompleteClass */
  override var tapCount: Double = js.native
}

