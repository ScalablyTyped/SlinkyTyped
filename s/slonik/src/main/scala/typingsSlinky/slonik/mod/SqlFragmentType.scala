package typingsSlinky.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlFragmentType extends StObject {
  
  var parameters: js.Array[PrimitiveValueExpressionType] = js.native
  
  var sql: String = js.native
}
object SqlFragmentType {
  
  @scala.inline
  def apply(parameters: js.Array[PrimitiveValueExpressionType], sql: String): SqlFragmentType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[SqlFragmentType]
  }
  
  @scala.inline
  implicit class SqlFragmentTypeMutableBuilder[Self <: SqlFragmentType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: js.Array[PrimitiveValueExpressionType]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: PrimitiveValueExpressionType*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
  }
}
