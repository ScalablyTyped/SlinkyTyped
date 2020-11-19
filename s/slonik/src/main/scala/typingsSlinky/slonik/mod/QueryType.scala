package typingsSlinky.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryType extends js.Object {
  
  var sql: String = js.native
  
  var values: js.UndefOr[js.Array[PrimitiveValueExpressionType]] = js.native
}
object QueryType {
  
  @scala.inline
  def apply(sql: String): QueryType = {
    val __obj = js.Dynamic.literal(sql = sql.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryType]
  }
  
  @scala.inline
  implicit class QueryTypeOps[Self <: QueryType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSql(value: String): Self = this.set("sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: PrimitiveValueExpressionType*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[PrimitiveValueExpressionType]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
