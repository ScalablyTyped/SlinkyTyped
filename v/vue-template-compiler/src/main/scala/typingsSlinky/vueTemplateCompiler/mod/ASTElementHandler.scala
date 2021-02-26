package typingsSlinky.vueTemplateCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ASTElementHandler extends StObject {
  
  var modifiers: js.UndefOr[ASTModifiers] = js.native
  
  var params: js.UndefOr[js.Array[_]] = js.native
  
  var value: String = js.native
}
object ASTElementHandler {
  
  @scala.inline
  def apply(value: String): ASTElementHandler = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTElementHandler]
  }
  
  @scala.inline
  implicit class ASTElementHandlerMutableBuilder[Self <: ASTElementHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModifiers(value: ASTModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    @scala.inline
    def setParams(value: js.Array[_]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setParamsVarargs(value: js.Any*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
