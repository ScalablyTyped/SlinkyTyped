package typingsSlinky.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinueStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  
  @JSName("type")
  var type_ContinueStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement = js.native
}
object ContinueStatement {
  
  @scala.inline
  def apply(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement): ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueStatement]
  }
  
  @scala.inline
  implicit class ContinueStatementMutableBuilder[Self <: ContinueStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
