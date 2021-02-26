package typingsSlinky.winrtUwp.Windows.System

import typingsSlinky.winrtUwp.Windows.Foundation.Point
import typingsSlinky.winrtUwp.Windows.Foundation.Rect
import typingsSlinky.winrtUwp.Windows.UI.Popups.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies options for user interface elements such as the application picker that can be invoked by this API. */
@js.native
trait LauncherUIOptions extends StObject {
  
  /** Gets or sets the point on the screen where the user opened a file or URI. */
  var invocationPoint: Point = js.native
  
  /** Gets or sets the preferred placement of the Open With and Warning dialog boxes when starting a default app. */
  var preferredPlacement: Placement = js.native
  
  /** Gets or sets the selection rectangle on the screen where the user opened a file or URI. */
  var selectionRect: Rect = js.native
}
object LauncherUIOptions {
  
  @scala.inline
  def apply(invocationPoint: Point, preferredPlacement: Placement, selectionRect: Rect): LauncherUIOptions = {
    val __obj = js.Dynamic.literal(invocationPoint = invocationPoint.asInstanceOf[js.Any], preferredPlacement = preferredPlacement.asInstanceOf[js.Any], selectionRect = selectionRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[LauncherUIOptions]
  }
  
  @scala.inline
  implicit class LauncherUIOptionsMutableBuilder[Self <: LauncherUIOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvocationPoint(value: Point): Self = StObject.set(x, "invocationPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredPlacement(value: Placement): Self = StObject.set(x, "preferredPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionRect(value: Rect): Self = StObject.set(x, "selectionRect", value.asInstanceOf[js.Any])
  }
}
