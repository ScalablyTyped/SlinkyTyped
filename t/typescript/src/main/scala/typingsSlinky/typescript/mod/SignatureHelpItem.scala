package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single signature to show in signature help.
  * The id is used for subsequent calls into the language service to ask questions about the
  * signature help item in the context of any documents that have been updated.  i.e. after
  * an edit has happened, while signature help is still active, the host can ask important
  * questions like 'what parameter is the user currently contained within?'.
  */
@js.native
trait SignatureHelpItem extends StObject {
  
  var documentation: js.Array[SymbolDisplayPart] = js.native
  
  var isVariadic: Boolean = js.native
  
  var parameters: js.Array[SignatureHelpParameter] = js.native
  
  var prefixDisplayParts: js.Array[SymbolDisplayPart] = js.native
  
  var separatorDisplayParts: js.Array[SymbolDisplayPart] = js.native
  
  var suffixDisplayParts: js.Array[SymbolDisplayPart] = js.native
  
  var tags: js.Array[JSDocTagInfo] = js.native
}
object SignatureHelpItem {
  
  @scala.inline
  def apply(
    documentation: js.Array[SymbolDisplayPart],
    isVariadic: Boolean,
    parameters: js.Array[SignatureHelpParameter],
    prefixDisplayParts: js.Array[SymbolDisplayPart],
    separatorDisplayParts: js.Array[SymbolDisplayPart],
    suffixDisplayParts: js.Array[SymbolDisplayPart],
    tags: js.Array[JSDocTagInfo]
  ): SignatureHelpItem = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], isVariadic = isVariadic.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], prefixDisplayParts = prefixDisplayParts.asInstanceOf[js.Any], separatorDisplayParts = separatorDisplayParts.asInstanceOf[js.Any], suffixDisplayParts = suffixDisplayParts.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignatureHelpItem]
  }
  
  @scala.inline
  implicit class SignatureHelpItemMutableBuilder[Self <: SignatureHelpItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentation(value: js.Array[SymbolDisplayPart]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationVarargs(value: SymbolDisplayPart*): Self = StObject.set(x, "documentation", js.Array(value :_*))
    
    @scala.inline
    def setIsVariadic(value: Boolean): Self = StObject.set(x, "isVariadic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: js.Array[SignatureHelpParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: SignatureHelpParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setPrefixDisplayParts(value: js.Array[SymbolDisplayPart]): Self = StObject.set(x, "prefixDisplayParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixDisplayPartsVarargs(value: SymbolDisplayPart*): Self = StObject.set(x, "prefixDisplayParts", js.Array(value :_*))
    
    @scala.inline
    def setSeparatorDisplayParts(value: js.Array[SymbolDisplayPart]): Self = StObject.set(x, "separatorDisplayParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparatorDisplayPartsVarargs(value: SymbolDisplayPart*): Self = StObject.set(x, "separatorDisplayParts", js.Array(value :_*))
    
    @scala.inline
    def setSuffixDisplayParts(value: js.Array[SymbolDisplayPart]): Self = StObject.set(x, "suffixDisplayParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuffixDisplayPartsVarargs(value: SymbolDisplayPart*): Self = StObject.set(x, "suffixDisplayParts", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[JSDocTagInfo]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: JSDocTagInfo*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
