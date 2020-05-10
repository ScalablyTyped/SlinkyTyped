package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRunCoverage extends js.Object {
  var lastError: String = js.native
  var modules: js.Array[ModuleCoverage] = js.native
  var state: String = js.native
  var testRun: ShallowReference = js.native
}

object TestRunCoverage {
  @scala.inline
  def apply(lastError: String, modules: js.Array[ModuleCoverage], state: String, testRun: ShallowReference): TestRunCoverage = {
    val __obj = js.Dynamic.literal(lastError = lastError.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], testRun = testRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRunCoverage]
  }
  @scala.inline
  implicit class TestRunCoverageOps[Self <: TestRunCoverage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModules(value: js.Array[ModuleCoverage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestRun(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testRun")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

