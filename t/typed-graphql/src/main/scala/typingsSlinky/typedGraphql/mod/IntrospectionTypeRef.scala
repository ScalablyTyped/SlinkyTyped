package typingsSlinky.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.IntrospectionNamedTypeRef
  - typingsSlinky.typedGraphql.mod.IntrospectionListTypeRef
  - typingsSlinky.typedGraphql.mod.IntrospectionNonNullTypeRef
*/
trait IntrospectionTypeRef extends js.Object

object IntrospectionTypeRef {
  @scala.inline
  implicit def apply(value: IntrospectionListTypeRef): IntrospectionTypeRef = value.asInstanceOf[IntrospectionTypeRef]
  @scala.inline
  implicit def apply(value: IntrospectionNamedTypeRef): IntrospectionTypeRef = value.asInstanceOf[IntrospectionTypeRef]
  @scala.inline
  implicit def apply(value: IntrospectionNonNullTypeRef): IntrospectionTypeRef = value.asInstanceOf[IntrospectionTypeRef]
}

