package typingsSlinky.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.solidityParserAntlr.mod.ElementaryTypeName
  - typingsSlinky.solidityParserAntlr.mod.UserDefinedTypeName
  - typingsSlinky.solidityParserAntlr.mod.Mapping
  - typingsSlinky.solidityParserAntlr.mod.ArrayTypeName
  - typingsSlinky.solidityParserAntlr.mod.FunctionTypeName
*/
trait TypeName extends ASTNode
object TypeName {
  
  @scala.inline
  def Mapping(
    keyType: ElementaryTypeName,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.Mapping,
    valueType: TypeName
  ): TypeName = {
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeName]
  }
  
  @scala.inline
  def FunctionTypeName(
    parameterTypes: js.Array[TypeName],
    returnTypes: js.Array[TypeName],
    stateMutability: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.FunctionTypeName,
    visibility: String
  ): TypeName = {
    val __obj = js.Dynamic.literal(parameterTypes = parameterTypes.asInstanceOf[js.Any], returnTypes = returnTypes.asInstanceOf[js.Any], stateMutability = stateMutability.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeName]
  }
  
  @scala.inline
  def ElementaryTypeName(
    name: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName
  ): TypeName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeName]
  }
  
  @scala.inline
  def ArrayTypeName(
    baseTypeName: TypeName,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.ArrayTypeName
  ): TypeName = {
    val __obj = js.Dynamic.literal(baseTypeName = baseTypeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeName]
  }
  
  @scala.inline
  def UserDefinedTypeName(
    namePath: String,
    `type`: typingsSlinky.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName
  ): TypeName = {
    val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeName]
  }
}
