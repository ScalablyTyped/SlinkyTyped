package typingsSlinky.vsoNodeApi.projectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectLanguageAnalytics extends js.Object {
  var id: String = js.native
  var languageBreakdown: js.Array[LanguageStatistics] = js.native
  var repositoryLanguageAnalytics: js.Array[RepositoryLanguageAnalytics] = js.native
  var resultPhase: ResultPhase = js.native
  var url: String = js.native
}

object ProjectLanguageAnalytics {
  @scala.inline
  def apply(
    id: String,
    languageBreakdown: js.Array[LanguageStatistics],
    repositoryLanguageAnalytics: js.Array[RepositoryLanguageAnalytics],
    resultPhase: ResultPhase,
    url: String
  ): ProjectLanguageAnalytics = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], languageBreakdown = languageBreakdown.asInstanceOf[js.Any], repositoryLanguageAnalytics = repositoryLanguageAnalytics.asInstanceOf[js.Any], resultPhase = resultPhase.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectLanguageAnalytics]
  }
  @scala.inline
  implicit class ProjectLanguageAnalyticsOps[Self <: ProjectLanguageAnalytics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageBreakdown(value: js.Array[LanguageStatistics]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageBreakdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepositoryLanguageAnalytics(value: js.Array[RepositoryLanguageAnalytics]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryLanguageAnalytics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultPhase(value: ResultPhase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultPhase")(value.asInstanceOf[js.Any])
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

