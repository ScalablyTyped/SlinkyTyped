package typingsSlinky.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreakStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  
  @JSName("type")
  var type_BreakStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement = js.native
}
object BreakStatement {
  
  @scala.inline
  def apply(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement): BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakStatement]
  }
  
  @scala.inline
  implicit class BreakStatementMutableBuilder[Self <: BreakStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
