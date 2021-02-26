package typingsSlinky.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaSource::MediaSourceOpenOperationCompleted event. */
@js.native
trait MediaSourceOpenOperationCompletedEventArgs extends StObject {
  
  /** Represents the error that occurred while asynchronously opening the MediaSource . */
  var error: MediaSourceError = js.native
}
object MediaSourceOpenOperationCompletedEventArgs {
  
  @scala.inline
  def apply(error: MediaSourceError): MediaSourceOpenOperationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceOpenOperationCompletedEventArgs]
  }
  
  @scala.inline
  implicit class MediaSourceOpenOperationCompletedEventArgsMutableBuilder[Self <: MediaSourceOpenOperationCompletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: MediaSourceError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
