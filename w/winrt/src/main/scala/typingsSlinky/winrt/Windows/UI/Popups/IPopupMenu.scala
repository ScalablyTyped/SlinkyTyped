package typingsSlinky.winrt.Windows.UI.Popups

import typingsSlinky.winrt.Windows.Foundation.Collections.IVector
import typingsSlinky.winrt.Windows.Foundation.IAsyncOperation
import typingsSlinky.winrt.Windows.Foundation.Point
import typingsSlinky.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPopupMenu extends js.Object {
  
  var commands: IVector[IUICommand] = js.native
  
  def showAsync(invocationPoint: Point): IAsyncOperation[IUICommand] = js.native
  
  def showForSelectionAsync(selection: Rect): IAsyncOperation[IUICommand] = js.native
  def showForSelectionAsync(selection: Rect, preferredPlacement: Placement): IAsyncOperation[IUICommand] = js.native
}
