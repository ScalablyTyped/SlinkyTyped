package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PragmaDirective
  extends BaseASTNode
     with ASTNode {
  
  var name: String = js.native
  
  @JSName("type")
  var type_PragmaDirective: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective = js.native
  
  var value: String = js.native
}
object PragmaDirective {
  
  @scala.inline
  def apply(
    name: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective,
    value: String
  ): PragmaDirective = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PragmaDirective]
  }
  
  @scala.inline
  implicit class PragmaDirectiveOps[Self <: PragmaDirective] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.PragmaDirective): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
