package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTestResult extends js.Object {
  var all: Double = js.native
  var none: Double = js.native
  var system: Double = js.native
  var testResult: Double = js.native
  var testRun: Double = js.native
}

object AnonTestResult {
  @scala.inline
  def apply(all: Double, none: Double, system: Double, testResult: Double, testRun: Double): AnonTestResult = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], testResult = testResult.asInstanceOf[js.Any], testRun = testRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTestResult]
  }
  @scala.inline
  implicit class AnonTestResultOps[Self <: AnonTestResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestResult(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestRun(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testRun")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

