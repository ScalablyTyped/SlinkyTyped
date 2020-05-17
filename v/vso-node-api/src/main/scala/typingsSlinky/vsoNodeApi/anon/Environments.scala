package typingsSlinky.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environments extends js.Object {
  var details: scala.Double = js.native
  var environments: scala.Double = js.native
  var issues: scala.Double = js.native
  var releaseInfo: scala.Double = js.native
  var testResults: scala.Double = js.native
  var workItems: scala.Double = js.native
}

object Environments {
  @scala.inline
  def apply(
    details: scala.Double,
    environments: scala.Double,
    issues: scala.Double,
    releaseInfo: scala.Double,
    testResults: scala.Double,
    workItems: scala.Double
  ): Environments = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], releaseInfo = releaseInfo.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environments]
  }
  @scala.inline
  implicit class EnvironmentsOps[Self <: Environments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironments(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssues(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseInfo(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestResults(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItems(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

