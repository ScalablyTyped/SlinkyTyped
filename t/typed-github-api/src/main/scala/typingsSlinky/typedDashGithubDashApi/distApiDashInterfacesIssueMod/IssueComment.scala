package typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesIssueMod

import typingsSlinky.typedDashGithubDashApi.distApiDashInterfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueComment extends js.Object {
  var body: String
  var created_at: js.Date
  var html_url: String
  var id: Double
  var updated_at: js.Date
  var url: String
  var user: UserSummary
}

object IssueComment {
  @scala.inline
  def apply(
    body: String,
    created_at: js.Date,
    html_url: String,
    id: Double,
    updated_at: js.Date,
    url: String,
    user: UserSummary
  ): IssueComment = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssueComment]
  }
}

