package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestPlanHubData extends js.Object {
  var selectedSuiteId: Double = js.native
  var testPlan: TestPlan = js.native
  var testPoints: js.Array[TestPoint] = js.native
  var testSuites: js.Array[TestSuite] = js.native
  var totalTestPoints: Double = js.native
}

object TestPlanHubData {
  @scala.inline
  def apply(
    selectedSuiteId: Double,
    testPlan: TestPlan,
    testPoints: js.Array[TestPoint],
    testSuites: js.Array[TestSuite],
    totalTestPoints: Double
  ): TestPlanHubData = {
    val __obj = js.Dynamic.literal(selectedSuiteId = selectedSuiteId.asInstanceOf[js.Any], testPlan = testPlan.asInstanceOf[js.Any], testPoints = testPoints.asInstanceOf[js.Any], testSuites = testSuites.asInstanceOf[js.Any], totalTestPoints = totalTestPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestPlanHubData]
  }
  @scala.inline
  implicit class TestPlanHubDataOps[Self <: TestPlanHubData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedSuiteId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedSuiteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestPlan(value: TestPlan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestPoints(value: js.Array[TestPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestSuites(value: js.Array[TestSuite]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testSuites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalTestPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTestPoints")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

