package typingsSlinky.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait AssemblyStackAssignment
  extends AssemblyItem
     with BaseASTNode {
  
  @JSName("type")
  var type_AssemblyStackAssignment: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment = js.native
}
object AssemblyStackAssignment {
  
  @scala.inline
  def apply(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment): AssemblyStackAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyStackAssignment]
  }
  
  @scala.inline
  implicit class AssemblyStackAssignmentMutableBuilder[Self <: AssemblyStackAssignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyStackAssignment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
