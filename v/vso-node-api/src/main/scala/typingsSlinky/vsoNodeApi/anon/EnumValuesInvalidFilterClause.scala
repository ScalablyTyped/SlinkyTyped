package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesInvalidFilterClause extends js.Object {
  
  var enumValues: InvalidFilterClause = js.native
}
object EnumValuesInvalidFilterClause {
  
  @scala.inline
  def apply(enumValues: InvalidFilterClause): EnumValuesInvalidFilterClause = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesInvalidFilterClause]
  }
  
  @scala.inline
  implicit class EnumValuesInvalidFilterClauseOps[Self <: EnumValuesInvalidFilterClause] (val x: Self) extends AnyVal {
    
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
    def setEnumValues(value: InvalidFilterClause): Self = this.set("enumValues", value.asInstanceOf[js.Any])
  }
}
