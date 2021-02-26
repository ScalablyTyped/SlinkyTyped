package typingsSlinky.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait AssemblyLiteral
  extends AssemblyExpression
     with BaseASTNode {
  
  @JSName("type")
  var type_AssemblyLiteral: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral = js.native
}
object AssemblyLiteral {
  
  @scala.inline
  def apply(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral): AssemblyLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyLiteral]
  }
  
  @scala.inline
  implicit class AssemblyLiteralMutableBuilder[Self <: AssemblyLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
