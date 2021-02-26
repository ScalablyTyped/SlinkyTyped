package typingsSlinky.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MediaStreamSource.SwitchStreamsRequested event. */
@js.native
trait MediaStreamSourceSwitchStreamsRequestedEventArgs extends StObject {
  
  /** Gets the object that represents the request to switch the streams. */
  var request: MediaStreamSourceSwitchStreamsRequest = js.native
}
object MediaStreamSourceSwitchStreamsRequestedEventArgs {
  
  @scala.inline
  def apply(request: MediaStreamSourceSwitchStreamsRequest): MediaStreamSourceSwitchStreamsRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceSwitchStreamsRequestedEventArgs]
  }
  
  @scala.inline
  implicit class MediaStreamSourceSwitchStreamsRequestedEventArgsMutableBuilder[Self <: MediaStreamSourceSwitchStreamsRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: MediaStreamSourceSwitchStreamsRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
