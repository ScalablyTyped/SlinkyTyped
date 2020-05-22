package typingsSlinky.typedGraphql.mod

import typingsSlinky.typedGraphql.typedGraphqlStrings.LIST
import typingsSlinky.typedGraphql.typedGraphqlStrings.NON_NULL
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
  def IntrospectionNamedTypeRef(kind: String, name: String): IntrospectionTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionTypeRef]
  }
  @scala.inline
  def IntrospectionListTypeRef(kind: LIST, ofType: IntrospectionTypeRef = null): IntrospectionTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (ofType != null) __obj.updateDynamic("ofType")(ofType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionTypeRef]
  }
  @scala.inline
  def IntrospectionNonNullTypeRef(kind: NON_NULL, ofType: IntrospectionTypeRef = null): IntrospectionTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (ofType != null) __obj.updateDynamic("ofType")(ofType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionTypeRef]
  }
}

