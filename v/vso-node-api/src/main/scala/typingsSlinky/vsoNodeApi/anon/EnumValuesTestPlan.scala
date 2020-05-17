package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumValuesTestPlan extends js.Object {
  var enumValues: TestPlan = js.native
}

object EnumValuesTestPlan {
  @scala.inline
  def apply(enumValues: TestPlan): EnumValuesTestPlan = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesTestPlan]
  }
  @scala.inline
  implicit class EnumValuesTestPlanOps[Self <: EnumValuesTestPlan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnumValues(value: TestPlan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

