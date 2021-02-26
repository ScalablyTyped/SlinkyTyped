package typingsSlinky.winrtUwp.Windows.Media.Playback

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the MessageReceivedFromBackground and MessageReceivedFromForeground events. */
@js.native
trait MediaPlayerDataReceivedEventArgs extends StObject {
  
  /** Gets the data from the MessageReceivedFromBackground or MessageReceivedFromForeground event. */
  var data: IMap[String, String] = js.native
}
object MediaPlayerDataReceivedEventArgs {
  
  @scala.inline
  def apply(data: IMap[String, String]): MediaPlayerDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaPlayerDataReceivedEventArgs]
  }
  
  @scala.inline
  implicit class MediaPlayerDataReceivedEventArgsMutableBuilder[Self <: MediaPlayerDataReceivedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: IMap[String, String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
