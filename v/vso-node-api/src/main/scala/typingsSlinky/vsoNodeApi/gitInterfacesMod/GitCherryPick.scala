package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitCherryPick extends GitAsyncRefOperation {
  var cherryPickId: Double = js.native
}

object GitCherryPick {
  @scala.inline
  def apply(
    _links: js.Any,
    cherryPickId: Double,
    detailedStatus: GitAsyncRefOperationDetail,
    parameters: GitAsyncRefOperationParameters,
    status: GitAsyncOperationStatus,
    url: String
  ): GitCherryPick = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], cherryPickId = cherryPickId.asInstanceOf[js.Any], detailedStatus = detailedStatus.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCherryPick]
  }
  @scala.inline
  implicit class GitCherryPickOps[Self <: GitCherryPick] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCherryPickId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cherryPickId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

