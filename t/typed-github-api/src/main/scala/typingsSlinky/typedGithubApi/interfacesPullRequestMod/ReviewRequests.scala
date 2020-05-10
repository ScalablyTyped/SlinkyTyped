package typingsSlinky.typedGithubApi.interfacesPullRequestMod

import typingsSlinky.typedGithubApi.interfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewRequests extends js.Object {
  var teams: js.Array[Team] = js.native
  var users: js.Array[UserSummary] = js.native
}

object ReviewRequests {
  @scala.inline
  def apply(teams: js.Array[Team], users: js.Array[UserSummary]): ReviewRequests = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewRequests]
  }
  @scala.inline
  implicit class ReviewRequestsOps[Self <: ReviewRequests] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTeams(value: js.Array[Team]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[UserSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("users")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

