package typingsSlinky.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResultTrendFilter extends js.Object {
  var branchNames: js.Array[String] = js.native
  var buildCount: Double = js.native
  var definitionIds: js.Array[Double] = js.native
  var envDefinitionIds: js.Array[Double] = js.native
  var maxCompleteDate: js.Date = js.native
  var publishContext: String = js.native
  var testRunTitles: js.Array[String] = js.native
  var trendDays: Double = js.native
}

object TestResultTrendFilter {
  @scala.inline
  def apply(
    branchNames: js.Array[String],
    buildCount: Double,
    definitionIds: js.Array[Double],
    envDefinitionIds: js.Array[Double],
    maxCompleteDate: js.Date,
    publishContext: String,
    testRunTitles: js.Array[String],
    trendDays: Double
  ): TestResultTrendFilter = {
    val __obj = js.Dynamic.literal(branchNames = branchNames.asInstanceOf[js.Any], buildCount = buildCount.asInstanceOf[js.Any], definitionIds = definitionIds.asInstanceOf[js.Any], envDefinitionIds = envDefinitionIds.asInstanceOf[js.Any], maxCompleteDate = maxCompleteDate.asInstanceOf[js.Any], publishContext = publishContext.asInstanceOf[js.Any], testRunTitles = testRunTitles.asInstanceOf[js.Any], trendDays = trendDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResultTrendFilter]
  }
  @scala.inline
  implicit class TestResultTrendFilterOps[Self <: TestResultTrendFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranchNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitionIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvDefinitionIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envDefinitionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxCompleteDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCompleteDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublishContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestRunTitles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testRunTitles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrendDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trendDays")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

