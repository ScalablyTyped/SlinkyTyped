package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRunStatistic extends js.Object {
  var run: ShallowReference = js.native
  var runStatistics: js.Array[RunStatistic] = js.native
}

object TestRunStatistic {
  @scala.inline
  def apply(run: ShallowReference, runStatistics: js.Array[RunStatistic]): TestRunStatistic = {
    val __obj = js.Dynamic.literal(run = run.asInstanceOf[js.Any], runStatistics = runStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRunStatistic]
  }
  @scala.inline
  implicit class TestRunStatisticOps[Self <: TestRunStatistic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRun(value: ShallowReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRunStatistics(value: js.Array[RunStatistic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runStatistics")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

