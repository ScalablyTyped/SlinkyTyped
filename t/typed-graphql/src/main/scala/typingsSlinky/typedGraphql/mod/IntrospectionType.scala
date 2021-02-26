package typingsSlinky.typedGraphql.mod

import typingsSlinky.typedGraphql.typedGraphqlStrings.ENUM
import typingsSlinky.typedGraphql.typedGraphqlStrings.INPUT_OBJECT
import typingsSlinky.typedGraphql.typedGraphqlStrings.INTERFACE
import typingsSlinky.typedGraphql.typedGraphqlStrings.OBJECT
import typingsSlinky.typedGraphql.typedGraphqlStrings.SCALAR
import typingsSlinky.typedGraphql.typedGraphqlStrings.UNION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.IntrospectionScalarType
  - typingsSlinky.typedGraphql.mod.IntrospectionObjectType
  - typingsSlinky.typedGraphql.mod.IntrospectionInterfaceType
  - typingsSlinky.typedGraphql.mod.IntrospectionUnionType
  - typingsSlinky.typedGraphql.mod.IntrospectionEnumType
  - typingsSlinky.typedGraphql.mod.IntrospectionInputObjectType
*/
trait IntrospectionType extends StObject
object IntrospectionType {
  
  @scala.inline
  def IntrospectionEnumType(enumValues: js.Array[IntrospectionEnumValue], kind: ENUM, name: String): typingsSlinky.typedGraphql.mod.IntrospectionEnumType = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.IntrospectionEnumType]
  }
  
  @scala.inline
  def IntrospectionInputObjectType(inputFields: js.Array[IntrospectionInputValue], kind: INPUT_OBJECT, name: String): typingsSlinky.typedGraphql.mod.IntrospectionInputObjectType = {
    val __obj = js.Dynamic.literal(inputFields = inputFields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.IntrospectionInputObjectType]
  }
  
  @scala.inline
  def IntrospectionInterfaceType(
    fields: js.Array[IntrospectionField],
    kind: INTERFACE,
    name: String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef]
  ): typingsSlinky.typedGraphql.mod.IntrospectionInterfaceType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.IntrospectionInterfaceType]
  }
  
  @scala.inline
  def IntrospectionObjectType(
    fields: js.Array[IntrospectionField],
    interfaces: js.Array[IntrospectionNamedTypeRef],
    kind: OBJECT,
    name: String
  ): typingsSlinky.typedGraphql.mod.IntrospectionObjectType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.IntrospectionObjectType]
  }
  
  @scala.inline
  def IntrospectionScalarType(kind: SCALAR, name: String): typingsSlinky.typedGraphql.mod.IntrospectionScalarType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.IntrospectionScalarType]
  }
  
  @scala.inline
  def IntrospectionUnionType(kind: UNION, name: String, possibleTypes: js.Array[IntrospectionNamedTypeRef]): typingsSlinky.typedGraphql.mod.IntrospectionUnionType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.IntrospectionUnionType]
  }
}
