package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesFinishTimeAscending extends js.Object {
  
  var enumValues: FinishTimeAscending = js.native
}
object EnumValuesFinishTimeAscending {
  
  @scala.inline
  def apply(enumValues: FinishTimeAscending): EnumValuesFinishTimeAscending = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFinishTimeAscending]
  }
  
  @scala.inline
  implicit class EnumValuesFinishTimeAscendingOps[Self <: EnumValuesFinishTimeAscending] (val x: Self) extends AnyVal {
    
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
    def setEnumValues(value: FinishTimeAscending): Self = this.set("enumValues", value.asInstanceOf[js.Any])
  }
}
