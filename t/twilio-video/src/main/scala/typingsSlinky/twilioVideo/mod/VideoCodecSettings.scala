package typingsSlinky.twilioVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoCodecSettings extends StObject {
  
  var codec: VideoCodec = js.native
}
object VideoCodecSettings {
  
  @scala.inline
  def apply(codec: VideoCodec): VideoCodecSettings = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoCodecSettings]
  }
  
  @scala.inline
  implicit class VideoCodecSettingsMutableBuilder[Self <: VideoCodecSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodec(value: VideoCodec): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
  }
}
