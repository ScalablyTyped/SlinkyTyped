package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestCaseResultIdentifier extends js.Object {
  var testResultId: Double = js.native
  var testRunId: Double = js.native
}

object TestCaseResultIdentifier {
  @scala.inline
  def apply(testResultId: Double, testRunId: Double): TestCaseResultIdentifier = {
    val __obj = js.Dynamic.literal(testResultId = testResultId.asInstanceOf[js.Any], testRunId = testRunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCaseResultIdentifier]
  }
  @scala.inline
  implicit class TestCaseResultIdentifierOps[Self <: TestCaseResultIdentifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTestResultId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testResultId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestRunId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testRunId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

