package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.IntrospectionScalarType
  - typingsSlinky.typedGraphql.mod.IntrospectionObjectType
  - typingsSlinky.typedGraphql.mod.IntrospectionInterfaceType
  - typingsSlinky.typedGraphql.mod.IntrospectionUnionType
  - typingsSlinky.typedGraphql.mod.IntrospectionEnumType
  - typingsSlinky.typedGraphql.mod.IntrospectionInputObjectType
*/
trait IntrospectionType extends js.Object

object IntrospectionType {
  @scala.inline
  implicit def apply(value: IntrospectionEnumType): IntrospectionType = value.asInstanceOf[IntrospectionType]
  @scala.inline
  implicit def apply(value: IntrospectionInputObjectType): IntrospectionType = value.asInstanceOf[IntrospectionType]
  @scala.inline
  implicit def apply(value: IntrospectionInterfaceType): IntrospectionType = value.asInstanceOf[IntrospectionType]
  @scala.inline
  implicit def apply(value: IntrospectionObjectType): IntrospectionType = value.asInstanceOf[IntrospectionType]
  @scala.inline
  implicit def apply(value: IntrospectionScalarType): IntrospectionType = value.asInstanceOf[IntrospectionType]
  @scala.inline
  implicit def apply(value: IntrospectionUnionType): IntrospectionType = value.asInstanceOf[IntrospectionType]
}

