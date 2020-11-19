package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesIgnoreConstraints extends js.Object {
  
  var enumValues: IgnoreConstraints = js.native
}
object EnumValuesIgnoreConstraints {
  
  @scala.inline
  def apply(enumValues: IgnoreConstraints): EnumValuesIgnoreConstraints = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesIgnoreConstraints]
  }
  
  @scala.inline
  implicit class EnumValuesIgnoreConstraintsOps[Self <: EnumValuesIgnoreConstraints] (val x: Self) extends AnyVal {
    
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
    def setEnumValues(value: IgnoreConstraints): Self = this.set("enumValues", value.asInstanceOf[js.Any])
  }
}
