package typingsSlinky.tizenTvWebapis.avplayMod

import typingsSlinky.tizenTvWebapis.tizenTvWebapisStrings.AUDIO
import typingsSlinky.tizenTvWebapis.tizenTvWebapisStrings.TEXT
import typingsSlinky.tizenTvWebapis.tizenTvWebapisStrings.VIDEO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AVPlayStreamInfo extends StObject {
  
  var extra_info: String = js.native
  
  var index: Double = js.native
  
  var `type`: AVPlayStreamType | VIDEO | AUDIO | TEXT = js.native
}
object AVPlayStreamInfo {
  
  @scala.inline
  def apply(extra_info: String, index: Double, `type`: AVPlayStreamType | VIDEO | AUDIO | TEXT): AVPlayStreamInfo = {
    val __obj = js.Dynamic.literal(extra_info = extra_info.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AVPlayStreamInfo]
  }
  
  @scala.inline
  implicit class AVPlayStreamInfoMutableBuilder[Self <: AVPlayStreamInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtra_info(value: String): Self = StObject.set(x, "extra_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AVPlayStreamType | VIDEO | AUDIO | TEXT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
