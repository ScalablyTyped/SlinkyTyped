package typingsSlinky.webpagetest.mod

import typingsSlinky.webpagetest.webpagetestBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestStatus extends js.Object {
  var completeTime: String = js.native
  var elapsed: Double = js.native
  var fvRunsCompleted: Double = js.native
  var fvonly: Double = js.native
  var id: String = js.native
  var location: String = js.native
  var remote: `false` = js.native
  var runs: Double = js.native
  var rvRunsCompleted: Double = js.native
  var startTime: String = js.native
  var statusCode: Double = js.native
  var statusText: String = js.native
  var testId: String = js.native
  var testInfo: TestInfo = js.native
  var testsCompleted: Double = js.native
  var testsExpected: Double = js.native
}

object TestStatus {
  @scala.inline
  def apply(
    completeTime: String,
    elapsed: Double,
    fvRunsCompleted: Double,
    fvonly: Double,
    id: String,
    location: String,
    remote: `false`,
    runs: Double,
    rvRunsCompleted: Double,
    startTime: String,
    statusCode: Double,
    statusText: String,
    testId: String,
    testInfo: TestInfo,
    testsCompleted: Double,
    testsExpected: Double
  ): TestStatus = {
    val __obj = js.Dynamic.literal(completeTime = completeTime.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any], fvRunsCompleted = fvRunsCompleted.asInstanceOf[js.Any], fvonly = fvonly.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any], rvRunsCompleted = rvRunsCompleted.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], testId = testId.asInstanceOf[js.Any], testInfo = testInfo.asInstanceOf[js.Any], testsCompleted = testsCompleted.asInstanceOf[js.Any], testsExpected = testsExpected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestStatus]
  }
  @scala.inline
  implicit class TestStatusOps[Self <: TestStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompleteTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElapsed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFvRunsCompleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fvRunsCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFvonly(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fvonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemote(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRvRunsCompleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rvRunsCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestInfo(value: TestInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestsCompleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testsCompleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestsExpected(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testsExpected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

