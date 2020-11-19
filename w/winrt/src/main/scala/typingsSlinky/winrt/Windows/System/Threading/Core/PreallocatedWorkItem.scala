package typingsSlinky.winrt.Windows.System.Threading.Core

import typingsSlinky.winrt.Windows.Foundation.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreallocatedWorkItem extends IPreallocatedWorkItem
object PreallocatedWorkItem {
  
  @scala.inline
  def apply(runAsync: () => IAsyncAction): PreallocatedWorkItem = {
    val __obj = js.Dynamic.literal(runAsync = js.Any.fromFunction0(runAsync))
    __obj.asInstanceOf[PreallocatedWorkItem]
  }
}
