package typingsSlinky.winrt.global.Windows.UI.Input

import typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceType
import typingsSlinky.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.HoldingEventArgs")
@js.native
class HoldingEventArgs ()
  extends typingsSlinky.winrt.Windows.UI.Input.HoldingEventArgs {
  /* CompleteClass */
  override var holdingState: typingsSlinky.winrt.Windows.UI.Input.HoldingState = js.native
  /* CompleteClass */
  override var pointerDeviceType: PointerDeviceType = js.native
  /* CompleteClass */
  override var position: Point = js.native
}

