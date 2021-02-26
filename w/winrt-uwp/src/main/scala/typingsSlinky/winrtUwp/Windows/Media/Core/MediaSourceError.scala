package typingsSlinky.winrtUwp.Windows.Media.Core

import typingsSlinky.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an error that occurred with a MediaSource . */
@js.native
trait MediaSourceError extends StObject {
  
  /** Gets the extended error code for the MediaSourceError . */
  var extendedError: WinRTError = js.native
}
object MediaSourceError {
  
  @scala.inline
  def apply(extendedError: WinRTError): MediaSourceError = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSourceError]
  }
  
  @scala.inline
  implicit class MediaSourceErrorMutableBuilder[Self <: MediaSourceError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtendedError(value: WinRTError): Self = StObject.set(x, "extendedError", value.asInstanceOf[js.Any])
  }
}
