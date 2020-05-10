package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemToTestLinks extends js.Object {
  var tests: js.Array[TestMethod] = js.native
  var workItem: WorkItemReference = js.native
}

object WorkItemToTestLinks {
  @scala.inline
  def apply(tests: js.Array[TestMethod], workItem: WorkItemReference): WorkItemToTestLinks = {
    val __obj = js.Dynamic.literal(tests = tests.asInstanceOf[js.Any], workItem = workItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemToTestLinks]
  }
  @scala.inline
  implicit class WorkItemToTestLinksOps[Self <: WorkItemToTestLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTests(value: js.Array[TestMethod]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItem(value: WorkItemReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

