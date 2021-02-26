package typingsSlinky.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThrowStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  
  @JSName("type")
  var type_ThrowStatement: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement = js.native
}
object ThrowStatement {
  
  @scala.inline
  def apply(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement): ThrowStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrowStatement]
  }
  
  @scala.inline
  implicit class ThrowStatementMutableBuilder[Self <: ThrowStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
