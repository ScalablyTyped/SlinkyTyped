package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestPlanCloneRequest extends js.Object {
  var destinationTestPlan: TestPlan = js.native
  var options: CloneOptions = js.native
  var suiteIds: js.Array[Double] = js.native
}

object TestPlanCloneRequest {
  @scala.inline
  def apply(destinationTestPlan: TestPlan, options: CloneOptions, suiteIds: js.Array[Double]): TestPlanCloneRequest = {
    val __obj = js.Dynamic.literal(destinationTestPlan = destinationTestPlan.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], suiteIds = suiteIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlanCloneRequest]
  }
  @scala.inline
  implicit class TestPlanCloneRequestOps[Self <: TestPlanCloneRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationTestPlan(value: TestPlan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationTestPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: CloneOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuiteIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suiteIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

