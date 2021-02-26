package typingsSlinky.typedGraphql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLResult extends StObject {
  
  var data: js.UndefOr[js.Any] = js.native
  
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
object GraphQLResult {
  
  @scala.inline
  def apply(): GraphQLResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLResult]
  }
  
  @scala.inline
  implicit class GraphQLResultMutableBuilder[Self <: GraphQLResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Array[js.Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: js.Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
