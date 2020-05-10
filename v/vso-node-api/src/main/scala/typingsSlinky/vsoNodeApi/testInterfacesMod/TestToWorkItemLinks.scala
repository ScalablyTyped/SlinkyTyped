package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestToWorkItemLinks extends js.Object {
  var test: TestMethod = js.native
  var workItems: js.Array[WorkItemReference] = js.native
}

object TestToWorkItemLinks {
  @scala.inline
  def apply(test: TestMethod, workItems: js.Array[WorkItemReference]): TestToWorkItemLinks = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestToWorkItemLinks]
  }
  @scala.inline
  implicit class TestToWorkItemLinksOps[Self <: TestToWorkItemLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTest(value: TestMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
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

