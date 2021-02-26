package typingsSlinky.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEditInfo extends StObject {
  
  var length: Double = js.native
  
  var position: Double = js.native
  
  var replaceWith: String = js.native
}
object TextEditInfo {
  
  @scala.inline
  def apply(length: Double, position: Double, replaceWith: String): TextEditInfo = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], replaceWith = replaceWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEditInfo]
  }
  
  @scala.inline
  implicit class TextEditInfoMutableBuilder[Self <: TextEditInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceWith(value: String): Self = StObject.set(x, "replaceWith", value.asInstanceOf[js.Any])
  }
}
