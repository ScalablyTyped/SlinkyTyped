package typingsSlinky.winrt.global.Windows.UI.Core

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import typingsSlinky.winrt.Windows.UI.Core.DispatchedHandler
import typingsSlinky.winrt.Windows.UI.Core.IdleDispatchedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.CoreDispatcher")
@js.native
class CoreDispatcher ()
  extends typingsSlinky.winrt.Windows.UI.Core.CoreDispatcher {
  /* CompleteClass */
  override var hasThreadAccess: Boolean = js.native
  /* CompleteClass */
  override var onacceleratorkeyactivated: js.Any = js.native
  /* CompleteClass */
  override def processEvents(options: typingsSlinky.winrt.Windows.UI.Core.CoreProcessEventsOption): Unit = js.native
  /* CompleteClass */
  override def runAsync(
    priority: typingsSlinky.winrt.Windows.UI.Core.CoreDispatcherPriority,
    agileCallback: DispatchedHandler
  ): IAsyncAction = js.native
  /* CompleteClass */
  override def runIdleAsync(agileCallback: IdleDispatchedHandler): IAsyncAction = js.native
}

