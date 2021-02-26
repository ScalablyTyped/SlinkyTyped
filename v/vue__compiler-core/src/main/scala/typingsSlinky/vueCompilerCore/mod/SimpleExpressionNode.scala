package typingsSlinky.vueCompilerCore.mod

import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleExpressionNode
  extends ExpressionNode
     with Node2 {
  
  var content: String = js.native
  
  /**
    * Indicates this is an identifier for a hoist vnode call and points to the
    * hoisted node.
    */
  var hoisted: js.UndefOr[JSChildNode] = js.native
  
  /**
    * an expression parsed as the params of a function will track
    * the identifiers declared inside the function body.
    */
  var identifiers: js.UndefOr[js.Array[String]] = js.native
  
  var isConstant: Boolean = js.native
  
  /**
    * some expressions (e.g. transformAssetUrls import identifiers) are constant,
    * but cannot be stringified because they must be first evaluated at runtime.
    */
  var isRuntimeConstant: js.UndefOr[Boolean] = js.native
  
  var isStatic: Boolean = js.native
  
  @JSName("type")
  var type_SimpleExpressionNode: `4` = js.native
}
object SimpleExpressionNode {
  
  @scala.inline
  def apply(content: String, isConstant: Boolean, isStatic: Boolean, loc: SourceLocation, `type`: `4`): SimpleExpressionNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], isConstant = isConstant.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleExpressionNode]
  }
  
  @scala.inline
  implicit class SimpleExpressionNodeMutableBuilder[Self <: SimpleExpressionNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoisted(value: JSChildNode): Self = StObject.set(x, "hoisted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoistedUndefined: Self = StObject.set(x, "hoisted", js.undefined)
    
    @scala.inline
    def setIdentifiers(value: js.Array[String]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifiersUndefined: Self = StObject.set(x, "identifiers", js.undefined)
    
    @scala.inline
    def setIdentifiersVarargs(value: String*): Self = StObject.set(x, "identifiers", js.Array(value :_*))
    
    @scala.inline
    def setIsConstant(value: Boolean): Self = StObject.set(x, "isConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRuntimeConstant(value: Boolean): Self = StObject.set(x, "isRuntimeConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRuntimeConstantUndefined: Self = StObject.set(x, "isRuntimeConstant", js.undefined)
    
    @scala.inline
    def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `4`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
