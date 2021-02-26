package typingsSlinky.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.solidityParserAntlr.mod.AssemblyCall
  - typingsSlinky.solidityParserAntlr.mod.AssemblyLiteral
*/
trait AssemblyExpression extends AssemblyItem
object AssemblyExpression {
  
  @scala.inline
  def AssemblyCall(
    arguments: js.Array[AssemblyExpression],
    functionName: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCall
  ): typingsSlinky.solidityParserAntlr.mod.AssemblyCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyCall]
  }
  
  @scala.inline
  def AssemblyLiteral(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral): typingsSlinky.solidityParserAntlr.mod.AssemblyLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.solidityParserAntlr.mod.AssemblyLiteral]
  }
}
