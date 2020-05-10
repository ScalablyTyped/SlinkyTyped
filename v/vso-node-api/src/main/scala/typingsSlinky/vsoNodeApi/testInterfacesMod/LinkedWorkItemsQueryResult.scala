package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkedWorkItemsQueryResult extends js.Object {
  var automatedTestName: String = js.native
  var planId: Double = js.native
  var pointId: Double = js.native
  var suiteId: Double = js.native
  var testCaseId: Double = js.native
  var workItems: js.Array[WorkItemReference] = js.native
}

object LinkedWorkItemsQueryResult {
  @scala.inline
  def apply(
    automatedTestName: String,
    planId: Double,
    pointId: Double,
    suiteId: Double,
    testCaseId: Double,
    workItems: js.Array[WorkItemReference]
  ): LinkedWorkItemsQueryResult = {
    val __obj = js.Dynamic.literal(automatedTestName = automatedTestName.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], pointId = pointId.asInstanceOf[js.Any], suiteId = suiteId.asInstanceOf[js.Any], testCaseId = testCaseId.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedWorkItemsQueryResult]
  }
  @scala.inline
  implicit class LinkedWorkItemsQueryResultOps[Self <: LinkedWorkItemsQueryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomatedTestName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatedTestName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlanId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuiteId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suiteId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestCaseId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCaseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItems(value: js.Array[WorkItemReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

