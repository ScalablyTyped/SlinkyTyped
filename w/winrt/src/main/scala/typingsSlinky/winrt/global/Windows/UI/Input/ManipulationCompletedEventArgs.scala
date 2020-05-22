package typingsSlinky.winrt.global.Windows.UI.Input

import typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceType
import typingsSlinky.winrt.Windows.Foundation.Point
import typingsSlinky.winrt.Windows.UI.Input.ManipulationDelta
import typingsSlinky.winrt.Windows.UI.Input.ManipulationVelocities
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.ManipulationCompletedEventArgs")
@js.native
class ManipulationCompletedEventArgs ()
  extends typingsSlinky.winrt.Windows.UI.Input.ManipulationCompletedEventArgs {
  /* CompleteClass */
  override var cumulative: ManipulationDelta = js.native
  /* CompleteClass */
  override var pointerDeviceType: PointerDeviceType = js.native
  /* CompleteClass */
  override var position: Point = js.native
  /* CompleteClass */
  override var velocities: ManipulationVelocities = js.native
}

