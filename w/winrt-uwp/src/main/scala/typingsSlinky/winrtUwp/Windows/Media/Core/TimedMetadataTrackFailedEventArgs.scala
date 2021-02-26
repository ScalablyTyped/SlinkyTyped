package typingsSlinky.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the TimedMetadataTrack::TrackFailed event. */
@js.native
trait TimedMetadataTrackFailedEventArgs extends StObject {
  
  /** Gets an object representing the error that occurred with the timed metadata track. */
  var error: TimedMetadataTrackError = js.native
}
object TimedMetadataTrackFailedEventArgs {
  
  @scala.inline
  def apply(error: TimedMetadataTrackError): TimedMetadataTrackFailedEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedMetadataTrackFailedEventArgs]
  }
  
  @scala.inline
  implicit class TimedMetadataTrackFailedEventArgsMutableBuilder[Self <: TimedMetadataTrackFailedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: TimedMetadataTrackError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
