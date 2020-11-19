package typingsSlinky.winrt.Windows.UI.Core

import typingsSlinky.winrt.Windows.Foundation.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowSizeChangedEventArgs extends IWindowSizeChangedEventArgs
object WindowSizeChangedEventArgs {
  
  @scala.inline
  def apply(handled: Boolean, size: Size): WindowSizeChangedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowSizeChangedEventArgs]
  }
}
