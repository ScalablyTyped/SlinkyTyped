package typingsSlinky.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Type Reference
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.typedGraphql.mod.NamedType
  - typingsSlinky.typedGraphql.mod.ListType
  - typingsSlinky.typedGraphql.mod.NonNullType
*/
trait Type extends StObject
object Type {
  
  @scala.inline
  def ListType(kind: String, `type`: Type): typingsSlinky.typedGraphql.mod.ListType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.ListType]
  }
  
  @scala.inline
  def NamedType(kind: String, name: Name): typingsSlinky.typedGraphql.mod.NamedType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.NamedType]
  }
  
  @scala.inline
  def NonNullType(kind: String, `type`: NamedType | ListType): typingsSlinky.typedGraphql.mod.NonNullType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.typedGraphql.mod.NonNullType]
  }
}
