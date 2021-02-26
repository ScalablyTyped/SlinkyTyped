package typingsSlinky.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectiveTransformResult extends StObject {
  
  var needRuntime: js.UndefOr[Boolean | js.Symbol] = js.native
  
  var props: js.Array[Property] = js.native
  
  var ssrTagParts: js.UndefOr[js.Array[String | JSChildNode]] = js.native
}
object DirectiveTransformResult {
  
  @scala.inline
  def apply(props: js.Array[Property]): DirectiveTransformResult = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveTransformResult]
  }
  
  @scala.inline
  implicit class DirectiveTransformResultMutableBuilder[Self <: DirectiveTransformResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNeedRuntime(value: Boolean | js.Symbol): Self = StObject.set(x, "needRuntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedRuntimeUndefined: Self = StObject.set(x, "needRuntime", js.undefined)
    
    @scala.inline
    def setProps(value: js.Array[Property]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsVarargs(value: Property*): Self = StObject.set(x, "props", js.Array(value :_*))
    
    @scala.inline
    def setSsrTagParts(value: js.Array[String | JSChildNode]): Self = StObject.set(x, "ssrTagParts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrTagPartsUndefined: Self = StObject.set(x, "ssrTagParts", js.undefined)
    
    @scala.inline
    def setSsrTagPartsVarargs(value: (String | JSChildNode)*): Self = StObject.set(x, "ssrTagParts", js.Array(value :_*))
  }
}
