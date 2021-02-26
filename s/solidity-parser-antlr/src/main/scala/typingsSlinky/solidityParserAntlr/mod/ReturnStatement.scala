package typingsSlinky.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  
  var expression: Expression | Null = js.native
  
  @JSName("type")
  var type_ReturnStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement = js.native
}
object ReturnStatement {
  
  @scala.inline
  def apply(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement): ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnStatement]
  }
  
  @scala.inline
  implicit class ReturnStatementMutableBuilder[Self <: ReturnStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionNull: Self = StObject.set(x, "expression", null)
    
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
