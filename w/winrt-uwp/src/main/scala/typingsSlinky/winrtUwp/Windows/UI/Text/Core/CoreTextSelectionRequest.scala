package typingsSlinky.winrtUwp.Windows.UI.Text.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Deferral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents information about a SelectionRequested event. */
@js.native
trait CoreTextSelectionRequest extends StObject {
  
  /**
    * Requests that the selection request operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral = js.native
  
  /** Gets a value that indicates whether the selection request operation is canceled. */
  var isCanceled: Boolean = js.native
  
  /** Gets or sets the selection range that the text input server is requesting. The application should set the current range of selection before returning from the event handler. */
  var selection: CoreTextRange = js.native
}
object CoreTextSelectionRequest {
  
  @scala.inline
  def apply(getDeferral: () => Deferral, isCanceled: Boolean, selection: CoreTextRange): CoreTextSelectionRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), isCanceled = isCanceled.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextSelectionRequest]
  }
  
  @scala.inline
  implicit class CoreTextSelectionRequestMutableBuilder[Self <: CoreTextSelectionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => Deferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelection(value: CoreTextRange): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
  }
}
