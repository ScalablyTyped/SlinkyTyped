package typingsSlinky.videoJs.mod.videojs

import typingsSlinky.videoJs.mod.videojs.TextTrack.Kind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptionSettingsMenuItemOptions extends TextTrackMenuItemOptions {
  
  var kind: Kind = js.native
}
object CaptionSettingsMenuItemOptions {
  
  @scala.inline
  def apply(kind: Kind, track: TextTrack): CaptionSettingsMenuItemOptions = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettingsMenuItemOptions]
  }
  
  @scala.inline
  implicit class CaptionSettingsMenuItemOptionsMutableBuilder[Self <: CaptionSettingsMenuItemOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: Kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
