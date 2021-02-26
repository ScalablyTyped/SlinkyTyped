package typingsSlinky.winrtUwp.Windows.Media.Streaming.Adaptive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the PlaybackBitrateChanged event. */
@js.native
trait AdaptiveMediaSourcePlaybackBitrateChangedEventArgs extends StObject {
  
  /** Gets a value indicating whether the media source contains only audio data. */
  var audioOnly: Boolean = js.native
  
  /** Gets the new playback bitrate. */
  var newValue: Double = js.native
  
  /** Gets the old playback bitrate. */
  var oldValue: Double = js.native
}
object AdaptiveMediaSourcePlaybackBitrateChangedEventArgs {
  
  @scala.inline
  def apply(audioOnly: Boolean, newValue: Double, oldValue: Double): AdaptiveMediaSourcePlaybackBitrateChangedEventArgs = {
    val __obj = js.Dynamic.literal(audioOnly = audioOnly.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdaptiveMediaSourcePlaybackBitrateChangedEventArgs]
  }
  
  @scala.inline
  implicit class AdaptiveMediaSourcePlaybackBitrateChangedEventArgsMutableBuilder[Self <: AdaptiveMediaSourcePlaybackBitrateChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudioOnly(value: Boolean): Self = StObject.set(x, "audioOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: Double): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
  }
}
