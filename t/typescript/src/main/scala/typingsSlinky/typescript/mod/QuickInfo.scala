package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickInfo extends StObject {
  
  var displayParts: js.UndefOr[js.Array[SymbolDisplayPart]] = js.native
  
  var documentation: js.UndefOr[js.Array[SymbolDisplayPart]] = js.native
  
  var kind: ScriptElementKind = js.native
  
  var kindModifiers: java.lang.String = js.native
  
  var tags: js.UndefOr[js.Array[JSDocTagInfo]] = js.native
  
  var textSpan: TextSpan = js.native
}
object QuickInfo {
  
  @scala.inline
  def apply(kind: ScriptElementKind, kindModifiers: java.lang.String, textSpan: TextSpan): QuickInfo = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickInfo]
  }
  
  @scala.inline
  implicit class QuickInfoMutableBuilder[Self <: QuickInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayParts(value: js.Array[SymbolDisplayPart]): Self = StObject.set(x, "displayParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayPartsUndefined: Self = StObject.set(x, "displayParts", js.undefined)
    
    @scala.inline
    def setDisplayPartsVarargs(value: SymbolDisplayPart*): Self = StObject.set(x, "displayParts", js.Array(value :_*))
    
    @scala.inline
    def setDocumentation(value: js.Array[SymbolDisplayPart]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setDocumentationVarargs(value: SymbolDisplayPart*): Self = StObject.set(x, "documentation", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindModifiers(value: java.lang.String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[JSDocTagInfo]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: JSDocTagInfo*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTextSpan(value: TextSpan): Self = StObject.set(x, "textSpan", value.asInstanceOf[js.Any])
  }
}
