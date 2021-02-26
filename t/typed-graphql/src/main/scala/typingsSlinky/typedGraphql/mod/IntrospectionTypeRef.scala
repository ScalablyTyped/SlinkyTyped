package typingsSlinky.typedGraphql.mod

import typingsSlinky.typedGraphql.typedGraphqlStrings.LIST
import typingsSlinky.typedGraphql.typedGraphqlStrings.NON_NULL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.IntrospectionNamedTypeRef
  - typingsSlinky.typedGraphql.mod.IntrospectionListTypeRef
  - typingsSlinky.typedGraphql.mod.IntrospectionNonNullTypeRef
*/
trait IntrospectionTypeRef extends StObject
object IntrospectionTypeRef {
  
  @scala.inline
  def IntrospectionListTypeRef(kind: LIST): typingsSlinky.typedGraphql.mod.IntrospectionListTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.IntrospectionListTypeRef]
  }
  
  @scala.inline
  def IntrospectionNamedTypeRef(kind: String, name: String): typingsSlinky.typedGraphql.mod.IntrospectionNamedTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.IntrospectionNamedTypeRef]
  }
  
  @scala.inline
  def IntrospectionNonNullTypeRef(kind: NON_NULL): typingsSlinky.typedGraphql.mod.IntrospectionNonNullTypeRef = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.IntrospectionNonNullTypeRef]
  }
}
