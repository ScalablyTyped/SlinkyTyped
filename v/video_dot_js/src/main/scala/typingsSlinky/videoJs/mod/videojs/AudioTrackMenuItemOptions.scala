package typingsSlinky.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioTrackMenuItemOptions extends MenuItemOptions {
  
  var track: js.UndefOr[VideojsAudioTrack] = js.native
}
object AudioTrackMenuItemOptions {
  
  @scala.inline
  def apply(): AudioTrackMenuItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioTrackMenuItemOptions]
  }
  
  @scala.inline
  implicit class AudioTrackMenuItemOptionsMutableBuilder[Self <: AudioTrackMenuItemOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrack(value: VideojsAudioTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
