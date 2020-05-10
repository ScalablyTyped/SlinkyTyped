package typingsSlinky.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnvironments extends js.Object {
  var details: Double = js.native
  var environments: Double = js.native
  var issues: Double = js.native
  var releaseInfo: Double = js.native
  var testResults: Double = js.native
  var workItems: Double = js.native
}

object AnonEnvironments {
  @scala.inline
  def apply(
    details: Double,
    environments: Double,
    issues: Double,
    releaseInfo: Double,
    testResults: Double,
    workItems: Double
  ): AnonEnvironments = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], releaseInfo = releaseInfo.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any], workItems = workItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnvironments]
  }
  @scala.inline
  implicit class AnonEnvironmentsOps[Self <: AnonEnvironments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnvironments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssues(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReleaseInfo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTestResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

