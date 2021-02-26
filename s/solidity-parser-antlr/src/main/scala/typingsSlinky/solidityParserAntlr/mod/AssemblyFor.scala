package typingsSlinky.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait AssemblyFor
  extends AssemblyItem
     with BaseASTNode {
  
  @JSName("type")
  var type_AssemblyFor: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor = js.native
}
object AssemblyFor {
  
  @scala.inline
  def apply(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor): AssemblyFor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyFor]
  }
  
  @scala.inline
  implicit class AssemblyForMutableBuilder[Self <: AssemblyFor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
