package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestPlansWithSelection extends js.Object {
  var lastSelectedPlan: Double = js.native
  var lastSelectedSuite: Double = js.native
  var plans: js.Array[TestPlan] = js.native
}

object TestPlansWithSelection {
  @scala.inline
  def apply(lastSelectedPlan: Double, lastSelectedSuite: Double, plans: js.Array[TestPlan]): TestPlansWithSelection = {
    val __obj = js.Dynamic.literal(lastSelectedPlan = lastSelectedPlan.asInstanceOf[js.Any], lastSelectedSuite = lastSelectedSuite.asInstanceOf[js.Any], plans = plans.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlansWithSelection]
  }
  @scala.inline
  implicit class TestPlansWithSelectionOps[Self <: TestPlansWithSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastSelectedPlan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSelectedPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastSelectedSuite(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSelectedSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlans(value: js.Array[TestPlan]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plans")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

