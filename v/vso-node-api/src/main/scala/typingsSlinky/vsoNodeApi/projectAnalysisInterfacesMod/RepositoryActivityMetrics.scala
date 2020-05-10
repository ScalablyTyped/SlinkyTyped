package typingsSlinky.vsoNodeApi.projectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryActivityMetrics extends js.Object {
  var codeChangesCount: Double = js.native
  var codeChangesTrend: js.Array[CodeChangeTrendItem] = js.native
  var repositoryId: String = js.native
}

object RepositoryActivityMetrics {
  @scala.inline
  def apply(codeChangesCount: Double, codeChangesTrend: js.Array[CodeChangeTrendItem], repositoryId: String): RepositoryActivityMetrics = {
    val __obj = js.Dynamic.literal(codeChangesCount = codeChangesCount.asInstanceOf[js.Any], codeChangesTrend = codeChangesTrend.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryActivityMetrics]
  }
  @scala.inline
  implicit class RepositoryActivityMetricsOps[Self <: RepositoryActivityMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withRepositoryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

