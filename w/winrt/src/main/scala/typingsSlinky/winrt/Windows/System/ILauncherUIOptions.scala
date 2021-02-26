package typingsSlinky.winrt.Windows.System

import typingsSlinky.winrt.Windows.Foundation.Point
import typingsSlinky.winrt.Windows.Foundation.Rect
import typingsSlinky.winrt.Windows.UI.Popups.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILauncherUIOptions extends StObject {
  
  var invocationPoint: Point = js.native
  
  var preferredPlacement: Placement = js.native
  
  var selectionRect: Rect = js.native
}
object ILauncherUIOptions {
  
  @scala.inline
  def apply(invocationPoint: Point, preferredPlacement: Placement, selectionRect: Rect): ILauncherUIOptions = {
    val __obj = js.Dynamic.literal(invocationPoint = invocationPoint.asInstanceOf[js.Any], preferredPlacement = preferredPlacement.asInstanceOf[js.Any], selectionRect = selectionRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILauncherUIOptions]
  }
  
  @scala.inline
  implicit class ILauncherUIOptionsMutableBuilder[Self <: ILauncherUIOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvocationPoint(value: Point): Self = StObject.set(x, "invocationPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredPlacement(value: Placement): Self = StObject.set(x, "preferredPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionRect(value: Rect): Self = StObject.set(x, "selectionRect", value.asInstanceOf[js.Any])
  }
}
