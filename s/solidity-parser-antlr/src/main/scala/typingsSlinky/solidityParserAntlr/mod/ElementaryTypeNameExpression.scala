package typingsSlinky.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait ElementaryTypeNameExpression
  extends PrimaryExpression
     with BaseASTNode {
  
  var typeName: ElementaryTypeName = js.native
  
  @JSName("type")
  var type_ElementaryTypeNameExpression: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression = js.native
}
object ElementaryTypeNameExpression {
  
  @scala.inline
  def apply(
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression,
    typeName: ElementaryTypeName
  ): ElementaryTypeNameExpression = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementaryTypeNameExpression]
  }
  
  @scala.inline
  implicit class ElementaryTypeNameExpressionMutableBuilder[Self <: ElementaryTypeNameExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeNameExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: ElementaryTypeName): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
