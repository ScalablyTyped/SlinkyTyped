package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTestPlan extends js.Object {
  var testPlan: Double = js.native
  var testSuite: Double = js.native
}

object AnonTestPlan {
  @scala.inline
  def apply(testPlan: Double, testSuite: Double): AnonTestPlan = {
    val __obj = js.Dynamic.literal(testPlan = testPlan.asInstanceOf[js.Any], testSuite = testSuite.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTestPlan]
  }
  @scala.inline
  implicit class AnonTestPlanOps[Self <: AnonTestPlan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTestPlan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestSuite(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSuite")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

