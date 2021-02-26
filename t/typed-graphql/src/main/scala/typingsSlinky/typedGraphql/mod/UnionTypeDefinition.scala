package typingsSlinky.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnionTypeDefinition
  extends TypeDefinition
     with Node {
  
  var kind: String = js.native
  
  var loc: js.UndefOr[Location] = js.native
  
  var name: Name = js.native
  
  var types: js.Array[NamedType] = js.native
}
object UnionTypeDefinition {
  
  @scala.inline
  def apply(kind: String, name: Name, types: js.Array[NamedType]): UnionTypeDefinition = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionTypeDefinition]
  }
  
  @scala.inline
  implicit class UnionTypeDefinitionMutableBuilder[Self <: UnionTypeDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: Location): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: js.Array[NamedType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: NamedType*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
