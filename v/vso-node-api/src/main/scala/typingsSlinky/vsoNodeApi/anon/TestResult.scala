package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResult extends js.Object {
  var all: scala.Double = js.native
  var none: scala.Double = js.native
  var system: scala.Double = js.native
  var testResult: scala.Double = js.native
  var testRun: scala.Double = js.native
}

object TestResult {
  @scala.inline
  def apply(
    all: scala.Double,
    none: scala.Double,
    system: scala.Double,
    testResult: scala.Double,
    testRun: scala.Double
  ): TestResult = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], testResult = testResult.asInstanceOf[js.Any], testRun = testRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
  @scala.inline
  implicit class TestResultOps[Self <: TestResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystem(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestResult(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestRun(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testRun")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

