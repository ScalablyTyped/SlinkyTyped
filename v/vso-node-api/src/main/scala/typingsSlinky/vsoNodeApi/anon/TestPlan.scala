package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestPlan extends js.Object {
  var testPlan: scala.Double = js.native
  var testSuite: scala.Double = js.native
}

object TestPlan {
  @scala.inline
  def apply(testPlan: scala.Double, testSuite: scala.Double): TestPlan = {
    val __obj = js.Dynamic.literal(testPlan = testPlan.asInstanceOf[js.Any], testSuite = testSuite.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlan]
  }
  @scala.inline
  implicit class TestPlanOps[Self <: TestPlan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTestPlan(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestSuite(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSuite")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

