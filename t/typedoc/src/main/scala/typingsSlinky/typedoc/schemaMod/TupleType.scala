package typingsSlinky.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.TupleType, 'type'> */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.typedoc.schemaMod.__ModelToObject because Already inherited */ @js.native
trait TupleType extends SomeType {
  
  var elements: js.UndefOr[ModelToObject[js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]]] = js.native
  
  var `type`: (ModelToObject[/* "tuple" */ String]) | (/* "tuple" */ String) = js.native
}
object TupleType {
  
  @scala.inline
  def apply(`type`: (ModelToObject[/* "tuple" */ String]) | (/* "tuple" */ String)): TupleType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TupleType]
  }
  
  @scala.inline
  implicit class TupleTypeMutableBuilder[Self <: TupleType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: ModelToObject[js.Array[typingsSlinky.typedoc.typesAbstractMod.Type]]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    @scala.inline
    def setElementsVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setType(value: (ModelToObject[/* "tuple" */ String]) | (/* "tuple" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
