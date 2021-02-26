package typingsSlinky.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
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
  implicit class ArrayTypeNameMutableBuilder[Self <: ArrayTypeName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseTypeName(value: TypeName): Self = StObject.set(x, "baseTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Expression): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
