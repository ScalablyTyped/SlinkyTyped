package typingsSlinky.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *    Audio playback device info
  */
@js.native
trait AudioOutputInfo extends StObject {
  
  /**
    *    Device id that can be used to choose audio playback device
    */
  var id: Double | String = js.native
  
  /**
    *    Device name , in WebRTC mode populated with real data only when app has been opened using HTTPS protocol
    */
  var name: String = js.native
}
object AudioOutputInfo {
  
  @scala.inline
  def apply(id: Double | String, name: String): AudioOutputInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioOutputInfo]
  }
  
  @scala.inline
  implicit class AudioOutputInfoMutableBuilder[Self <: AudioOutputInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
