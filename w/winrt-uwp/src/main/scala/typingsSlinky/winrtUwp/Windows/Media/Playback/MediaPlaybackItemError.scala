package typingsSlinky.winrtUwp.Windows.Media.Playback

import typingsSlinky.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an error that occurred trying to resolve a MediaPlaybackItem . */
@js.native
trait MediaPlaybackItemError extends StObject {
  
  /** Gets the error code associated with the playback item error. */
  var errorCode: MediaPlaybackItemErrorCode = js.native
  
  /** Gets the extended error code for the MediaPlaybackItem error. */
  var extendedError: WinRTError = js.native
}
object MediaPlaybackItemError {
  
  @scala.inline
  def apply(errorCode: MediaPlaybackItemErrorCode, extendedError: WinRTError): MediaPlaybackItemError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], extendedError = extendedError.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlaybackItemError]
  }
  
  @scala.inline
  implicit class MediaPlaybackItemErrorMutableBuilder[Self <: MediaPlaybackItemError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: MediaPlaybackItemErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedError(value: WinRTError): Self = StObject.set(x, "extendedError", value.asInstanceOf[js.Any])
  }
}
