package typingsSlinky.textEncoding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEncodeOptions extends StObject {
  
  var stream: js.UndefOr[Boolean] = js.native
}
object TextEncodeOptions {
  
  @scala.inline
  def apply(): TextEncodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextEncodeOptions]
  }
  
  @scala.inline
  implicit class TextEncodeOptionsMutableBuilder[Self <: TextEncodeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
