package typingsSlinky.winrtUwp.global.Windows.UI.Input

import typingsSlinky.winrtUwp.Windows.Devices.Input.PointerDeviceType
import typingsSlinky.winrtUwp.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for the CrossSliding event. */
@JSGlobal("Windows.UI.Input.CrossSlidingEventArgs")
@js.native
abstract class CrossSlidingEventArgs ()
  extends typingsSlinky.winrtUwp.Windows.UI.Input.CrossSlidingEventArgs {
  /** Gets the state of the CrossSliding event. */
  /* CompleteClass */
  override var crossSlidingState: typingsSlinky.winrtUwp.Windows.UI.Input.CrossSlidingState = js.native
  /** Gets the device type of the input source. */
  /* CompleteClass */
  override var pointerDeviceType: PointerDeviceType = js.native
  /** Gets the location of the touch contact. */
  /* CompleteClass */
  override var position: Point = js.native
}

