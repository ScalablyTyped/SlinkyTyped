package typingsSlinky.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitAsyncRefOperation extends js.Object {
  var _links: js.Any = js.native
  var detailedStatus: GitAsyncRefOperationDetail = js.native
  var parameters: GitAsyncRefOperationParameters = js.native
  var status: GitAsyncOperationStatus = js.native
  /**
    * A URL that can be used to make further requests for status about the operation
    */
  var url: String = js.native
}

object GitAsyncRefOperation {
  @scala.inline
  def apply(
    _links: js.Any,
    detailedStatus: GitAsyncRefOperationDetail,
    parameters: GitAsyncRefOperationParameters,
    status: GitAsyncOperationStatus,
    url: String
  ): GitAsyncRefOperation = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], detailedStatus = detailedStatus.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitAsyncRefOperation]
  }
  @scala.inline
  implicit class GitAsyncRefOperationOps[Self <: GitAsyncRefOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_links(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetailedStatus(value: GitAsyncRefOperationDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailedStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: GitAsyncRefOperationParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: GitAsyncOperationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
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

