package typingsSlinky.wicgMediasession

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var MediaSession: js.UndefOr[typingsSlinky.wicgMediasession.MediaSession] = js.native
}
object Window {
  
  @scala.inline
  def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaSession(value: MediaSession): Self = StObject.set(x, "MediaSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaSessionUndefined: Self = StObject.set(x, "MediaSession", js.undefined)
  }
}
