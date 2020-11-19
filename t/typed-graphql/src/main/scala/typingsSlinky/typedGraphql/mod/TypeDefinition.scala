package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Type Definition
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.ObjectTypeDefinition
  - typingsSlinky.typedGraphql.mod.InterfaceTypeDefinition
  - typingsSlinky.typedGraphql.mod.UnionTypeDefinition
  - typingsSlinky.typedGraphql.mod.ScalarTypeDefinition
  - typingsSlinky.typedGraphql.mod.EnumTypeDefinition
  - typingsSlinky.typedGraphql.mod.InputObjectTypeDefinition
  - typingsSlinky.typedGraphql.mod.TypeExtensionDefinition
*/
trait TypeDefinition extends Definition
object TypeDefinition {
  
  @scala.inline
  def UnionTypeDefinition(kind: String, name: Name, types: js.Array[NamedType]): TypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinition]
  }
  
  @scala.inline
  def InterfaceTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name): TypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinition]
  }
  
  @scala.inline
  def InputObjectTypeDefinition(fields: js.Array[InputValueDefinition], kind: String, name: Name): TypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinition]
  }
  
  @scala.inline
  def ObjectTypeDefinition(fields: js.Array[FieldDefinition], kind: String, name: Name): TypeDefinition = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinition]
  }
  
  @scala.inline
  def EnumTypeDefinition(kind: String, name: Name, values: js.Array[EnumValueDefinition]): TypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinition]
  }
  
  @scala.inline
  def TypeExtensionDefinition(definition: ObjectTypeDefinition, kind: String): TypeDefinition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinition]
  }
  
  @scala.inline
  def ScalarTypeDefinition(kind: String, name: Name): TypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDefinition]
  }
}
