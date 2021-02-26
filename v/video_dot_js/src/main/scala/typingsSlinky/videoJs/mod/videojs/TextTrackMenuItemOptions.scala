package typingsSlinky.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextTrackMenuItemOptions extends MenuItemOptions {
  
  var track: TextTrack = js.native
}
object TextTrackMenuItemOptions {
  
  @scala.inline
  def apply(track: TextTrack): TextTrackMenuItemOptions = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackMenuItemOptions]
  }
  
  @scala.inline
  implicit class TextTrackMenuItemOptionsMutableBuilder[Self <: TextTrackMenuItemOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrack(value: TextTrack): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
  }
}
