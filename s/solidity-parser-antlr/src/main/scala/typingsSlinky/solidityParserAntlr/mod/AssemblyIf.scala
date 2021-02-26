package typingsSlinky.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait AssemblyIf
  extends AssemblyItem
     with BaseASTNode {
  
  @JSName("type")
  var type_AssemblyIf: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf = js.native
}
object AssemblyIf {
  
  @scala.inline
  def apply(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf): AssemblyIf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyIf]
  }
  
  @scala.inline
  implicit class AssemblyIfMutableBuilder[Self <: AssemblyIf] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
