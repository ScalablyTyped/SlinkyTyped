package typingsSlinky.vueCompilerCore.mod

import typingsSlinky.vueCompilerCore.vueCompilerCoreNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextNode
  extends TemplateChildNode
     with Node2
     with TemplateTextChildNode {
  
  var content: String = js.native
  
  @JSName("type")
  var type_TextNode: `2` = js.native
}
object TextNode {
  
  @scala.inline
  def apply(content: String, loc: SourceLocation, `type`: `2`): TextNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextNode]
  }
  
  @scala.inline
  implicit class TextNodeMutableBuilder[Self <: TextNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `2`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
