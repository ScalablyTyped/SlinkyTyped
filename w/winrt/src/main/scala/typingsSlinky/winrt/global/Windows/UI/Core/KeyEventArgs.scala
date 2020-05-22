package typingsSlinky.winrt.global.Windows.UI.Core

import typingsSlinky.winrt.Windows.System.VirtualKey
import typingsSlinky.winrt.Windows.UI.Core.CorePhysicalKeyStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.KeyEventArgs")
@js.native
class KeyEventArgs ()
  extends typingsSlinky.winrt.Windows.UI.Core.KeyEventArgs {
  /* CompleteClass */
  override var handled: Boolean = js.native
  /* CompleteClass */
  override var keyStatus: CorePhysicalKeyStatus = js.native
  /* CompleteClass */
  override var virtualKey: VirtualKey = js.native
}

