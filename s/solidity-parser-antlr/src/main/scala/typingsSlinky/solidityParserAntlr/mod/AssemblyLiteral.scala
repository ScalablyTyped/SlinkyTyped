package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class AssemblyLiteralOps[Self <: AssemblyLiteral] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

