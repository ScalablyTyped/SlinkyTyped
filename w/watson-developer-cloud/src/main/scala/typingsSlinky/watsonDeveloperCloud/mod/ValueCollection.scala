package typingsSlinky.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ValueCollection. */
@js.native
trait ValueCollection extends StObject {
  
  /** The pagination data for the returned objects. */
  var pagination: Pagination = js.native
  
  /** An array of entity values. */
  var values: js.Array[Value] = js.native
}
object ValueCollection {
  
  @scala.inline
  def apply(pagination: Pagination, values: js.Array[Value]): ValueCollection = {
    val __obj = js.Dynamic.literal(pagination = pagination.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueCollection]
  }
  
  @scala.inline
  implicit class ValueCollectionMutableBuilder[Self <: ValueCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPagination(value: Pagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[Value]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Value*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
