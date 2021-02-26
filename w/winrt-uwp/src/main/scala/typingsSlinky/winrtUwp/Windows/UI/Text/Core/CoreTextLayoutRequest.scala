package typingsSlinky.winrtUwp.Windows.UI.Text.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Deferral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents information about a LayoutRequested event. */
@js.native
trait CoreTextLayoutRequest extends StObject {
  
  /**
    * Requests that the layout request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral = js.native
  
  /** Gets a value that indicates whether the layout request operation is canceled. */
  var isCanceled: Boolean = js.native
  
  /** Gets an object that represents the layout bounds information requested by the text input server. The application should populate the properties of this object to the layout bounds being requested before returning from the event handler. */
  var layoutBounds: CoreTextLayoutBounds = js.native
  
  /** Gets a value that indicates the range of text whose bounding box is being requested by the text input server. The server populates this property before raising the event. */
  var range: CoreTextRange = js.native
}
object CoreTextLayoutRequest {
  
  @scala.inline
  def apply(
    getDeferral: () => Deferral,
    isCanceled: Boolean,
    layoutBounds: CoreTextLayoutBounds,
    range: CoreTextRange
  ): CoreTextLayoutRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any], layoutBounds = layoutBounds.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextLayoutRequest]
  }
  
  @scala.inline
  implicit class CoreTextLayoutRequestMutableBuilder[Self <: CoreTextLayoutRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => Deferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutBounds(value: CoreTextLayoutBounds): Self = StObject.set(x, "layoutBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: CoreTextRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
