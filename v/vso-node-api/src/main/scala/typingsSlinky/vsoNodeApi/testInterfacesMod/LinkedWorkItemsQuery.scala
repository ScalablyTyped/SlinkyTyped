package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinkedWorkItemsQuery extends js.Object {
  var automatedTestNames: js.Array[String] = js.native
  var planId: Double = js.native
  var pointIds: js.Array[Double] = js.native
  var suiteIds: js.Array[Double] = js.native
  var testCaseIds: js.Array[Double] = js.native
  var workItemCategory: String = js.native
}

object LinkedWorkItemsQuery {
  @scala.inline
  def apply(
    automatedTestNames: js.Array[String],
    planId: Double,
    pointIds: js.Array[Double],
    suiteIds: js.Array[Double],
    testCaseIds: js.Array[Double],
    workItemCategory: String
  ): LinkedWorkItemsQuery = {
    val __obj = js.Dynamic.literal(automatedTestNames = automatedTestNames.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], pointIds = pointIds.asInstanceOf[js.Any], suiteIds = suiteIds.asInstanceOf[js.Any], testCaseIds = testCaseIds.asInstanceOf[js.Any], workItemCategory = workItemCategory.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedWorkItemsQuery]
  }
  @scala.inline
  implicit class LinkedWorkItemsQueryOps[Self <: LinkedWorkItemsQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomatedTestNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automatedTestNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlanId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPointIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuiteIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suiteIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestCaseIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testCaseIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItemCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItemCategory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

