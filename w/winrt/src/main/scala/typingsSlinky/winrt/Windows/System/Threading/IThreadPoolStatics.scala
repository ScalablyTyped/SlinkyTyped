package typingsSlinky.winrt.Windows.System.Threading

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThreadPoolStatics extends js.Object {
  
  def runAsync(handler: WorkItemHandler): IAsyncAction = js.native
  def runAsync(handler: WorkItemHandler, priority: WorkItemPriority): IAsyncAction = js.native
  def runAsync(handler: WorkItemHandler, priority: WorkItemPriority, options: WorkItemOptions): IAsyncAction = js.native
}
