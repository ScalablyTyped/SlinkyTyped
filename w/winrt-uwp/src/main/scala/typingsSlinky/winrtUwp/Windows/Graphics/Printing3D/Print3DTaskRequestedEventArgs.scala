package typingsSlinky.winrtUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the TaskRequested event. */
@js.native
trait Print3DTaskRequestedEventArgs extends StObject {
  
  /** Gets the 3D print job request associated with the Print3DManager . */
  var request: Print3DTaskRequest = js.native
}
object Print3DTaskRequestedEventArgs {
  
  @scala.inline
  def apply(request: Print3DTaskRequest): Print3DTaskRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print3DTaskRequestedEventArgs]
  }
  
  @scala.inline
  implicit class Print3DTaskRequestedEventArgsMutableBuilder[Self <: Print3DTaskRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: Print3DTaskRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
