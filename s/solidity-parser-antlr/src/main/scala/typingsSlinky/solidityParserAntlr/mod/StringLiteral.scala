package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringLiteral
  extends AssemblyItem
     with BaseASTNode {
  
  @JSName("type")
  var type_StringLiteral: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral = js.native
  
  var value: String = js.native
}
object StringLiteral {
  
  @scala.inline
  def apply(`type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral, value: String): StringLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringLiteral]
  }
  
  @scala.inline
  implicit class StringLiteralOps[Self <: StringLiteral] (val x: Self) extends AnyVal {
    
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
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.StringLiteral): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
