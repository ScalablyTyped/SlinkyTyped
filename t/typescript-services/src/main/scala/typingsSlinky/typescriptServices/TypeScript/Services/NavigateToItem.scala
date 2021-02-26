package typingsSlinky.typescriptServices.TypeScript.Services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigateToItem extends StObject {
  
  var additionalSpans: js.Array[SpanInfo] = js.native
  
  var containerKind: String = js.native
  
  var containerName: String = js.native
  
  var fileName: String = js.native
  
  var kind: String = js.native
  
  var kindModifiers: String = js.native
  
  var limChar: Double = js.native
  
  var matchKind: String = js.native
  
  var minChar: Double = js.native
  
  var name: String = js.native
}
object NavigateToItem {
  
  @scala.inline
  def apply(
    additionalSpans: js.Array[SpanInfo],
    containerKind: String,
    containerName: String,
    fileName: String,
    kind: String,
    kindModifiers: String,
    limChar: Double,
    matchKind: String,
    minChar: Double,
    name: String
  ): NavigateToItem = {
    val __obj = js.Dynamic.literal(additionalSpans = additionalSpans.asInstanceOf[js.Any], containerKind = containerKind.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], limChar = limChar.asInstanceOf[js.Any], matchKind = matchKind.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToItem]
  }
  
  @scala.inline
  implicit class NavigateToItemMutableBuilder[Self <: NavigateToItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalSpans(value: js.Array[SpanInfo]): Self = StObject.set(x, "additionalSpans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalSpansVarargs(value: SpanInfo*): Self = StObject.set(x, "additionalSpans", js.Array(value :_*))
    
    @scala.inline
    def setContainerKind(value: String): Self = StObject.set(x, "containerKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindModifiers(value: String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimChar(value: Double): Self = StObject.set(x, "limChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchKind(value: String): Self = StObject.set(x, "matchKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinChar(value: Double): Self = StObject.set(x, "minChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
