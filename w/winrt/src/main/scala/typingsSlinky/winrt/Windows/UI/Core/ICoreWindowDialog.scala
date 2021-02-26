package typingsSlinky.winrt.Windows.UI.Core

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Size
import typingsSlinky.winrt.Windows.UI.Popups.IUICommand
import typingsSlinky.winrt.Windows.UI.Popups.UICommandInvokedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICoreWindowDialog extends StObject {
  
  def backButtonCommand(command: IUICommand): Unit = js.native
  @JSName("backButtonCommand")
  var backButtonCommand_Original: UICommandInvokedHandler = js.native
  
  var cancelCommandIndex: Double = js.native
  
  var commands: IVector[IUICommand] = js.native
  
  var defaultCommandIndex: Double = js.native
  
  var isInteractionDelayed: Double = js.native
  
  var maxSize: Size = js.native
  
  var minSize: Size = js.native
  
  var onshowing: js.Any = js.native
  
  def showAsync(): IAsyncOperation[IUICommand] = js.native
  
  var title: String = js.native
}
