package typingsSlinky.winrtUwp.Windows.Media.Core

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the TimedTextSource::Resolved event. */
@js.native
trait TimedTextSourceResolveResultEventArgs extends StObject {
  
  /** Gets an object representing the asynchronous error that occurred when the TimedTextSource was resolved. */
  var error: TimedMetadataTrackError = js.native
  
  /** Gets the list of TimedMetadataTrack objects resulting from resolving the TimedTextSource . */
  var tracks: IVectorView[TimedMetadataTrack] = js.native
}
object TimedTextSourceResolveResultEventArgs {
  
  @scala.inline
  def apply(error: TimedMetadataTrackError, tracks: IVectorView[TimedMetadataTrack]): TimedTextSourceResolveResultEventArgs = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextSourceResolveResultEventArgs]
  }
  
  @scala.inline
  implicit class TimedTextSourceResolveResultEventArgsMutableBuilder[Self <: TimedTextSourceResolveResultEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: TimedMetadataTrackError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTracks(value: IVectorView[TimedMetadataTrack]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
  }
}
