package typingsSlinky.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait AssemblyLocalDefinition
  extends AssemblyItem
     with BaseASTNode {
  
  @JSName("type")
  var type_AssemblyLocalDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition = js.native
}
object AssemblyLocalDefinition {
  
  @scala.inline
  def apply(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition): AssemblyLocalDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyLocalDefinition]
  }
  
  @scala.inline
  implicit class AssemblyLocalDefinitionMutableBuilder[Self <: AssemblyLocalDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
