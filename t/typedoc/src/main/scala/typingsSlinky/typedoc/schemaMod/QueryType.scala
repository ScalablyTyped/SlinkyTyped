package typingsSlinky.typedoc.schemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.QueryType, 'type' | 'queryType'> */
@js.native
trait QueryType extends StObject {
  
  var queryType: ModelToObject[typingsSlinky.typedoc.modelsTypesReferenceMod.ReferenceType] | typingsSlinky.typedoc.modelsTypesReferenceMod.ReferenceType = js.native
  
  var `type`: (ModelToObject[/* "query" */ String]) | (/* "query" */ String) = js.native
}
object QueryType {
  
  @scala.inline
  def apply(
    queryType: ModelToObject[typingsSlinky.typedoc.modelsTypesReferenceMod.ReferenceType] | typingsSlinky.typedoc.modelsTypesReferenceMod.ReferenceType,
    `type`: (ModelToObject[/* "query" */ String]) | (/* "query" */ String)
  ): QueryType = {
    val __obj = js.Dynamic.literal(queryType = queryType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryType]
  }
  
  @scala.inline
  implicit class QueryTypeMutableBuilder[Self <: QueryType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueryType(
      value: ModelToObject[typingsSlinky.typedoc.modelsTypesReferenceMod.ReferenceType] | typingsSlinky.typedoc.modelsTypesReferenceMod.ReferenceType
    ): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "queryType", js.Array(value :_*))
    
    @scala.inline
    def setType(value: (ModelToObject[/* "query" */ String]) | (/* "query" */ String)): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = StObject.set(x, "type", js.Array(value :_*))
  }
}
