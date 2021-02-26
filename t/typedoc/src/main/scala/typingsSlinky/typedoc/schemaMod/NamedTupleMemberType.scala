package typingsSlinky.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.NamedTupleMember, 'type'> */
@js.native
trait NamedTupleMemberType extends StObject {
  
  var element: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type] = js.native
  
  var isOptional: Boolean = js.native
  
  var name: String = js.native
  
  var `type`: (ModelToObject[/* "named-tuple-member" */ String]) | (/* "named-tuple-member" */ String) = js.native
}
object NamedTupleMemberType {
  
  @scala.inline
  def apply(
    element: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type],
    isOptional: Boolean,
    name: String,
    `type`: (ModelToObject[/* "named-tuple-member" */ String]) | (/* "named-tuple-member" */ String)
  ): NamedTupleMemberType = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], isOptional = isOptional.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedTupleMemberType]
  }
  
  @scala.inline
  implicit class NamedTupleMemberTypeMutableBuilder[Self <: NamedTupleMemberType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: ModelToObject[typingsSlinky.typedoc.typesAbstractMod.Type]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "element", js.Array(value :_*))
    
    @scala.inline
    def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: (ModelToObject[/* "named-tuple-member" */ String]) | (/* "named-tuple-member" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
