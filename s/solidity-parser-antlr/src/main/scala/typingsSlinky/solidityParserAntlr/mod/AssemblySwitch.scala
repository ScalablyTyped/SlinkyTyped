package typingsSlinky.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait AssemblySwitch
  extends AssemblyItem
     with BaseASTNode {
  
  @JSName("type")
  var type_AssemblySwitch: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch = js.native
}
object AssemblySwitch {
  
  @scala.inline
  def apply(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch): AssemblySwitch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblySwitch]
  }
  
  @scala.inline
  implicit class AssemblySwitchMutableBuilder[Self <: AssemblySwitch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblySwitch): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
