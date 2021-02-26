package typingsSlinky.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidCuePoint extends Error {
  
  @JSName("name")
  var name_InvalidCuePoint: typingsSlinky.vimeoPlayer.vimeoPlayerStrings.InvalidCuePoint = js.native
}
object InvalidCuePoint {
  
  @scala.inline
  def apply(
    message: String,
    method: String,
    name: typingsSlinky.vimeoPlayer.vimeoPlayerStrings.InvalidCuePoint
  ): InvalidCuePoint = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidCuePoint]
  }
  
  @scala.inline
  implicit class InvalidCuePointMutableBuilder[Self <: InvalidCuePoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: typingsSlinky.vimeoPlayer.vimeoPlayerStrings.InvalidCuePoint): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
