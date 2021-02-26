package typingsSlinky.winrtUwp.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the MuteChangeRequested event. */
@js.native
trait MuteChangeRequestedEventArgs extends StObject {
  
  /** Gets a value that indicates whether mute or unmute was requested. */
  var mute: Boolean = js.native
}
object MuteChangeRequestedEventArgs {
  
  @scala.inline
  def apply(mute: Boolean): MuteChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(mute = mute.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuteChangeRequestedEventArgs]
  }
  
  @scala.inline
  implicit class MuteChangeRequestedEventArgsMutableBuilder[Self <: MuteChangeRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
  }
}
