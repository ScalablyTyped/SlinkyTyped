package typingsSlinky.winrt.global.Windows.UI.Input

import typingsSlinky.winrt.Windows.Devices.Input.PointerDeviceType
import typingsSlinky.winrt.Windows.Foundation.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Input.DraggingEventArgs")
@js.native
class DraggingEventArgs ()
  extends typingsSlinky.winrt.Windows.UI.Input.DraggingEventArgs {
  /* CompleteClass */
  override var draggingState: typingsSlinky.winrt.Windows.UI.Input.DraggingState = js.native
  /* CompleteClass */
  override var pointerDeviceType: PointerDeviceType = js.native
  /* CompleteClass */
  override var position: Point = js.native
}

