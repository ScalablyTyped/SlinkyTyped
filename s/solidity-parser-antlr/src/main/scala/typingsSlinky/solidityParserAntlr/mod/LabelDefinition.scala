package typingsSlinky.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait LabelDefinition
  extends AssemblyItem
     with BaseASTNode {
  
  @JSName("type")
  var type_LabelDefinition: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition = js.native
}
object LabelDefinition {
  
  @scala.inline
  def apply(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition): LabelDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelDefinition]
  }
  
  @scala.inline
  implicit class LabelDefinitionMutableBuilder[Self <: LabelDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.LabelDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
