package typingsSlinky.webpagetest.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResult extends js.Object {
  var average: TestRun = js.native
  var bwDown: Double = js.native
  var bwUp: Double = js.native
  var completed: Double = js.native
  var connectivity: String = js.native
  var from: String = js.native
  var fvonly: Boolean = js.native
  var id: String = js.native
  var latency: Double = js.native
  var location: String = js.native
  var median: TestRun = js.native
  var mobile: Double = js.native
  var plr: String = js.native
  var runs: StringDictionary[TestRun] = js.native
  var standardDeviation: TestRun = js.native
  var successfulFVRuns: Double = js.native
  var summary: String = js.native
  var testUrl: String = js.native
  var tester: String = js.native
  var testerDNS: String = js.native
  var url: String = js.native
}

object TestResult {
  @scala.inline
  def apply(
    average: TestRun,
    bwDown: Double,
    bwUp: Double,
    completed: Double,
    connectivity: String,
    from: String,
    fvonly: Boolean,
    id: String,
    latency: Double,
    location: String,
    median: TestRun,
    mobile: Double,
    plr: String,
    runs: StringDictionary[TestRun],
    standardDeviation: TestRun,
    successfulFVRuns: Double,
    summary: String,
    testUrl: String,
    tester: String,
    testerDNS: String,
    url: String
  ): TestResult = {
    val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], bwDown = bwDown.asInstanceOf[js.Any], bwUp = bwUp.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], connectivity = connectivity.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], fvonly = fvonly.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latency = latency.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], median = median.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], plr = plr.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any], standardDeviation = standardDeviation.asInstanceOf[js.Any], successfulFVRuns = successfulFVRuns.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], testUrl = testUrl.asInstanceOf[js.Any], tester = tester.asInstanceOf[js.Any], testerDNS = testerDNS.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
  @scala.inline
  implicit class TestResultOps[Self <: TestResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverage(value: TestRun): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBwDown(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bwDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBwUp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bwUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectivity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFvonly(value: Boolean): Self = {
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
    def withLatency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedian(value: TestRun): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("median")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuns(value: StringDictionary[TestRun]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandardDeviation(value: TestRun): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardDeviation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessfulFVRuns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successfulFVRuns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTester(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tester")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTesterDNS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testerDNS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

