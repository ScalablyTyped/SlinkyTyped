package typingsSlinky.winrt.Windows.UI.ViewManagement

import typingsSlinky.winrt.Windows.Foundation.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputPane extends IInputPane
object InputPane {
  
  @scala.inline
  def apply(occludedRect: Rect, onhiding: js.Any, onshowing: js.Any): InputPane = {
    val __obj = js.Dynamic.literal(occludedRect = occludedRect.asInstanceOf[js.Any], onhiding = onhiding.asInstanceOf[js.Any], onshowing = onshowing.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputPane]
  }
}
