package typingsSlinky.vueCompilerCore.mod

import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`0`
import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlainElementNode
  extends ElementNode
     with BaseElementNode {
  
  var codegenNode: js.UndefOr[VNodeCall | SimpleExpressionNode | CacheExpression] = js.native
  
  var ssrCodegenNode: js.UndefOr[TemplateLiteral] = js.native
  
  @JSName("tagType")
  var tagType_PlainElementNode: `0` = js.native
}
object PlainElementNode {
  
  @scala.inline
  def apply(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String,
    tagType: `0`,
    `type`: `1`
  ): PlainElementNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = tagType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlainElementNode]
  }
  
  @scala.inline
  implicit class PlainElementNodeMutableBuilder[Self <: PlainElementNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodegenNode(value: VNodeCall | SimpleExpressionNode | CacheExpression): Self = StObject.set(x, "codegenNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodegenNodeUndefined: Self = StObject.set(x, "codegenNode", js.undefined)
    
    @scala.inline
    def setSsrCodegenNode(value: TemplateLiteral): Self = StObject.set(x, "ssrCodegenNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrCodegenNodeUndefined: Self = StObject.set(x, "ssrCodegenNode", js.undefined)
    
    @scala.inline
    def setTagType(value: `0`): Self = StObject.set(x, "tagType", value.asInstanceOf[js.Any])
  }
}
