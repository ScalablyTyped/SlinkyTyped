package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureHelpParameter extends StObject {
  
  var displayParts: js.Array[SymbolDisplayPart] = js.native
  
  var documentation: js.Array[SymbolDisplayPart] = js.native
  
  var isOptional: Boolean = js.native
  
  var name: java.lang.String = js.native
}
object SignatureHelpParameter {
  
  @scala.inline
  def apply(
    displayParts: js.Array[SymbolDisplayPart],
    documentation: js.Array[SymbolDisplayPart],
    isOptional: Boolean,
    name: java.lang.String
  ): SignatureHelpParameter = {
    val __obj = js.Dynamic.literal(displayParts = displayParts.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpParameter]
  }
  
  @scala.inline
  implicit class SignatureHelpParameterMutableBuilder[Self <: SignatureHelpParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayParts(value: js.Array[SymbolDisplayPart]): Self = StObject.set(x, "displayParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayPartsVarargs(value: SymbolDisplayPart*): Self = StObject.set(x, "displayParts", js.Array(value :_*))
    
    @scala.inline
    def setDocumentation(value: js.Array[SymbolDisplayPart]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationVarargs(value: SymbolDisplayPart*): Self = StObject.set(x, "documentation", js.Array(value :_*))
    
    @scala.inline
    def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
