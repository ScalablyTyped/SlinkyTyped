package typingsSlinky.vsoNodeApi.projectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectActivityMetrics extends js.Object {
  var authorsCount: Double = js.native
  var codeChangesCount: Double = js.native
  var codeChangesTrend: js.Array[CodeChangeTrendItem] = js.native
  var projectId: String = js.native
  var pullRequestsCompletedCount: Double = js.native
  var pullRequestsCreatedCount: Double = js.native
}

object ProjectActivityMetrics {
  @scala.inline
  def apply(
    authorsCount: Double,
    codeChangesCount: Double,
    codeChangesTrend: js.Array[CodeChangeTrendItem],
    projectId: String,
    pullRequestsCompletedCount: Double,
    pullRequestsCreatedCount: Double
  ): ProjectActivityMetrics = {
    val __obj = js.Dynamic.literal(authorsCount = authorsCount.asInstanceOf[js.Any], codeChangesCount = codeChangesCount.asInstanceOf[js.Any], codeChangesTrend = codeChangesTrend.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], pullRequestsCompletedCount = pullRequestsCompletedCount.asInstanceOf[js.Any], pullRequestsCreatedCount = pullRequestsCreatedCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectActivityMetrics]
  }
  @scala.inline
  implicit class ProjectActivityMetricsOps[Self <: ProjectActivityMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeChangesCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeChangesCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeChangesTrend(value: js.Array[CodeChangeTrendItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeChangesTrend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPullRequestsCompletedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestsCompletedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPullRequestsCreatedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullRequestsCreatedCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

