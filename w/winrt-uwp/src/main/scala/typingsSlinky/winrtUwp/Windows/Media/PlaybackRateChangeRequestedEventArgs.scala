package typingsSlinky.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the PlaybackRateChangeRequested event. */
@js.native
trait PlaybackRateChangeRequestedEventArgs extends StObject {
  
  /** Gets the requested playback rate. */
  var requestedPlaybackRate: Double = js.native
}
object PlaybackRateChangeRequestedEventArgs {
  
  @scala.inline
  def apply(requestedPlaybackRate: Double): PlaybackRateChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(requestedPlaybackRate = requestedPlaybackRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackRateChangeRequestedEventArgs]
  }
  
  @scala.inline
  implicit class PlaybackRateChangeRequestedEventArgsMutableBuilder[Self <: PlaybackRateChangeRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestedPlaybackRate(value: Double): Self = StObject.set(x, "requestedPlaybackRate", value.asInstanceOf[js.Any])
  }
}
