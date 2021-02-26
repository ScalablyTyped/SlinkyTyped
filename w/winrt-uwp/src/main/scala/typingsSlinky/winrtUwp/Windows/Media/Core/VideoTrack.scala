package typingsSlinky.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a video track. */
@js.native
trait VideoTrack extends StObject {
  
  /** Gets or sets the identifier for the video track. */
  var id: String = js.native
  
  /** Gets or sets the label for the video track. */
  var label: String = js.native
  
  /** Gets or sets a string indicating the language of the video track. */
  var language: String = js.native
  
  /** Gets a value indicating the type of data the track contains. For VideoTrack objects, this value is always MediaTrackKind::Video . */
  var trackKind: MediaTrackKind = js.native
}
object VideoTrack {
  
  @scala.inline
  def apply(id: String, label: String, language: String, trackKind: MediaTrackKind): VideoTrack = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], trackKind = trackKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoTrack]
  }
  
  @scala.inline
  implicit class VideoTrackMutableBuilder[Self <: VideoTrack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackKind(value: MediaTrackKind): Self = StObject.set(x, "trackKind", value.asInstanceOf[js.Any])
  }
}
