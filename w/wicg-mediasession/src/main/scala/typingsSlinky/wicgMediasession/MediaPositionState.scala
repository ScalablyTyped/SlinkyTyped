package typingsSlinky.wicgMediasession

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaPositionState extends StObject {
  
  // Duration of media in seconds
  var duration: js.UndefOr[Double] = js.native
  
  // Playback rate of media, positive for forward playback, negative for backward playback. This number should not be zero
  var playbackRate: js.UndefOr[Double] = js.native
  
  // Last reported playback position in seconds, should be positive.
  var position: js.UndefOr[Double] = js.native
}
object MediaPositionState {
  
  @scala.inline
  def apply(): MediaPositionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaPositionState]
  }
  
  @scala.inline
  implicit class MediaPositionStateMutableBuilder[Self <: MediaPositionState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
