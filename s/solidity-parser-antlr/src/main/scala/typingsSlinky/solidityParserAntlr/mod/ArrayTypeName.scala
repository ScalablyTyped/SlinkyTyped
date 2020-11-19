package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayTypeName
  extends TypeName
     with BaseASTNode {
  
  var baseTypeName: TypeName = js.native
  
  var length: js.UndefOr[Expression] = js.native
  
  @JSName("type")
  var type_ArrayTypeName: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName = js.native
}
object ArrayTypeName {
  
  @scala.inline
  def apply(
    baseTypeName: TypeName,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName
  ): ArrayTypeName = {
    val __obj = js.Dynamic.literal(baseTypeName = baseTypeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayTypeName]
  }
  
  @scala.inline
  implicit class ArrayTypeNameOps[Self <: ArrayTypeName] (val x: Self) extends AnyVal {
    
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
    def setBaseTypeName(value: TypeName): Self = this.set("baseTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Expression): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
  }
}
