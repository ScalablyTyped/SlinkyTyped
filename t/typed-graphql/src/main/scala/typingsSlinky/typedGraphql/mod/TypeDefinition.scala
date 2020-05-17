package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit def apply(value: EnumTypeDefinition): TypeDefinition = value.asInstanceOf[TypeDefinition]
  @scala.inline
  implicit def apply(value: InputObjectTypeDefinition): TypeDefinition = value.asInstanceOf[TypeDefinition]
  @scala.inline
  implicit def apply(value: InterfaceTypeDefinition): TypeDefinition = value.asInstanceOf[TypeDefinition]
  @scala.inline
  implicit def apply(value: ObjectTypeDefinition): TypeDefinition = value.asInstanceOf[TypeDefinition]
  @scala.inline
  implicit def apply(value: ScalarTypeDefinition): TypeDefinition = value.asInstanceOf[TypeDefinition]
  @scala.inline
  implicit def apply(value: TypeExtensionDefinition): TypeDefinition = value.asInstanceOf[TypeDefinition]
  @scala.inline
  implicit def apply(value: UnionTypeDefinition): TypeDefinition = value.asInstanceOf[TypeDefinition]
}

