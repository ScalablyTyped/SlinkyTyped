package typingsSlinky.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextEdit extends StObject {
  
  var limChar: Double = js.native
  
  var minChar: Double = js.native
  
  var text: String = js.native
}
object TextEdit {
  
  @scala.inline
  def apply(limChar: Double, minChar: Double, text: String): TextEdit = {
    val __obj = js.Dynamic.literal(limChar = limChar.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEdit]
  }
  
  @scala.inline
  implicit class TextEditMutableBuilder[Self <: TextEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimChar(value: Double): Self = StObject.set(x, "limChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinChar(value: Double): Self = StObject.set(x, "minChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
