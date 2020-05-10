package typingsSlinky.vsoNodeApi.projectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryLanguageAnalytics extends js.Object {
  var id: String = js.native
  var languageBreakdown: js.Array[LanguageStatistics] = js.native
  var name: String = js.native
  var resultPhase: ResultPhase = js.native
  var updatedTime: js.Date = js.native
}

object RepositoryLanguageAnalytics {
  @scala.inline
  def apply(
    id: String,
    languageBreakdown: js.Array[LanguageStatistics],
    name: String,
    resultPhase: ResultPhase,
    updatedTime: js.Date
  ): RepositoryLanguageAnalytics = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], languageBreakdown = languageBreakdown.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resultPhase = resultPhase.asInstanceOf[js.Any], updatedTime = updatedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryLanguageAnalytics]
  }
  @scala.inline
  implicit class RepositoryLanguageAnalyticsOps[Self <: RepositoryLanguageAnalytics] (val x: Self) extends AnyVal {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultPhase(value: ResultPhase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultPhase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

