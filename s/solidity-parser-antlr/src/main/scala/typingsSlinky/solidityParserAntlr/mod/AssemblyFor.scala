package typingsSlinky.solidityParserAntlr.mod

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
  implicit class AssemblyForOps[Self <: AssemblyFor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyFor): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
